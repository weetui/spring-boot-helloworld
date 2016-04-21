#
# DOCKER-VERSION    1.8.2
#
# Dockerizing ryserver: Dockerfile for building ryserver images
#
#FROM       @docker.image.prefix@/tomcat-onbuild:8.0.31
FROM 		@docker.image.prefix@/jdk:1.8

MAINTAINER Louis,Z.Z.Yong <louis@renyanmail.com>

ENV RELEASE_WORKDIR /opt/release


#ENV IMAGENAME ${docker.registry}/renyan/${project.artifactId}/${ry.environment}/${project.artifactId}:${project.version}-${git.commit.id.abbrev}

#COPY ${project.artifactId}-${project.version}-${git.commit.id.abbrev}.war $RELEASE_WORKDIR
#for centos
#RUN yum -y install unzip && \
    #cd $RELEASE_WORKDIR && \
    #unzip -oq ${project.artifactId}-${project.version}-${git.commit.id.abbrev}.war -d ${project.artifactId}
   
#for alpine
#RUN apk update && apk upgrade \

RUN mkdir $RELEASE_WORKDIR && cd $RELEASE_WORKDIR

ADD @project.artifactId@-@project.version@-@git.commit.id.abbrev@.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]

#&&apk add unzip \
#RUN cd $RELEASE_WORKDIR && mkdir @project.artifactId@ && cd @project.artifactId@ \
 # && java -jar $RELEASE_WORKDIR/@project.artifactId@-@project.version@-@git.commit.id.abbrev@.jar 


