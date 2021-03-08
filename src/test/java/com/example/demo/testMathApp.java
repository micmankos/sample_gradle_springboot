package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class testMathApp {

    @Test
    public void testAdd(){
        MathApp app = new MathApp();
        CalculatorService service = mock(CalculatorService.class);
        app.setService(service);

        when(service.add(100, 200)).thenReturn(300);
        assertEquals(app.add(100, 200), 300);
    }
}
