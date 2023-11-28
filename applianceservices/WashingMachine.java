// File: applianceservices/WashingMachine.java
package applianceservices;

public class WashingMachine implements Appliance {
    @Override
    public void start() {
        // implementation for starting the washing machine
        System.out.println("Washing machine started");
    }

    @Override
    public void stop() {
        // implementation for stopping the washing machine
        System.out.println("Washing machine stopped");
    }

    // other washing machine-specific methods
}
