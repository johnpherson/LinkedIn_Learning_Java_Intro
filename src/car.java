import java.awt.*;

public class Car {

    double averageMilesPerGallon;
    String licensePlate;
    Color paintColor;
    boolean areTailingWorking;


    public Car(double inputAverageMPG,
               String inputLicensePlate,
               Color inputpaintColor,
               boolean inputAreTaillightsWorking) {
        this.averageMilesPerGallon = inputAverageMPG;
        this.licensePlate = inputLicensePlate;
        this.paintColor = inputpaintColor;
        this.areTailingWorking = inputAreTaillightsWorking;
    }

}
