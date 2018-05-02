#!/bin/bash

echo "building app1 docker image"
cd app1
mvn package docker:build
cd ..

echo "building app2 docker image"
cd app2
mvn package docker:build
cd ..

echo "building app3 docker image"
cd app3
mvn package docker:build
cd ..

echo "building eureka docker image"
cd eureka
mvn package docker:build
cd ..

<<<<<<< HEAD
echo "building zuul docker image"
cd zuul
mvn package docker:build
cd ..



echo "You are ready to start docker-compose: docker-compose up"

=======
echo "You are ready to start docker-compose: docker-compose up"
>>>>>>> 724284840acf49c022afc40adc90f77e633d5853
