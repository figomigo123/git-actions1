FROM openjdk:17
EXPOSE 8080
ADD target/spring-git-actions1.jar spring-git-actions1.jar
ENTRYPOINT ["java","-jar","/spring-git-actions1.jar"]