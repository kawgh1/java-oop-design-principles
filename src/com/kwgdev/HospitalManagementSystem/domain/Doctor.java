package com.kwgdev.HospitalManagementSystem.domain;

public class Doctor extends Employee {


    public Doctor(long id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("The Doctor is in...");
    }

    @Override
    public void performDuties() {
        diagnosePatient();
        prescribeMedicine();

    }

    // Doctors
    private void prescribeMedicine() {
        System.out.println("Prescribing Medicine");
    }

    private void diagnosePatient() {
        System.out.println("Diagnosing Patient");
    }
}
