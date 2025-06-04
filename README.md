# Spring-boot-Microservices
Spring boot Microservices with SAGA design Pattern, Apache Kafka

Steps to Run:
Goto you class path   "/Microservices/order-service"
mvn clean package

Goto you class path "/Microservices/notification-service"
mvn clean package

cd /yourfilepath/Microservices
docker-compose up --build
