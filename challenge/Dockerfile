FROM maven:3.8.4-openjdk-17 AS build

WORKDIR /app

COPY ./pom.xml ./pom.xml
COPY ./src ./src

EXPOSE 8080

# Run spring boot
CMD ["mvn", "spring-boot:run"]