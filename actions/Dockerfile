# Use a base image with Java 17
FROM openjdk:17-jdk-alpine

# Add Maintainer Info
LABEL maintainer=""

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8089 available to the world outside this container
EXPOSE 8089

# The application's jar file
ARG JAR_FILE=target/actions-0.0.1-SNAPSHOT.jar

COPY target/actions-0.0.1-SNAPSHOT.jar actions.jar

# Add the application's jar to the container
ADD ${JAR_FILE} actions.jar

# Run the jar file 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/actions.jar"]