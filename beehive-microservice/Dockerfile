FROM java:8
VOLUME /tmp
ADD build/libs/beehive-microservice.jar beehive-microservice.jar
RUN bash -c 'touch /beehive-microservice.jar'
EXPOSE 8080
ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://mongodb/beehive_management", "-Djava.security.egd=file:/dev/./urandom","-jar","/beehive-microservice.jar"]
