#P147 03 Dockerfile - Preenchendo e entendendo na prática
FROM eclipse-temurin:17

LABEL maintainer="contato@java10x.dev"

WORKDIR /app

COPY target/Java10xDocker-0.0.1-SNAPSHOT.jar /app/aula-docker.jar

ENTRYPOINT ["java", "-jar", "aula-docker.jar"]

EXPOSE 8080

#P148 04 docker build - Transformando a aplicação em uma imagem
# docker build -t imagem-docker-aula:0.0.1-RELEASE .

#P149 05 docker run - Como executar e criar containers
# docker run -d -p 8080:8080 imagem-docker-aula:0.0.1-RELEASE

# docker ps -a
# docker rm
# docker rm 67a2f083b0dd

#P151 07 docker push - Mandando sua imagem para o Docker Hub
# docker tag imagem-docker-aula:0.0.1-RELEASE enzookuizumi/primeira-imagem-docker-app:0.0.1-RELEASE
# docker login
# docker push enzookuizumi/primeira-imagem-docker-app:0.0.1-RELEASE
# docker images

#P150 06 docker pull - E quando eu quiser usar uma imagem?
# docker pull enzookuizumi/primeira-imagem-docker-app:0.0.1-RELEASE

# docker pull mysql
# docker run --name mysql-container2 -e MYSQL_ROOT_PASSWORD=123 -e MYSQL_DATABASE=dbexemplo -d mysql:latest
# docker stop a627



