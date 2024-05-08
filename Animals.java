package NesneProjeOdevi;

public abstract class Animals {

    private String name;
    private String color;
    private int numberOfFeet;

    Animals() {
        this("animal", "animal color", 4);
    }

    Animals(String animalName, String animalColor, int animalNumberOfFeet) {
        setNumberOfFeet(animalNumberOfFeet);
        setName(animalName);
        setColor(animalColor);
    }

    // Get - Set methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfFeet() {
        return numberOfFeet;
    }

    public void setNumberOfFeet(int numberOfFeet) {
        this.numberOfFeet = numberOfFeet;
    }
}
