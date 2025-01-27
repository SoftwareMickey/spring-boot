FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY build/libs/vector-0.0.1-SNAPSHOT.jar /app/vector-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/vector-0.0.1-SNAPSHOT.jar"]