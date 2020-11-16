package com.kwgdev.GeneralManufacturingProcess.clients;

import com.kwgdev.GeneralManufacturingProcess.processes.GeneralManufacturingProcess;
import com.kwgdev.GeneralManufacturingProcess.processes.SmartPhoneManufacturingProcess;

// Represents the physical factory
public class DeviceFactory {

    // by separating this class into a different package than com.kwgdev.GeneralManufacturingProcess
    // it can no longer access the individual protected methods - because DeviceFactory is neither
    // a child or in the same package. This prevents DeviceFactory from being able to call the
    // manufacturing methods/processes out of order or skipping a step
    // it only has access to "launchProcess()" - so we control the workflow
    public static void main(String[] args) {
        GeneralManufacturingProcess manufacturer = new SmartPhoneManufacturingProcess("iPhone process");
        manufacturer.launchProcess();

    }
}
