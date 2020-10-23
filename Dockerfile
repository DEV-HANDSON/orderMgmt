# To Run the docker build use the following
# docker build -f <docker file name> -t <target name> .
# docker build -f Dockerfile -t docker-eureka .
FROM openjdk:8
RUN mkdir -p /var/java
WORKDIR /var/java
ADD target/order-mgmt.jar  /var/java/order-mgmt.jar
ENV PROFILE="dev"
ENV PORT  8061
EXPOSE $PORT
ENTRYPOINT [ "java", "-jar", "order-mgmt.jar"]