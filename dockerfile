FROM openjdk:21-alpine

# set the working directory
WORKDIR /app

# copy .jar file to docker
COPY ./build/libs/*.jar app.jar

# always do command
ENTRYPOINT ["java", "-jar", "app.jar"]
