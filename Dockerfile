FROM openjdk
EXPOSE 8081
ADD target/spring-jenkins-service.war spring-jenkins-service.war
ENTRYPOINT ["java","-war","/spring-jenkins-service.war"]