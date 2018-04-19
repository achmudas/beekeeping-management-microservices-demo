FROM java:8
VOLUME /tmp
ADD build/libs/treatments-microservice.jar treatments-microservice.jar
RUN bash -c 'touch /treatments-microservice.jar'
EXPOSE 8080
ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://mongodb/beehive_management", "-Djava.security.egd=file:/dev/./urandom","-jar","/treatments-microservice.jar"]
