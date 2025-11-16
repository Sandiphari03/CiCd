# Use Java 17 base image
FROM eclipse-temurin:17-jdk

# Expose application port
EXPOSE 8080

# Copy jar file from target directory
ADD target/springboot-github-cicd.jar springboot-github-cicd.jar

# Run the Spring Boot application
ENTRYPOINT ["java","-jar","/springboot-github-cicd.jar"]
