FROM openjdk
FROM openjdk:8
EXPOSE 9000
ADD target/myservices.jar myservices.jar
ENTRYPOINT ["java","-jar","myservices.jar"]