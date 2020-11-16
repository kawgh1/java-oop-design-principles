package com.kwgdev.HospitalManagementSystem.domain.DAO;

import com.kwgdev.HospitalManagementSystem.database.DatabaseConnectionManager;
import com.kwgdev.HospitalManagementSystem.domain.Employee;

public class EmployeeDAO {

    DatabaseConnectionManager connectionManager;

    public void saveEmployee(Employee employee) {
//        DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getManagerInstance();
//        connectionManager.connect();
//        connectionManager.getConnectionObject().prepareStatement("INSERT into Employee_tbl");
//        connectionManager.disconnect();
        System.out.println("Saved employee to the database:  " + employee);

    }

    public void deleteEmployee(Employee employee) {
        System.out.println("Deleted employee from the database:  " + employee);

    }
}
