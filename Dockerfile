FROM nelson9291/jdk-17:1.0.0
COPY /target/k8s-0.0.1-SNAPSHOT.jar /k8s.jar
ENTRYPOINT ["java","-jar","/k8s.jar"]