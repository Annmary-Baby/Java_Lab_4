// File: applianceservices/Application.java
package applianceservices;

public class Application {
    public static void main(String[] args) {
        Appliance washingMachine = new WashingMachine();
        washingMachine.start();
        washingMachine.stop();

        Appliance refrigerator = new Refrigerator();
        refrigerator.start();
        refrigerator.stop();
    }
}
