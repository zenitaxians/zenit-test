FROM openjdk:20
ARG JAR_FILE=target/*.jar
#we copy our jar file into docker image
COPY target/zenit-test-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar", "app.jar"]