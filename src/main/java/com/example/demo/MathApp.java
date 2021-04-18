package com.example.demo;

public class MathApp {

    private CalculatorService calcService;

    public void setService(CalculatorService calcService){
        this.calcService = calcService;
    }

    public int add(int a, int b){
        return calcService.add(a,b);
    }
}
