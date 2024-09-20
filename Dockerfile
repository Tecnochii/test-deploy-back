FROM gradle:8.10-jdk17-alpine

COPY . .

RUN gradle build

EXPOSE 8080

ENTRYPOINT ["java","-jar","build/libs/demo-0.0.1-SNAPSHOT.jar"]