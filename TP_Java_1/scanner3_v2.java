import java.util.Scanner;

public class scanner3_v2 {
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

        // Output the values using printf or format
        System.out.printf("Nom : %s%n", nom);  // %s for string
        System.out.printf("Âge : %d ans%n", age);  // %d for integer
        System.out.printf("Taille : %.2f mètres%n", taille);  // %.2f for floating point (2 decimal places)
       //%.2f means 0.xy(digits)from f 
        //%b for boolean
        //%c for char
        //%f for double
        //%n for new line
        // Close the scanner
        clavier.close();
    }
}
