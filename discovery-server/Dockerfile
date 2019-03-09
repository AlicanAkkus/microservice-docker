FROM openjdk:11-jre-slim-sid

WORKDIR /home/app
COPY target/discovery-server-0.0.1-SNAPSHOT.jar discovery-server.jar

CMD java -jar discovery-server.jar