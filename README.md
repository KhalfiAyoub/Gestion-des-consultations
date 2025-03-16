# Gestion-des-consultations
Ce projet est une application de gestion pour un cabinet médical, permettant aux médecins d'ajouter des consultations et aux patients de consulter leurs informations via un numéro de référence. L'application utilise Spring Boot, Thymeleaf, MySQL pour le back-end et Lombok pour simplifier le code.

## Technologies utilisées

- **Spring Boot** : Framework Java pour créer des applications web et des services RESTful.
- **Spring Data JPA** : Gestion de la persistance des données avec JPA et Hibernate.
- **Thymeleaf** : Moteur de templates pour la génération de vues HTML.
- **MySQL** : Base de données relationnelle utilisée pour stocker les informations des médecins, patients et consultations.
- **Lombok** : Librairie Java pour réduire le code boilerplate (getters, setters, constructeurs).
- **Maven** : Outil de gestion de projet et d'automatisation de la compilation.

## Prérequis

- JDK 21 ou une version supérieure
- MySQL installé et configuré
- Maven installé

## Étapes d'installation

1. Clonez le repository sur votre machine locale :
    ```bash
    git clone https://github.com/votre-utilisateur/cabinet-medical.git
    cd cabinet-medical
    ```

2. Configurez votre base de données MySQL :
    - Créez une base de données nommée `cabinet_medical` :
      ```sql
      CREATE DATABASE cabinet_medical;
      ```
    - Configurez les paramètres de la base de données dans le fichier `src/main/resources/application.properties` :
      ```properties
      spring.datasource.url=jdbc:mysql://localhost:3306/cabinet_medical
      spring.datasource.username=your-username
      spring.datasource.password=your-password
      spring.jpa.hibernate.ddl-auto=update
      spring.jpa.show-sql=true
      ```

3. Lancez l'application :
    ```bash
    mvn spring-boot:run
    ```

   L'application sera accessible sur [http://localhost:8080](http://localhost:8080).

## Fonctionnalités

- **Gestion des médecins** : Ajouter, afficher, et modifier les informations des médecins.
- **Gestion des patients** : Ajouter, afficher, et modifier les informations des patients.
- **Gestion des consultations** : Créer, afficher, et rechercher des consultations avec un numéro de référence unique.
- **Consultation par référence** : Permet aux patients de rechercher une consultation en utilisant un numéro de référence unique.

## Structure du projet

cabinet-medical/
├── src/
│   ├── main/
│   │   ├── java/com/cabinet/cabinetmedicale/
│   │   │   ├── controller/          # Contrôleurs Spring MVC
│   │   │   ├── entities/            # Entités JPA
│   │   │   ├── repository/          # Repositories Spring Data JPA
│   │   │   ├── service/             # Services métier
│   │   ├── resources/
│   │   │   ├── application.properties # Configuration de l'application
│   │   │   ├── templates/           # Vues Thymeleaf
│   │   │   ├── static/              # Fichiers statiques (CSS, JS, etc.)
├── pom.xml                         # Configuration Maven
└── README.md                       # Fichier README

## Contribution

Les contributions sont les bienvenues ! Si vous souhaitez contribuer à ce projet, veuillez suivre ces étapes :

1. Forkez le repository
2. Créez une branche (git checkout -b feature/ma-fonctionnalité)
3. Committez vos modifications (git commit -am 'Ajout de ma fonctionnalité')
4. Poussez la branche (git push origin feature/ma-fonctionnalité)
5. Ouvrez une pull request

## Licence

Ce projet est sous la licence **MIT**. Voir le fichier [LICENSE](LICENSE) pour plus de détails.
