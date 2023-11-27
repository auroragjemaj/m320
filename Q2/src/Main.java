import java.util.Scanner;

/**
 *  Main method that interacts with the Flug class.
 *  It allows the user to add, remove, or display passengers in a flight.
 */
public class Main {
    public static void main(String[] args) {
        // Instance of the Flug class
        Flug flug = new Flug();

        //Scanner object for the user input
        Scanner scanner = new Scanner(System.in);

        // Variable to store user input
        int eingabe;

        // Loop for user interaction
        do {
            System.out.println("\nWas willst du machen?");
            System.out.println("drücke 1 für 'Passagier hinzufügen'");
            System.out.println("drücke 2 für 'Passagier entfernen'");
            System.out.println("drücke 3 für 'Passagierliste zeigen'");

            // Reading of input
            eingabe = scanner.nextInt();
            scanner.nextLine();

            // Execute the selected action based on user input
            switch (eingabe) {
                case 1:
                    flug.passagierAdden();
                    break;
                case 2:
                    flug.passagierDeleten();
                    break;
                case 3:
                    flug.passagierListeAusgeben();
                    break;
            }
        } while (eingabe != 0);
    }
}
