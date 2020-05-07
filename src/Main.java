import javax.xml.namespace.QName;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("John");

        car myCar = new car(25.5, "1bc345", Color.BLUE, true);
        car johnCar = new car(30, "juy586", Color.BLACK, false);

        System.out.println("My car's license plate: " + myCar.licensePlate);
        System.out.println("John's license plate: " + johnCar.licensePlate);

        System.out.println(myCar.paintColor);
        myCar.changePaintColor(Color.RED);
        System.out.println(myCar.paintColor);

    }
}
