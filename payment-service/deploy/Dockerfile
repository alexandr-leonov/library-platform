FROM openjdk:17.0.7-jdk

EXPOSE 80
EXPOSE 8888
EXPOSE 8761
EXPOSE 8083
EXPOSE 9092

WORKDIR /payment-service
COPY ./target/. .

ENTRYPOINT ["java","-jar","payment-service-1.0.jar"]