FROM openjdk:19
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} myNumberProducerAppThree.jar
ENTRYPOINT ["java","-jar","/myNumberProducerAppThree.jar"]