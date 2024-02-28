FROM openjdk
EXPOSE 9191
ADD "target/cicd-demo.jar" "cicd-demo.jar"
ENTRYPOINT ["java", "-jar", "cicd-demo.jar"]