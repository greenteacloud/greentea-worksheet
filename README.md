# greentea-worksheet
A Scala console augmented by GreenTea

# Usage

GreenTea.Cloud propose plusieurs canaux de distribution.

## Docker

>  docker run -it greenteacloud/greentea_worksheet:latest

## Local depuis ce dépôt

Le build.sbt de ce repertoire est configurer pour lancer GreenTea en console sbt.

1. Installer sbt (et possiblement java) voir :
> https://www.scala-sbt.org/1.x/docs/Setup.html
2. Cloner ce repertoire
3. Vous placer dedans et entrer
> sbt console

## Dans votre projet

Ajouter a votre build.sbt :

>   resolvers += Resolver.sonatypeOssRepos("snapshots"),
>  libraryDependencies += "cloud.greentea" %% "greentea" % "3.0.0-SNAPSHOT"
