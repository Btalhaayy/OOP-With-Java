package NesneProjeOdevi;

public class Main {

    public static void main(String[] args) {

        // Building normal object
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Building object using constructors
        Dog dog2 = new Dog("Av Köpeği", "Karabaş", "Black", 4);
        Cat cat2 = new Cat("Mama", "Tekir", "White", 4);

        // Connecting dog and cat classes
        cat.catDog(dog);
        dog.dogCat(cat);

        // Using cat class methods
        System.out.println("Cat lost a feet :");
        cat.setNumberOfFeet(3);
        System.out.println("Cats new number of feet : " + cat.getNumberOfFeet());
        cat.Talk(); // Interface method
        cat.CatWrite();
        cat.catDog(); // Showing the class we used for one to one relationship

        // Using dog class methods
        dog.setName("Kurt");
        System.out.println("You changed the dogs name!");
        System.out.println("Dogs new name : " + dog.getName());
        dog.Bite(); // Interface method
        dog.Talk();
        dog.dogCat(); // Showing the class we used for one to one relationship

        // Testing the objects we build with constructors
        dog2.DogWrite();
        cat2.CatWrite();

    }

}
