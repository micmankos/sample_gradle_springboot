# sample_gradle_springboot

```sh
# build with below
# this will generate a jar file under build/libs/
gradle build

# run tests with
grade test

# run jar with
java -jar build/libs/<jar_file>.jar

# clean build dir with 
gradle clean
```

## Notes
Note that I added below to the `build.gradle` file to get the webserver to stay running
```
implementation 'org.springframework.boot:spring-boot-starter-web'
```

I saw that my endpoints weren't being picked up. I had to create my endpoints under the same package as my main method class. I added `controller/EndPoints.java` to `com.example.demo.` See the following links for more details.
- https://stackoverflow.com/a/45521065/12334685
- https://smarterco.de/java-spring-boot-mvc-ontroller-not-called/