# BookMyDent
BookMyDent is a microservices based Application which allow customers to book their dental services online and customers can interreact with other customers who already had treatment. customers can view reviews. BookMyDent platform helps customers to choose high-quality clinics.

# Tech Stack
Java 
Spring Boot
MongoDB
Mysql
Junit
JWT
Oauth2
Apache Kafka
ELK
Postman

# Microservices
CustomerService (Responsible to handle customer requests)
MainAdmin Service (Responsible to add services and onboard clinics and clinc admins)
ClinicAdmin Service (manage data related to clinic)
Doctor Service (dedicated application for doctor to view patient details)
Category Service (it manages all dental services)
Appointment Service (it manages appointment related data)
Notification Service (responsible to handle notifications)
Eureka Server (Service Discovery)
Api Gateway (Gateway between client to server and server to server)

# Features
Book Dental services online
view available clinics
Select Doctor and Doctor slot
View appointment history
Push Notifications

# Prerequisites
Before running project, make sure you have Oauth2 credentials and the followed installed
Java 17+
KeyCloak
Apache Kafka
Firebase project(firebase json key)
ELK(for centralized logging monitoring)

# Installation
clone repository:
clone https://github.com/shravankumarkomma227/BookMyDent.git
run on STS


