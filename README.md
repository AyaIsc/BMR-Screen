
# 🧮 Écran de Calcul du BMR (Basal Metabolic Rate) 🧮

Cette application graphique permet de calculer le **BMR** (Indice du Métabolisme de Base) et les besoins quotidiens en calories d'un individu en fonction de son sexe, poids, taille, âge et niveau d'activité.

## 📋 Fonctionnalités

- 🔹 **Calcul du BMR** : Calculez votre BMR à partir de votre **poids**, **taille**, **âge** et **sexe** à l'aide des formules :
  - **Femme** : `9.6 * poids + 1.8 * taille − 4.7 * âge + 655`
  - **Homme** : `13.7 * poids + 5 * taille − 6.8 * âge + 66`
- 🔹 **Besoins en Calories** : Calculez vos besoins quotidiens en fonction de votre niveau d'activité physique :
  - **Sédentaire** : 1.2
  - **Peu actif** : 1.375
  - **Actif** : 1.55
  - **Fort actif** : 1.725
  - **Extrêmement actif** : 1.9
- 🎛️ **Interface utilisateur** : L'application présente un écran simple et intuitif avec :
  - **TextFields** pour saisir les informations sur le poids, la taille, et l'âge.
  - **RadioButtons** pour sélectionner le **sexe** (Homme/Femme).
  - **ChoiceBox** pour sélectionner le **niveau d'activité**.
  - **Button** pour lancer le calcul.
  - **Labels** pour afficher les résultats du BMR et des calories.

## 🖥️ Interface Graphique

L'application est divisée en différents **layouts** pour organiser les champs d'entrée et les résultats. Voici un aperçu des composants utilisés :

- 🏷️ **Label** : Pour les textes explicatifs et les légendes.
- 📝 **TextField** : Pour saisir les valeurs de poids, taille, et âge.
- 🔘 **RadioButton** : Pour le choix du sexe (Homme/Femme).
- 🔽 **ChoiceBox** : Pour sélectionner le niveau d'activité.
- ▶️ **Button** : Pour déclencher le calcul du BMR.
- 📊 **Résultats** : Affichage des résultats calculés pour le **BMR** et les **calories**.

## 📦 Installation et Lancement

1. **Cloner le dépôt** :
   ```bash
   git clone https://github.com/votre-repo/BMR-calculator.git
   ```
2. **Compiler et exécuter le projet** dans votre IDE préféré (**IntelliJ**, **Eclipse**, etc.).

3. **Remplir les champs** avec vos informations et cliquez sur le bouton **Calculer** pour obtenir votre BMR et vos besoins en calories.

## 📜 Exemple de Calcul

### Pour une femme de 60kg, 165cm, 30 ans et sédentaire :
- **BMR** : `9.6 * 60 + 1.8 * 165 - 4.7 * 30 + 655 = 1394.5`
- **Calories** : `BMR * 1.2 = 1394.5 * 1.2 = 1673.4`

## 👩‍💻 Auteur

Cette application vous est proposée par **Aya**.
