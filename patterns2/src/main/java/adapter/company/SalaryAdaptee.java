package adapter.company;



import adapter.company.newhrsystem.CompanySalaryProcessor;
import adapter.company.newhrsystem.Employee;
import adapter.company.newhrsystem.SalaryProcessor;

import java.math.BigDecimal;
import java.util.List;

public class SalaryAdaptee implements SalaryProcessor {
    @Override
    public BigDecimal calculateSalasries(List<Employee> employees) {
        CompanySalaryProcessor theProcessor = new CompanySalaryProcessor();
        return theProcessor.calculateSalasries(employees);
    }
}