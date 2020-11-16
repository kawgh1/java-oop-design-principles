package com.kwgdev.HospitalManagementSystem.domain;

public class EmergencyRoomProcess {

    public static void main(String[] args) {

        HospitalManagement ERDirector = new HospitalManagement();

        Employee peggy = new Nurse(1, "Peggy", "ER", true);
        ERDirector.callUpon(peggy);

        Employee susan = new Doctor(2, "Susan", "ER", true);
        ERDirector.callUpon(susan);
    }
}
