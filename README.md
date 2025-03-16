# Gestion-des-consultations
Ce projet est une application de gestion pour un cabinet médical, permettant aux médecins d'ajouter des consultations et aux patients de consulter leurs informations via un numéro de référence. L'application utilise Spring Boot, Thymeleaf, MySQL pour le back-end et Lombok pour simplifier le code.

## Table des matières
1. [Technologies utilisées](#technologies-utilisées)
2. [Prérequis](#prérequis)
3. [Installation](#installation)
4. [Configuration de la base de données](#configuration-de-la-base-de-données)
5. [Fonctionnalités principales](#fonctionnalités-principales)
6. [Structure du projet](#structure-du-projet)
7. [Tests](#tests)
8. [Contribution](#contribution)
9. [Licence](#licence)

## Technologies utilisées

- **Spring Boot** : Framework Java pour la création d'applications web et de services RESTful, facilitant la configuration et le développement rapide.
- **Spring Data JPA** : Pour la gestion de la persistance des données via l'API JPA, avec Hibernate comme implémentation.
- **Thymeleaf** : Moteur de templates Java pour la génération de vues HTML côté serveur.
- **MySQL** : Base de données relationnelle pour stocker les données des médecins, patients et consultations.
- **Lombok** : Réduit le code boilerplate en générant automatiquement des méthodes comme les getters, setters, constructeurs et autres fonctions.
- **Maven** : Outil de gestion de projet et d'automatisation de la compilation.

## Prérequis

Avant de commencer, assurez-vous d'avoir installé et configuré les outils suivants :

- **JDK 21** ou une version supérieure (téléchargez-le depuis [Oracle JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)).
- **MySQL** (téléchargez-le depuis [MySQL Downloads](https://dev.mysql.com/downloads/)).
- **Maven** (téléchargez-le depuis [Maven Downloads](https://maven.apache.org/download.cgi)).

## Installation

Suivez ces étapes pour cloner le projet et le configurer sur votre machine locale.

### 1. Clonez le repository

Clonez le repository GitHub sur votre machine locale en utilisant la commande suivante :

```bash
git clone https://github.com/votre-utilisateur/cabinet-medical.git
cd cabinet-medical

2. Configuration de la base de données
Créez la base de données
Avant de démarrer l'application, vous devez créer une base de données MySQL. Utilisez la commande suivante dans votre client MySQL :

CREATE DATABASE cabinet_medical;

Configurez l'accès à la base de données
Dans le fichier src/main/resources/application.properties, configurez les paramètres de connexion à la base de données MySQL :

# Paramètres de la base de données MySQL
spring.datasource.url=jdbc:mysql://localhost:3306/cabinet_medical
spring.datasource.username=your-username
spring.datasource.password=your-password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
Assurez-vous de remplacer your-username et your-password par vos informations de connexion à MySQL.

3. Lancez l'application
Pour démarrer l'application, utilisez Maven pour exécuter la commande suivante :

mvn spring-boot:run
L'application sera disponible à l'adresse suivante dans votre navigateur : http://localhost:8080.

Configuration de la base de données
La base de données MySQL est utilisée pour stocker toutes les informations relatives aux consultations, aux médecins et aux patients. Voici la structure des principales entités dans la base de données :

Médecins : Stocke les informations relatives aux médecins (nom, spécialité, etc.).
Patients : Contient les informations des patients (nom, prénom, date de naissance, etc.).
Consultations : Enregistre les consultations, associées à un médecin et à un patient, avec un numéro de référence unique.
La configuration de la base de données est gérée via application.properties, ce qui permet une intégration facile et flexible avec MySQL.

Fonctionnalités principales
Gestion des médecins : Ajouter, afficher, et modifier les informations des médecins.
Gestion des patients : Ajouter, afficher, et modifier les informations des patients.
Gestion des consultations : Créer, afficher, et rechercher des consultations par numéro de référence unique.
Consultation par référence : Permet aux patients de consulter leurs informations de santé en saisissant un numéro de référence unique pour une consultation.

Structure du projet
Voici la structure du projet :
cabinet-medical/
├── src/
│   ├── main/
│   │   ├── java/com/cabinet/cabinetmedicale/
│   │   │   ├── controller/          
│   │   │   ├── entities/            
│   │   │   ├── repository/          
│   │   │   ├── service/             
│   │   ├── resources/
│   │   │   ├── application.properties 
│   │   │   ├── templates/           
│   │   │   ├── static/             
├── pom.xml                        
└── README.md                     

Tests
L'application contient des tests unitaires pour valider les différentes fonctionnalités. Les tests sont principalement effectués à l'aide de JUnit et Mockito pour simuler les interactions avec la base de données et vérifier les résultats des services.

Exécuter les tests
Pour exécuter les tests, utilisez la commande suivante :

mvn test

Contribution
Les contributions sont les bienvenues ! Si vous souhaitez contribuer à ce projet, voici les étapes à suivre :

1. Forkez le repository
2. Clonez votre fork sur votre machine locale
3. Créez une branche pour votre fonctionnalité :

git checkout -b feature/nom-de-la-fonctionnalité

4. Effectuez vos modifications et committez-les :

git commit -am 'Ajout de la fonctionnalité X'

5. Poussez vos modifications sur votre fork :

git push origin feature/nom-de-la-fonctionnalité

6. Ouvrez une pull request pour que vos modifications soient examinées.

Licence
Ce projet est sous la licence MIT. Vous pouvez consulter le fichier LICENSE pour plus de détails.









