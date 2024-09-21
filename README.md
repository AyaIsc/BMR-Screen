
# 📊 Calculateur de BMR (Basal Metabolic Rate) 📊

Ce projet permet de calculer le **BMR** (Indice du Métabolisme de Base) ainsi que les besoins caloriques journaliers d'un individu en fonction de son poids, de sa taille, de son âge, de son sexe et de son niveau d'activité.

## 🧮 Qu'est-ce que le BMR ?

Le **BMR** représente la quantité d'énergie (en calories) que le corps utilise au repos pour maintenir ses fonctions vitales (respiration, circulation sanguine, digestion, etc.).

Les formules pour calculer le BMR sont différentes pour les hommes et les femmes :

- **Femme** :  
  `BMR = 9.6 * poids (kg) + 1.8 * taille (cm) - 4.7 * âge (ans) + 655`
  
- **Homme** :  
  `BMR = 13.7 * poids (kg) + 5 * taille (cm) - 6.8 * âge (ans) + 66`

### 🔢 Exemple de Calcul

- Femme de 30 ans, pesant 60 kg et mesurant 170 cm :  
  `BMR = 9.6 * 60 + 1.8 * 170 - 4.7 * 30 + 655 = 1400.5`

- Homme de 25 ans, pesant 75 kg et mesurant 180 cm :  
  `BMR = 13.7 * 75 + 5 * 180 - 6.8 * 25 + 66 = 1816.5`

## 🏃 Calcul des Besoins Caloriques Journaliers

Pour déterminer le nombre de calories nécessaires chaque jour, il suffit de multiplier le **BMR** par un facteur dépendant du niveau d'activité de l'individu. Voici les facteurs :

| Niveau d'activité       | Facteur multiplicatif |
|-------------------------|-----------------------|
| 🛋️ Sédentaire             | 1.2                   |
| 🚶 Peu actif              | 1.375                 |
| 🏋️ Actif                  | 1.55                  |
| 🏃‍♂️ Fort actif            | 1.725                 |
| 🏆 Extrêmement actif      | 1.9                   |

### 🔢 Exemple

Pour une femme avec un **BMR** de 1400.5 et une activité "Peu actif" :  
`Besoins quotidiens = 1400.5 * 1.375 = 1925.68` calories/jour

## 💻 Fonctionnalités

- 🎯 **Calcul du BMR** en fonction du sexe, de l'âge, du poids et de la taille
- 🔄 **Calcul des besoins quotidiens en calories** basé sur le niveau d'activité
- 🖥️ **Interface utilisateur** intuitive pour saisir les informations et obtenir les résultats

## 🛠️ Prérequis

- Navigateur web moderne (si projet en web)
- **Java** ou un autre langage approprié si l'application est en console ou en interface graphique

## 👩‍💻 Auteur

Ce projet vous est proposé par **Aya**.

---

