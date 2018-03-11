FROM java:8-jre-alpine

VOLUME /tmp

ARG SERVER_PORT

ARG JAR_FILE
ARG PROFILE
ADD ${JAR_FILE} app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]