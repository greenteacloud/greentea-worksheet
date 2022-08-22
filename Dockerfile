FROM  archlinux

RUN pacman -Sy --noconfirm sbt jdk17-openjdk jre17-openjdk-headless

COPY build.sbt-docker build.sbt

RUN sbt -Dsbt.rootdir=true compile

CMD ["sbt", "-Dsbt.rootdir=true"]

#docker login
#docker tag greentea:latest greenteacloud/greentea_worksheet:latest
#docker push greenteacloud/greentea_worksheet:latest
