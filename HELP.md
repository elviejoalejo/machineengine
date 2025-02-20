
### Commands
Commands below must be executed via CMD, these are not compatible with powershell.

Compile and run application
* .\mvnw package && java -jar .\target\machineengine-0.0.1-SNAPSHOT.jar

Build a container.
* docker build -t elviejoalejo/machineengine-0.0.1 .

Run container.
* docker run -p 8080:8080 elviejoalejo/machineengine-0.0.1

Push container
docker push elviejoalejo/machineengine-0.0.1