FROM openjdk:17

LABEL maintainer="Hero"

COPY target/sbapp.jar /usr/app/

WORKDIR /usr/app/

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "sbapp.jar"]
