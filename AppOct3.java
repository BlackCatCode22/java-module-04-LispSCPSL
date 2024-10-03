// TD 10/03/2024
// zooVersion01.java

package tyler.zoo.com;
import java.util.Date;
import java.text.SimpleDateFormat;

public class AppOct3 {
    public static void main(String[] args) {
    System.out.println("\nWelcome to my Zoo Program!");

        // Current Date
        Date Today = new Date();

        // Define the desired date format
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatterYear = new SimpleDateFormat("yyyy");

        // Format the date and store it in a string
        String strTodaysDate = formatter.format(Today);
        String strTodaysYear = formatterYear.format(Today);

        // Output the result
        System.out.println("Today's date in the format YYYY-MM-DD: " + strTodaysDate);

        System.out.println("\n");

        // Calculate Birthdates for the following two hyenas
        // 1) 4 year old female hyena, born in spring, tan color, 70 pounds, from Friguia Park, Tunisia
        // 2) 12 year old male hyena, born in fall, brown color, 150 pounds, from Friguia Park, Tunisia

        // Write Java code to calculate birthdates for the animal and then create a method
        // that returns a string for the animal's birthdate


        // Input: "4-year old female Hyena; born in Spring
        // Processing: Find the age and birth season, and then use
        // decision control structures to calculate the date.

        // parse the string
        String strStarting = "12 year old male hyena, born in fall, brown color, 150 pounds, from Friguia Park, Tunisia";

        String[] arrayOfStrPartsOnComma = strStarting.split(", ");

        int elementNum = 0;
        for (String thePart : arrayOfStrPartsOnComma) {
            System.out.println("Element " + elementNum + " of the string is: " + thePart);
            elementNum++;
        }

        System.out.println("\n");

        String[] arrayOfStrPartsOnSpace = arrayOfStrPartsOnComma[0].split(" ");
        elementNum = 0;
        for (String thePart : arrayOfStrPartsOnSpace) {
            System.out.println("Element " + elementNum + " of the string is: " + thePart);
            elementNum++;
        }


        String ageInYears = arrayOfStrPartsOnSpace[0];
        System.out.println("\nThe age in years of the animal is: " + ageInYears);


        System.out.println("\n");

        String[] arrayOfStrPartsOnSpace02 = arrayOfStrPartsOnComma[1].split(" ");
        elementNum = 0;
        for (String thePart : arrayOfStrPartsOnSpace02) {
            System.out.println("Element " + elementNum + " of the string is: " + thePart);
            elementNum++;
        }

        String animalBirthSeason = arrayOfStrPartsOnSpace02[2];
        System.out.println("\nThe season of birth of the animal is: " + animalBirthSeason);


        String animalBirthdate = "";
        int todaysYear =  Integer.parseInt(strTodaysYear);
        int animalBirthYear = todaysYear - Integer.parseInt(ageInYears);



        if (animalBirthSeason.contains("spring")) {
            animalBirthdate = Integer.toString(animalBirthYear) + "-03-21";
        }

        if (animalBirthSeason.contains("fall")) {
            animalBirthdate = Integer.toString(animalBirthYear) + "-09-21";
        }

        if (animalBirthSeason.contains("winter")) {
            animalBirthdate = Integer.toString(animalBirthYear) + "-12-21";
        }
        if (animalBirthSeason.contains("summer")) {
            animalBirthdate = Integer.toString(animalBirthYear) + "-06-21";
        }


        System.out.println("\nanimalBirthdate = " +  animalBirthdate);


        // Unit test
        AnimalOct3 myNewAnimal = new AnimalOct3("Male", 4, 70, "Zig",
                "Hy01", "2020-3-21", "Brown Spots", "from San Diego Zoo");


        // Prove it
        System.out.println("\nThis is the new animal!\n");
        System.out.println("ID is: " + myNewAnimal.getAnimalID() + " and... name is: " + myNewAnimal.getAnimalName() + "\n");
    }
}