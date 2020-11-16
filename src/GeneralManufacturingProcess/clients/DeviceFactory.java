package GeneralManufacturingProcess.clients;

import GeneralManufacturingProcess.processes.GeneralManufacturingProcess;
import GeneralManufacturingProcess.processes.SmartPhoneManufacturingProcess;

// Represents the physical factory
public class DeviceFactory {

    // by separating this class into a different package than GeneralManufacturingProcess
    // it can no longer access the individual protected methods - because DeviceFactory is neither
    // a child or in the same package. This prevents DeviceFactory from being able to call the
    // manufacturing methods/processes out of order or skipping a step
    // it only has access to "launchProcess()" - so we control the workflow
    public static void main(String[] args) {
        GeneralManufacturingProcess manufacturer = new SmartPhoneManufacturingProcess("iPhone process");
        manufacturer.launchProcess();

    }
}
