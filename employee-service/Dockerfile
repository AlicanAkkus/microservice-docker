FROM openjdk:11-jre-slim-sid

WORKDIR /home/app
COPY target/employee-service-0.0.1-SNAPSHOT.jar employee-service.jar

CMD java -jar employee-service.jar