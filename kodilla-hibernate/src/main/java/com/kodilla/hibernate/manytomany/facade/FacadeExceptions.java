package com.kodilla.hibernate.manytomany.facade;

public class FacadeExceptions extends Exception {
    public static String ERR_EMPLOYEE_NOT_FOUND = "Can't find employee.";
    public static String ERR_COMPANY_NOT_FOUND = "Can't find company.";

    public FacadeExceptions(String message) {
        super(message);
    }
}
