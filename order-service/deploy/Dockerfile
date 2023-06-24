FROM openjdk:17.0.7-jdk

EXPOSE 80
EXPOSE 8888
EXPOSE 8761
EXPOSE 8084
EXPOSE 9092

WORKDIR /order-service
COPY ./target/. .

ENTRYPOINT ["java","-jar","order-service-1.0.jar"]