FROM openjdk:21-jdk
COPY app.jar /app/w24Backend-0.0.1-SNAPSHOT.jar
WORKDIR /app
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]