# Cabinet Médical - Gestion des Consultations

## Description du Projet
Ce projet est une application web de gestion de cabinet médical, conçue pour simplifier la gestion des consultations, des patients et des médecins. L'application permet aux médecins d'ajouter et de gérer des consultations, tandis que les patients peuvent consulter les informations relatives à leurs consultations en utilisant un numéro de référence unique. 

Développée avec **Spring Boot**, **Thymeleaf**, et **MySQL**, cette application est robuste, scalable et facile à maintenir. Elle utilise **Lombok** pour réduire le code boilerplate et **Maven** pour la gestion des dépendances et la compilation.

---

## Technologies Utilisées
- **Spring Boot** : Framework Java pour le développement d'applications web et de services RESTful.
- **Spring Data JPA** : Gestion de la persistance des données avec JPA et Hibernate.
- **Thymeleaf** : Moteur de templates pour la génération de vues HTML côté serveur.
- **MySQL** : Base de données relationnelle pour stocker les données des médecins, patients et consultations.
- **Lombok** : Librairie pour simplifier le code Java (getters, setters, constructeurs, etc.).
- **Maven** : Outil de gestion de projet et de dépendances.

---

## Prérequis
Avant de commencer, assurez-vous d'avoir les éléments suivants installés sur votre machine :
- **JDK 21** ou une version ultérieure.
- **MySQL** installé et configuré.
- **Maven** installé.

---

## Installation et Configuration

### 1. Cloner le Repository
Clonez le dépôt sur votre machine locale :
```bash
git clone https://github.com/votre-utilisateur/cabinet-medical.git
cd cabinet-medical
```

### 2. Configurer la Base de Données
1. Créez une base de données MySQL nommée `cabinet_medical` :
   ```sql
   CREATE DATABASE cabinet_medical;
   ```
2. Configurez les paramètres de la base de données dans le fichier `src/main/resources/application.properties` :
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/cabinet_medical
   spring.datasource.username=votre-utilisateur
   spring.datasource.password=votre-mot-de-passe
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   ```

### 3. Lancer l'Application
Exécutez la commande suivante pour démarrer l'application :
```bash
mvn spring-boot:run
```
L'application sera accessible à l'adresse : [http://localhost:8080](http://localhost:8080).

---

## Fonctionnalités Principales
- **Gestion des Médecins** :
  - Ajouter, afficher et modifier les informations des médecins.
- **Gestion des Patients** :
  - Ajouter, afficher et modifier les informations des patients.
- **Gestion des Consultations** :
  - Créer, afficher et rechercher des consultations.
  - Attribution d'un numéro de référence unique pour chaque consultation.
- **Consultation par Référence** :
  - Permet aux patients de rechercher une consultation en utilisant un numéro de référence unique.

---

## Structure du Projet
Voici la structure principale du projet :
```
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
```

---

## Contribution
Les contributions sont les bienvenues ! Pour contribuer à ce projet, suivez les étapes suivantes :
1. Forkez le dépôt.
2. Créez une branche pour votre fonctionnalité (`git checkout -b feature/ma-fonctionnalité`).
3. Committez vos modifications (`git commit -am 'Ajout de ma fonctionnalité'`).
4. Poussez la branche (`git push origin feature/ma-fonctionnalité`).
5. Ouvrez une Pull Request.

---

## Licence
Ce projet est sous licence **MIT**. Pour plus de détails, consultez le fichier [LICENSE](LICENSE).

## Auteur
- KHALFI Ayoub 
- Contact : [khalfiayoub65@gmail.com](mailto:khalfiayoub65@gmail.com)  
- LinkedIn : www.linkedin.com/in/ayoub-khalfi-480739214 

---
