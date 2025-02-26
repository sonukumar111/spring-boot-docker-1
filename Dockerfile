FROM openjdk:17-jdk
WORKDIR /springboot/demo/app
EXPOSE 8081
COPY target/boot-git-to-jenkins-docker-image.jar boot-git-to-jenkins-docker-image.jar
ENTRYPOINT [ "java","-jar","boot-git-to-jenkins-docker-image.jar" ]