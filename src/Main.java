import javax.xml.namespace.QName;
import java.lang.reflect.Array;
import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Main {

    public static void main(String[] args) {
        // 31, 45, 22, 98, 10
        /*
        car myCar = new car(25.5, "1be456", Color.BLUE, true);

        double myCarSpeed = 50;
        myCarSpeed = myCar.speedingUp(myCarSpeed);
        System.out.println(myCarSpeed);



        int[] numbers = new int[5];


        numbers[0] = 31;
        numbers[1] = 45;
        numbers[2] = 22;
        numbers[3] = 98;
        numbers[4] = 10;

        int[] numbers2 = {31, 45, 22, 98, 10};
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));

        String[] myFavoriteCandyBars = {"Twix", "Snickers", "Heath"};
        System.out.println("Index 2: " + myFavoriteCandyBars[2]);
        myFavoriteCandyBars[2] = "Butterfinger";
        System.out.println("Index 2: " + myFavoriteCandyBars[2]);
        System.out.println("Length: "+myFavoriteCandyBars.length);

        String candy2 = myFavoriteCandyBars[2];
        int candy2length = candy2.length();
        System.out.println("Index 2 length is: "+candy2length);

        Array.get(myFavoriteCandyBars, 2);



        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int useNumber = sc.nextInt();

        System.out.println(useNumber);
        double userNumber2 = sc.nextDouble();
        System.out.println(userNumber2);


        String userInput = sc.next();

        String uppercased = userInput.toUpperCase();
        System.out.print(uppercased);

        char firstCharacter = userInput.charAt(0);
        System.out.println(firstCharacter);

        System.out.println("Contains: "+ userInput.contains("enter"));


        dog myDog = new dog("lab", 100.00, 75);
        System.out.println(myDog.breed);

        //Original price
        System.out.println("Current price: "+myDog.price);
        //Prompt user
        System.out.println("What would you like the price to be?: ");
        //Create new scanner
        Scanner scprice = new Scanner(System.in);
        //set new price to whatever price is
        Double newPrice = scprice.nextDouble();
        //Call method to set new proce
        myDog.changeDogPrice(newPrice);
        //Call new price
        System.out.println("New price: "+myDog.price);





        //Original breed
        System.out.println("Current Breed: "+myDog.breed);
        //Prompt user
        System.out.println("Enter the new breed of the dog: ");
        //Collect data
        Scanner sc = new Scanner(System.in);
        //set newDogBreed = whatever is inputted next
        String newDogBreed = sc.nextLine();
        //declare vairable that will
        String newBreed;
        //set new variable to outcome of method
        newBreed = myDog.changeDogBreed(newDogBreed);
        //
        System.out.println(myDog.breed);





        //Original dogs weight
        System.out.println("Dogs current weight"+myDog.weight);
        //prompt user
        System.out.println("What is the dogs correct weight?: ");
        //declare scanner
        Scanner scweight = new Scanner(System.in);
        //have scanner set newweight to the next int
        int nextDogWeight = scweight.nextInt();
        //declare varaible that will be the new weight
        myDog.changeDogsWeight(nextDogWeight);
        //print out final weight
        System.out.println(myDog.weight);
        */

        System.out.println("Enter and age: ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        if (age >= 0 && age <= 5) {
            System.out.println("Baby");
        }
        else if (age >= 6 && age <= 11){
            System.out.println("Kid");
        }
        else if (age >= 13 && age <= 19) {
            System.out.println("Teen");
        }

    }
}



