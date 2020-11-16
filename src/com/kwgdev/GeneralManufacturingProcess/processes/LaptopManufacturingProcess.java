package com.kwgdev.GeneralManufacturingProcess.processes;

public class LaptopManufacturingProcess  extends GeneralManufacturingProcess {

    public LaptopManufacturingProcess(String name) {
        super(name);
        System.out.println(name + " is online...\n");
    }

    @Override
    protected void assembleDevice() {
        System.out.println("Assembling Laptop...");
    }

    @Override
    protected void testDevice() {
        System.out.println("Testing Laptop...");
    }

    @Override
    protected void packageDevice() {
        System.out.println("Packaging Laptop...");
    }

    @Override
    protected void storeDevice() {
        System.out.println("Storing Laptop...");
    }

}
