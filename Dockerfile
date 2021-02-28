FROM openjdk:15

COPY ./target/sandbox-1.0-SNAPSHOT.jar /usr/src/sandbox/
WORKDIR /usr/src/sandbox

ENTRYPOINT ["java", "-jar", "sandbox-1.0-SNAPSHOT.jar"]