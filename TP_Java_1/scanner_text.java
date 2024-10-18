import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class scanner_text {
    public static void main(String[] args) {
        try {
            // Create a Scanner object to read from a file
            Scanner fichier = new Scanner(new File("resultat.txt"));

            // Read and display data from the file
            while (fichier.hasNextLine()) {
                String ligne = fichier.nextLine();
                System.out.println(ligne);
            }

            // Close the scanner
            fichier.close();
        } catch (FileNotFoundException e) {
            // Handle the exception when the file is not found
            System.out.println("Fichier non trouvé.");
        }
    }
}
