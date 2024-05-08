package NesneProjeOdevi;

public final class Cat extends Animals implements Talk {

    private String catfood;
    private Dog dog;

    // Cat class constructors
    Cat() {
        this("cat food", "cat", "white", 4);
    }H

    Cat(String catfood) {
        this(catfood, "cat", "white", 4);
    }

    Cat(String catfood, String name, String color, int numberOfFeet) {
        super(name, color, numberOfFeet);
        this.catfood = catfood;
    }

    // Cat class methods
    public void catDog() {
        this.dog = new Dog();
        System.out.println("Cats friend is : " + dog.getName());
    }

    public void catDog(Dog dog) {
        this.dog = dog;
        System.out.println("Cats friend is : " + dog.getName());
    }

    public void Scratch() {
        System.out.println("You have been scratched!");
    }

    public void CatWrite() {
        System.out.println("Cats name : " + getName() + " number of feet : " + getNumberOfFeet() + " color : " + getColor() + " food : " + catfood);
    }

    // Interface method
    @Override
    public void Talk() {
        System.out.println("meow meow");
    }
}
