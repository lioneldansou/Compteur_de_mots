import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Nom du fichier à lire
        String nomFichier = "texte.txt";

        // Compteur de mots
        int totalMots = 0;

        try {
            // ouverture du fichier
            File fichier = new File(nomFichier);
            Scanner lecteur = new Scanner(fichier);

            //Lecture de  chaque ligne
            while (lecteur.hasNextLine()) {
                String ligne = lecteur.nextLine();

                // Séparation de la ligne en mots (délimiteur : espace)
                String[] mots = ligne.split(" ");

                //Ajout du  nombre de mots de cette ligne
                totalMots = totalMots + mots.length;
            }

            // Fermeture du fichier
            lecteur.close();

            //Affichage du  résultat
            System.out.println("Nombre total de mots : " + totalMots);

        } catch (FileNotFoundException exception) {
            System.out.println("Impossible de trouver ce fichier : " + nomFichier);
        }
    }
}