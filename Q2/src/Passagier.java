/**
 * Passagier class represents a passenger with a name.
 */
public class Passagier {
    private String name;

    /**
     * Creates a new Passagier instance with the specified name.
     *
     * @param name The name of the passenger.
     */
    public Passagier(String name) {
        this.name = name;
    }

    /**
     * Displays the name of the passenger.
     */
    public void nameAusgeben() {
        System.out.println("Passagier: " + name);
    }

    /**
     * Gets the name of the passenger.
     *
     * @return The name of the passenger.
     */
    public String getName() {
        return name;
    }
}
