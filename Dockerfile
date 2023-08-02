FROM maven:3.9.1-eclipse-temurin-20 as build
WORKDIR /app
COPY target/postService-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
CMD ["java", "-jar", "postService-0.0.1-SNAPSHOT.jar"]

