# sample_gradle_springboot

```sh
# from top level directory, create a gradle wrapper
gradle wrapper

# assuming your build.gradle uses the jar plugin, you should be able to run the following tasks

# build with below
# this will generate a jar file under build/libs/
./gradlew build

# run tests with
./gradlew test

# run jar with
java -jar build/libs/<jar_file>.jar

# clean build dir with 
gradle clean
```

## Notes
For `./gradlew build`, make sure you specify a main entry point [like here](https://stackoverflow.com/a/32567525/12334685)
```
jar {
  manifest {
    attributes(
      'Class-Path': configurations.compile.collect { it.getName() }.join(' '),
      'Main-Class': '<java_package>.<class_with_Main_method>'
    )
  }
}
```

Note that I added below to the `build.gradle` file to get the webserver to stay running
```
implementation 'org.springframework.boot:spring-boot-starter-web'
```

I saw that my endpoints weren't being picked up. I had to create my endpoints under the same package as my main method class. I added `controller/EndPoints.java` to `com.example.demo.` See the following links for more details.
- https://stackoverflow.com/a/45521065/12334685
- https://smarterco.de/java-spring-boot-mvc-ontroller-not-called/

### Some sample requests:
```sh
curl localhost:8080/testing

curl -X POST localhost:8080/postTest -d 'username=yourusername&password=yourpassword'
```
