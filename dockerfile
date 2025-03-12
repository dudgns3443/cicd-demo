FROM openjdk:21-slim

# set the working directory
WORKDIR /app

# copy .jar file to docker
COPY ./build/libs/*.jar /app.jar

# always do command
CMD ["java", "-jar", "/app.jar"]
