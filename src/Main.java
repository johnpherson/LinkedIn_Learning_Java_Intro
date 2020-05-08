import javax.xml.namespace.QName;
import java.lang.reflect.Array;
import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 31, 45, 22, 98, 10

        car myCar = new car(25.5, "1be456", Color.BLUE, true);

        double myCarSpeed = 50;
        myCarSpeed = myCar.speedingUp(myCarSpeed);
        System.out.println(myCarSpeed);


        /*
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
        */

    }
}



