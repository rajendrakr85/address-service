FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
ADD target/AddressService-0.0.1-SNAPSHOT.jar AddressService.jar
ENTRYPOINT ["java","-jar","/AddressService.jar"]