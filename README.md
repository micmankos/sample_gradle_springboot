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

Note that I added below to the `build.gradle` file to get the webserver to stay running
```
implementation 'org.springframework.boot:spring-boot-starter-web'
```

