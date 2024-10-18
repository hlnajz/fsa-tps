
import java.util.Scanner;

public class scanner3 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner clavier = new Scanner(System.in);

        // Read name
        System.out.println("Veuillez entrer votre nom :");
        String nom = clavier.nextLine();

        // Read age
        System.out.println("Veuillez entrer votre âge :");
        int age = clavier.nextInt();

        // Read height
        System.out.println("Veuillez entrer votre taille (en mètres) :");
        float taille = clavier.nextFloat();

        // Output the values using println()
        System.out.println("Nom : " + nom);
        System.out.println("Âge : " + age);
        System.out.println("Taille : " + taille + " mètres");
        
        // Close the scanner
        clavier.close();
    }
}
