FROM openjdk:11

COPY target/dockerproj-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app/

EXPOSE 8080

ENTRYPOINT [ "java","-jar", "dockerproj-0.0.1-SNAPSHOT.jar" ]

