FROM openjdk:8-jdk-alpine

COPY target/one-app-1.0-SNAPSHOT.war one-app.war

EXPOSE 8087/tcp

ENTRYPOINT ["java", "-jar","-Dspring.profiles.active=dev","/one-app.war"]