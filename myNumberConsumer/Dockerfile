FROM openjdk:19
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} myNumberConsumerAppThree.jar
ENTRYPOINT ["java","-jar","/myNumberConsumerAppThree.jar"]