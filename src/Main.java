import java.awt.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Kathryn");

        car myCar = new car(25.5,
                "1BC32E",
                Color.BLUE, true);

        car sallyCar = new car(13.9,
                "3D2OBN",
                Color.BLACK,
                false);

        System.out.println("My Car's License Plate: " + myCar.licensePlate);
        System.out.println("Sally's License Plate: " + sallyCar.licensePlate);

    }
}
