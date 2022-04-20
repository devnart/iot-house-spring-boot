FROM openjdk:11
EXPOSE 8080
ADD target/iot.jar iot.jar
ENTRYPOINT ["java","-jar","/iot.jar"]