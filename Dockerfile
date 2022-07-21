FROM openjdk:11
ADD target/springboot-0.0.1-SNAPSHOT.jar springboot-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "springboot-0.0.1-SNAPSHOT.jar"]