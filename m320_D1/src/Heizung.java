public class Heizung {
    private int temperature;
    private int min;
    private int max;
    private int increment;

    public Heizung(){}

    public Heizung(int min, int max, int increment) {
        this.min = min;
        this.max = max;
        this.increment = increment;
    }

    public Heizung(int temperature, int increment) {
        this.temperature = temperature;
        this.increment = increment;
    }

    public void increaseTemperature() throws RuntimeException{
        if (temperature + increment > max) {
            throw new RuntimeException("Max ist 100°.");
        }
        temperature += increment;
    }

    public void decreaseTemperature() throws RuntimeException {
        if (temperature - increment < min) {
            throw new RuntimeException("Min ist 5°.");
        }
        temperature -= increment;
    }

    public void printData(){
        System.out.println("Temperature: " + temperature);
        System.out.println("Increment:   " + increment);
        System.out.println("Min:         " + min);
        System.out.println("Max          " + max);
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getIncrement() {
        return increment;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setIncrement(int increment) {
        this.increment = increment;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

}
