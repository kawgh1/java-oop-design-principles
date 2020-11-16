package GeneralManufacturingProcess.processes;


// Template Method Design Pattern - often used in abstracting workloads and workflows
// across many types of objects

// This is also an example of SOLID - "D" Dependency Inversion Principle
// [not to be confused with dependency injection]

public abstract class GeneralManufacturingProcess {
    // General Manufacturing Process
    // 1. Assemble Device
    // 2. Test Device
    // 3. Package Device
    // 4. Store Device

    private String processName;

    public GeneralManufacturingProcess(String processName) {
        this.processName = processName;
    }

    protected abstract void assembleDevice();
    protected abstract void testDevice();
    protected abstract void packageDevice();
    protected abstract void storeDevice();


    // Template Method
    public void launchProcess() {

        if(processName != null && !processName.isEmpty()) {
            assembleDevice();
            testDevice();
            packageDevice();
            storeDevice();
        } else {
            System.out.println("No Process Name was specified.");
        }
    }
}
