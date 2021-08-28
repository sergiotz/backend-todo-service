FROM eclipse-temurin:11
RUN mkdir /opt/app
ARG JAR_FILE
COPY ${JAR_FILE} /opt/app/app.jar
ENTRYPOINT ["java", "-jar", "/opt/app/app.jar"]