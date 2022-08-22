# greentea-worksheet

A Scala console augmented by GreenTea

# Usage

`tutos/whitePaper_GreenTea.pdf` presente une vue d'ensemble des fonctionalités actuelles et en cours d'intégration.

`tutos/0_normes-interpreteurs-modalites.md` introduit les concepts les plus centraux

`/src/main/scala/*` presente les différentes fonctionalités gravitant autours de ces concepts centraux à travers une série de feuilles de code commentés.  Chaque tuto à été pensé pour être didactique et essentialiste. Un éditeur markdown sera plus agréable. (NB : des pdfs sont en cours de production)

Ce dépôt fournit un environnement scala augmenté par GreenTea permettant ainsi de tester par vous même les commandes décrite dans les tutoriels où celles qui vous interesse. a méthode préférée est pour l'instant Docker, mais une solution SAAS est en cours d'intégration.

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

- `console` va lancer un REPL qui va vous permettre d'entrez des commandes (typiquement celle des tutos) et de visualiser les types des objets. Vous terminer une session avec `:quit`
- `run` va vous permettre d'executer une définition annoter par `@main` Chaque tuto en contient une. Vous pouvez aussi écrire la votre.

VOus pouvez supprimer l'image du container docker comme ceci:
> docker rm greentea && docker rmi greenteacloud/greentea_worksheet


## Local depuis ce dépôt

Le build.sbt de ce repertoire est configurer pour lancer GreenTea en console sbt.

1. Installer sbt (et possiblement java) voir :
> https://www.scala-sbt.org/1.x/docs/Setup.html
2. Cloner ce repertoire
3. Vous placer dedans et entrer
```
$ sbt
```

## Dans votre projet

Ajouter a votre build.sbt :

```scala
resolvers := Resolver.sonatypeOssRepos("snapshots"),
libraryDependencies += "cloud.greentea" %% "greentea" % "3.0.0-SNAPSHOT"
```
