
### Dev Environment 

- Apache JMeter 5.6.3
- JDK v21
- Spring Boot v3.4.2
- Docker version 27.5.1, build 9f9e405
- Docker Desktop

### Commands
Commands below must be executed via CMD, these are not compatible with powershell.

run application
java -jar .\target\machineengine-0.0.1-SNAPSHOT.jar

Compile 
* .\mvnw package

Build a container.
* docker build -t elviejoalejo/machineengine-0.0.1 .

Run container.
* docker run -p 8080:8080 elviejoalejo/machineengine-0.0.1

Push container
docker push elviejoalejo/machineengine-0.0.1