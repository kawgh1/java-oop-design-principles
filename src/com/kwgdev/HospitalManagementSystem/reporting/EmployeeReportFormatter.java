package com.kwgdev.HospitalManagementSystem.reporting;

import com.kwgdev.HospitalManagementSystem.domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter {

    Employee employee;

    public EmployeeReportFormatter(Employee employee, FormatType formatType) {
        super(employee, formatType);
    }


    public String getFormattedEmployee() {
        return getFormattedValue();
    }
}
