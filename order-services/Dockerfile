FROM java:8-jre-alpine

ENV SERVER_PORT 8080

VOLUME /tmp
ARG JAR_FILE
ARG PROFILE
ADD ${JAR_FILE} app.jar


ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]