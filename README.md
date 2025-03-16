# Cabinet Médical - Gestion des Consultations

## 📝 Description
Cette application permet de gérer un cabinet médical en simplifiant la gestion des consultations, des patients et des médecins. Les médecins peuvent ajouter et gérer des consultations, tandis que les patients peuvent accéder à leurs informations de consultation via un numéro de référence unique.

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

📸 Interfaces de l'Application
1. Accueil
![Accueil](https://github.com/user-attachments/assets/f56ec690-bb29-4b09-a672-258864ada210)
La page d'accueil présente une introduction à l'application et des liens pour gérer les patients et les consultations.

2. Gestion des Patients
![Gestion Patient](https://github.com/user-attachments/assets/3adcc547-4fe2-4955-b041-c06d5bd24333)
Cette interface permet d'ajouter, de modifier et de supprimer des patients. Les informations incluent le nom, le prénom, l'email et le téléphone.

3. Nouveau Patient
![Nouveau Patient](https://github.com/user-attachments/assets/279ef879-3368-405d-8203-08b8e44a570d)
Formulaire pour ajouter un nouveau patient avec les champs : nom, prénom, email et téléphone.

4. Gestion des Consultations
![Consultation](https://github.com/user-attachments/assets/16c14b87-e803-4f2a-914a-99f452f2ffc8)
Cette interface affiche la liste des consultations avec des détails tels que la date, le patient et la description. Les actions permettent de modifier ou de supprimer une consultation.

5. Nouvelle Consultation
![Nouveau Consultation](https://github.com/user-attachments/assets/4014ac01-d02d-4814-b829-e3bbaf3e43af)
Formulaire pour ajouter une nouvelle consultation. Les champs incluent le patient, la date et la description.

6. Contactez-nous
![Contact](https://github.com/user-attachments/assets/b6aa8729-dd5e-453b-ba7b-94b63a3171c5)
Page de contact avec l'adresse et le numéro de téléphone du cabinet médical.

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
└── README.md                       
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
