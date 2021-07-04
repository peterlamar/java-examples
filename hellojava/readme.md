# Hello World Java

Basic hello world java.

1. Generate project

```
mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```

2. Build

```
mvn package
```


3. Trigger class

```
java -cp target/hellojava-1.0-SNAPSHOT.jar com.mycompany.app.App
```

OR

1. 
```
cd src/main/java/com/mycompany/app
```
1.
```
java App.java
```

### References

https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html


