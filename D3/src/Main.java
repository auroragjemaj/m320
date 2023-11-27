import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instance of the Flug class
        Flug flug = new Flug();

        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Variable to store user input
        int eingabe;

        // Loop for user interaction
        do {
            try {
                System.out.println("\nWas willst du machen?");
                System.out.println("drücke 1 für 'Passagier hinzufügen'");
                System.out.println("drücke 2 für 'Passagier entfernen'");
                System.out.println("drücke 3 für 'Passagierliste zeigen'");
                System.out.println("drücke 0 zum Beenden");

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
                    case 0:
                        System.out.println("Programm wird beendet.");
                        break;
                    default:
                        System.out.println("Ungültige Eingabe. Bitte gib eine Zahl von 0 bis 3 ein.");
                }
            } catch (Exception e) {
                System.out.println("Ungültige Eingabe. Bitte gib eine Zahl ein.");
                scanner.nextLine();
                eingabe = -1;
            }
        } while (eingabe != 0);
        scanner.close();
    }
}
