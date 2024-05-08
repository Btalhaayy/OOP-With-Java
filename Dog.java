package NesneProjeOdevi;

public final class Dog extends Animals implements Talk {

    private String dogsType;
    private Cat cat;

    // Dog class constructors
    Dog() {
        this("Pet Dog", "Dog", "black", 4);
    }

    Dog(String dogsType, String name, String color, int numberOfFeet) {
        super(name, color, numberOfFeet);
        this.dogsType = dogsType;
    }

    // Connecting cat and dog (1 - 1 relationship)
    public void dogCat() {
        this.cat = new Cat();
        System.out.println("Dogs Friend is : " + cat.getName());
    }

    public void dogCat(Cat cat) {
        this.cat = cat;
        System.out.println("Dogs Friend is : " + cat.getName());
    }

    // Dog class methods
    public void DogWrite() {
        System.out.println("Dogs Name is : " + getName() + "\ncolor : " + getColor() + "\nnumber of feed : " + getNumberOfFeet() + "\ntype : " + dogsType);
    }

    public void Bite() {
        System.out.println("You have been bitten!!");
    }

    // Override Interface method
    @Override
    public void Talk() {
        System.out.println("wouf wouf");
    }

    // Get - Set methods
    public String getDogsType() {
        return dogsType;
    }

    public void setDogsType(String dogsType) {
        this.dogsType = dogsType;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
