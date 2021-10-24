package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class FacadeSearcher {
    public static final Logger LOGGER = LoggerFactory.getLogger(FacadeExceptions.class);
    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    public List<Company> findCompaniesByNamePart (String partName) throws FacadeExceptions {
        boolean wasError = false;
        List<Company> companies = companyDao.findByPartName(partName);
        LOGGER.info("Searching company ");
        if (companies.size() <= 0) {
            LOGGER.error(FacadeExceptions.ERR_COMPANY_NOT_FOUND);
            wasError = true;
            if (wasError) {
                LOGGER.info("There were Errors");
                throw new FacadeExceptions(FacadeExceptions.ERR_COMPANY_NOT_FOUND);
            }
        }
        return companies;
    }

    public List<Employee> findEmplyeesByNamePart (String partName) throws FacadeExceptions {
        boolean wasError = false;
        List<Employee> employees = employeeDao.findByPartName(partName);
        LOGGER.info("Searching Employee ");
        if (employees.size() <= 0) {
            LOGGER.error(FacadeExceptions.ERR_EMPLOYEE_NOT_FOUND);
            wasError = true;
            if (wasError) {
                LOGGER.info("There were Errors");
                throw new FacadeExceptions(FacadeExceptions.ERR_EMPLOYEE_NOT_FOUND);
            }

        }
        return employees;
    }
}