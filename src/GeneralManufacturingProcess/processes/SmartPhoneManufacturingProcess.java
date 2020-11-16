package GeneralManufacturingProcess.processes;

import GeneralManufacturingProcess.processes.GeneralManufacturingProcess;

public class SmartPhoneManufacturingProcess  extends GeneralManufacturingProcess {

    public SmartPhoneManufacturingProcess(String name) {
        super(name);
        System.out.println(name + " is online...\n");
    }

    @Override
    protected void assembleDevice() {
        System.out.println("Assembling SmartPhone...");
    }

    @Override
    protected void testDevice() {
        System.out.println("Testing SmartPhone...");
    }

    @Override
    protected void packageDevice() {
        System.out.println("Packaging SmartPhone...");
    }

    @Override
    protected void storeDevice() {
        System.out.println("Storing SmartPhone...");
    }

}
