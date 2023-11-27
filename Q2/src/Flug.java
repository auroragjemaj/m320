import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Flug class with the ability to manage passengers.
 */
class Flug {
    private List<Passagier> passagiere;

    /**
     * Flug instance with an empty list of passengers.
     */
    public Flug() {
        this.passagiere = new ArrayList<>();
    }

    /**
     * Function to add passengers to the list of the flight.
     */
    public void passagierAdden() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie den Namen des Passagiers ein:");
        String passagierName = sc.nextLine();
        Passagier passagier = new Passagier(passagierName);
        passagiere.add(passagier);
        System.out.println(passagierName + " wurde hinzugefügt.");
    }

    /**
     * Function to remove passengers from the list of flight.
     */
    public void passagierDeleten() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Geben Sie den Namen des Passagiers ein:");
        String passagierName = sc1.nextLine();
        Passagier passagierToDelete = null;

        for (Passagier passagier : passagiere) {
            if (passagier.getName().equals(passagierName)) {
                passagierToDelete = passagier;
                break;
            }
        }

        if (passagierToDelete != null) {
            passagiere.remove(passagierToDelete);
            System.out.println("Passagier " + passagierName + " wurde entfernt.");
        }
    }

    /**
     * Displays the list of passengers in the flight.
     */
    public void passagierListeAusgeben() {
        System.out.println("Passagierliste :");
        for (Passagier p : passagiere) {
            p.nameAusgeben();
        }
    }
}
