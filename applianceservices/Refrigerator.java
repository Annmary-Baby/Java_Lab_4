// File: applianceservices/Refrigerator.java
package applianceservices;

public class Refrigerator implements Appliance {
    @Override
    public void start() {
        // implementation for starting the refrigerator
        System.out.println("Refrigerator started");
    }

    @Override
    public void stop() {
        // implementation for stopping the refrigerator
        System.out.println("Refrigerator stopped");
    }

    // other refrigerator-specific methods
}
