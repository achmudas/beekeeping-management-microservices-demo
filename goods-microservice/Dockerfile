FROM java:8
VOLUME /tmp
ADD build/libs/goods-microservice.jar goods-microservice.jar
RUN bash -c 'touch /goods-microservice.jar'
EXPOSE 8080
ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://mongodb/beehive_management", "-Djava.security.egd=file:/dev/./urandom","-jar","/goods-microservice.jar"]
