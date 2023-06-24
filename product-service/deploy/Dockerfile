FROM openjdk:17.0.7-jdk

EXPOSE 80
EXPOSE 8888
EXPOSE 8761
EXPOSE 8081
EXPOSE 9092

WORKDIR /product-service
COPY ./target/. .

ENTRYPOINT ["java","-jar","product-service-1.0.jar"]