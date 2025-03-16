# Cabinet Médical - Gestion des Consultations

## 📝 Description
Cette application web permet de gérer un cabinet médical en simplifiant la gestion des consultations, des patients et des médecins. Les médecins peuvent ajouter et gérer des consultations, tandis que les patients peuvent accéder à leurs informations de consultation via un numéro de référence unique.

Développée avec **Spring Boot**, **Thymeleaf**, et **MySQL**, l'application est conçue pour être robuste, scalable et facile à maintenir. Elle utilise **Lombok** pour réduire le code boilerplate et **Maven** pour la gestion des dépendances.

---

## 🛠 Technologies Utilisées
- **Spring Boot** : Framework Java pour les applications web et les services RESTful.
- **Spring Data JPA** : Gestion de la persistance des données avec JPA et Hibernate.
- **Thymeleaf** : Moteur de templates pour générer des vues HTML côté serveur.
- **MySQL** : Base de données relationnelle pour stocker les données.
- **Lombok** : Réduit le code boilerplate (getters, setters, constructeurs).
- **Maven** : Gestion des dépendances et compilation.

---

## 🚀 Prérequis
- **JDK 21** ou supérieur.
- **MySQL** installé et configuré.
- **Maven** installé.

---

## 🔧 Installation

### 1. Cloner le Dépôt
```bash
git clone https://github.com/votre-utilisateur/cabinet-medical.git
cd cabinet-medical
```

### 2. Configurer la Base de Données
1. Créez une base de données MySQL :
   ```sql
   CREATE DATABASE cabinet_medical;
   ```
2. Configurez les paramètres dans `src/main/resources/application.properties` :
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/cabinet_medical
   spring.datasource.username=votre-utilisateur
   spring.datasource.password=votre-mot-de-passe
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   ```

### 3. Lancer l'Application
```bash
mvn spring-boot:run
```
Accédez à l'application via : [http://localhost:8080](http://localhost:8080).

---

## 🌟 Fonctionnalités
- **Gestion des Médecins** : Ajouter, afficher et modifier les informations des médecins.
- **Gestion des Patients** : Ajouter, afficher et modifier les informations des patients.
- **Gestion des Consultations** : Créer, afficher et rechercher des consultations avec un numéro de référence unique.
- **Consultation par Référence** : Les patients peuvent rechercher une consultation via un numéro de référence.

---

## 📂 Structure du Projet
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
└── README.md                       \
```

---

## 🤝 Contribution
Les contributions sont les bienvenues ! Voici comment procéder :
1. Forkez le dépôt.
2. Créez une branche (`git checkout -b feature/ma-fonctionnalité`).
3. Committez vos modifications (`git commit -am 'Ajout de ma fonctionnalité'`).
4. Poussez la branche (`git push origin feature/ma-fonctionnalité`).
5. Ouvrez une Pull Request.

---

## 📜 Licence
Ce projet est sous licence **MIT**. Consultez le fichier [LICENSE](LICENSE) pour plus de détails.

---

## 👤 Auteur
- **Ayoub Khalfi**  
- LinkedIn : [www.linkedin.com/in/ayoub-khalfi-480739214](https://www.linkedin.com/in/ayoub-khalfi-480739214)  
- Contact : [:khalfiayoub65@gmail.com](mailto:khalfiayoub65@gmail.com)  
