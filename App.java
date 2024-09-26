package tyler.zoo.com;

// TD 09/26/2024
//App.java
// Driver file for the zoo midterm program.

public class App {
    public static void main(String[] args) {
    System.out.println("\nWelcome to my Zoo Program!\n");



    tyler.zoo.com.AnimalNum2 myAnimal = new tyler.zoo.com.AnimalNum2();
    myAnimal.setAnimalName("my first animal");
    System.out.println("\nThe name of the new animal is: " + myAnimal.getAnimalName());


    tyler.zoo.com.AnimalNum2 anotherAnimal = new tyler.zoo.com.AnimalNum2("Kay");
    System.out.println("\nThe name of the second animal is: " + anotherAnimal.getAnimalName());


    System.out.println("\nNumber of animals is: " + tyler.zoo.com.AnimalNum2.numOfAnimals);


    // Create a Hyena with a name
    tyler.zoo.com.Hyena aNewHyena = new tyler.zoo.com.Hyena("Kamari");
    System.out.println("\nThe new hyena's name is: " + aNewHyena.getAnimalName());


    System.out.println("\nNumber of animals is: " + tyler.zoo.com.AnimalNum2.numOfAnimals);

    }
}
