# greentea-worksheet

A Scala console augmented by GreenTea

# Usage

`tutos/whitePaper_GreenTea.pdf` presente une vue d'ensemble des fonctionalités actuelles et en cours d'intégration.

`tutos/0_normes-interpreteurs-modalites.md` introduit les concepts les plus centraux

`/src/main/scala/*` presente les différentes fonctionalités gravitant autours de ces concepts centraux à travers une série de feuilles de code commenté.  Chaque tuto a été pensé pour être didactique et essentialiste.

Ce dépôt fournit un environnement Scala augmenté par GreenTea permettant ainsi de tester par vous même les commandes décrites dans les tutoriels ou celles qui vous interesse. La méthode préférée est pour l'instant Docker, mais une solution SAAS est en cours d'intégration.

# Installation

GreenTea.Cloud propose plusieurs canaux de distribution.

## Scastie

Scastie permet de tester GreenTea en ligne depuis votre navigateur.

TODO

## Docker

```
docker run -it  --name greentea greenteacloud/greentea_worksheet:latest
```

Une fois lancé vous obtiendrez l'invite de commande `sbt`
Deux commandes sont d'intérêt:

- `console` va lancer un REPL qui va vous permettre d'entrer des commandes (typiquement celles des tutos) et de visualiser les types des objets. Vous terminez une session avec `:quit` (voir `:help`)
- `run` va vous permettre d'executer une définition annotée par `@main` Chaque tuto en contient une. Vous pouvez aussi écrire la votre au sein d'un fichier Scala situé dans `/src/main/scala/*`.

Vous pouvez supprimer l'image du container docker comme ceci:
> docker rm greentea && docker rmi greenteacloud/greentea_worksheet


## Local depuis ce dépôt

Le build.sbt de ce repertoire est configuré pour lancer GreenTea en console sbt.

1. Installer sbt (et possiblement java) voir :
> https://www.scala-sbt.org/1.x/docs/Setup.html
2. Cloner ce repertoire
3. Vous placer dedans et entrer:
```
$ sbt
```

## Dans votre projet

Ajouter à votre build.sbt :

```scala
resolvers := Resolver.sonatypeOssRepos("snapshots"),
libraryDependencies += "cloud.greentea" %% "greentea" % "3.0.0-SNAPSHOT"
```
