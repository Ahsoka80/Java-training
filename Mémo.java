/*
Classes et Objets : En Java, tout tourne autour des classes et des objets.
Une classe est un modèle qui définit le comportement et les propriétés des objets. Un objet est une instance d'une classe.

public class MaClasse {
    // Attributs
    int maVariable;

    // Constructeur
    public MaClasse(int valeur) {
        maVariable = valeur;
    }

    // Méthode
    public void maMethode() {
        System.out.println("Bonjour, je suis une méthode.");
    }
}


Méthodes : Les méthodes sont des fonctions qui effectuent des tâches spécifiques. Dans l'exemple ci-dessus, maMethode est une méthode.

Variables : Vous pouvez déclarer des variables pour stocker des données. En Java, les variables ont des types de données.


int numero = 10;
String texte = "Bonjour, le monde";


Héritage : Java prend en charge l'héritage, ce qui signifie que vous pouvez créer de nouvelles classes basées sur des classes existantes.

public class MaClasseFille extends MaClasse {
    // Vous pouvez ajouter de nouveaux attributs et méthodes ici
}


Interfaces : Les interfaces définissent un ensemble de méthodes que une classe doit implémenter.

public interface MonInterface {
    void methode1();
    void methode2();
}


Collections : Java offre une variété de structures de données telles que des listes, des cartes et des ensembles pour
stocker et manipuler des ensembles de données.

List<String> liste = new ArrayList<>();
liste.add("Pomme");
liste.add("Banane");


Exceptions : Java gère les erreurs et les exceptions en utilisant des blocs try-catch.

try {
    // Code qui peut générer une exception
} catch (TypeException e) {
    // Gestion de l'exception
}

Contrôle de Flux : Vous pouvez utiliser des structures de contrôle telles que if, else, while, for pour contrôler
le flux d'exécution du programme.

if (condition) {
    // Faire quelque chose si la condition est vraie
} else {
    // Faire quelque chose si la condition est fausse
}

Entrée et Sortie : Java permet l'entrée et la sortie de données en utilisant la classe Scanner pour lire depuis la console
et System.out.println pour afficher dans la console.

Scanner scanner = new Scanner(System.in);
System.out.println("Entrez un nombre : ");
int nombre = scanner.nextInt();

Gestion de la Mémoire : Java gère automatiquement la gestion de la mémoire grâce à un processus appelé ramasse-miettes (garbage collection).

Java est largement utilisé dans le développement d'applications de bureau, le développement web (via Java EE), le développement mobile
(via Android) et de nombreuses autres domaines de programmation. Il est connu pour être portable, orienté objet et sécurisé.
Pour développer des applications Java, vous avez généralement besoin d'un environnement de développement tel qu'Eclipse, IntelliJ IDEA
ou NetBeans, ainsi que du kit de développement Java (JDK).

*/
