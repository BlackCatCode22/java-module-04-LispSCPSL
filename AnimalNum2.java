package tyler.zoo.com;
import java.util.Date;

public class AnimalNum2 {
    static int numOfAnimals = 0; // Created static int that keeps track of the num of animals created

    public AnimalNum2() { // Created a constructor for our new Animal Objects
        numOfAnimals++;
    }

    // Create a constructor that accepts a name
    public AnimalNum2(String aName) {
        this.animalName = aName;
        numOfAnimals++;
    }


    // Create a few attributes (fields)
    private String sex = "";   // sex will be 'male' or 'female'
    private int age = 0; // age will be in years
    private int weight = 0; //weight will be in pounds


    private String animalID;

    // Animal names come from a text file called "animalNames.txt"
    private String animalName;

    // Animal birthdate
    private Date animalBirthdate;

    // Animal color
    private String animalColor;

    // Origin zoo
    private String animalOrigin;

    // Arrival date
    private Date animalArrivalDate;


    // Create getters and setters
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAnimalID() {return animalID;}
    public void setAnimalID(String animalID) {this.animalID = animalID;}

    public String getAnimalName() {return animalName;}
    public void setAnimalName(String animalName) {this.animalName = animalName;}

    public Date getAnimalBirthdate() {return animalBirthdate;}
    public void setAnimalBirthdate(Date animalBirthdate) {this.animalBirthdate = animalBirthdate;}

    public String getAnimalColor() {return animalColor;}
    public void setAnimalColor (String animalColor) {this.animalColor = animalColor;}

    public String getAnimalOrigin() {return animalOrigin;}
    public void setAnimalOrigin (String animalOrigin) {this.animalOrigin = animalOrigin;}

    public Date getAnimalArrivalDate() {return animalArrivalDate;}
    public void setAnimalArrivalDate(Date animalArrivalDate) {this.animalArrivalDate= animalArrivalDate;}
}
