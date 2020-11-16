package com.kwgdev.HospitalManagementSystem.domain;

// Strategy Design Pattern

// separate Employee sub classes' methods into their respective classes
// and make Employee abstract with an abstract method for its children to implement
// according to their class type and responsibilities

// then HospitalManagement here can simply call any employee - doctor, nurse, CEO, maintenance, etc.
// and say the same "do work" method to all of them and each will implement their own methods

public class HospitalManagement {


    public void callUpon(Employee employee) {
        employee.performDuties();
    }
}
