### Bag of task
    Utilisation du pattern bag of task avec java rmi pour créer un système où un client peut vérifier si un nombre aléatoire est pair ou impair via un serveur distant.
## Strucure 
# Compute : 
    Interface qui définit les méthodes pour obtenir une tâche (getask) et pour l'exécuter (run).
# ComputeImpl :
 Classe serveur qui génère une tâche aléatoire de vérification de parité et exécute la tâche pour dire si le nombre est pair ou impair.
# Task :
 Interface pour définir une tâche exécutable.
# Parite :
 Classe qui représente une tâche de vérification de parité (vérifie si un nombre est pair).
# Client :
 Classe client qui se connecte au serveur pour exécuter une tâche de vérification de parité et afficher le résultat.
### Utilisation
## Compilation et lancement du serveur
# Compilation du code du server:
javac helloImpl.java

# Génération stub et skeleton:
rmic helloImpl
# Démarrage du reférentiel d'interface:
rmiregistry &
# Compilation et lancement du serveur:
javac serveur.java
java serveur

## Compilation et lancement du client dans un autre terminale 

javac client.java
java client