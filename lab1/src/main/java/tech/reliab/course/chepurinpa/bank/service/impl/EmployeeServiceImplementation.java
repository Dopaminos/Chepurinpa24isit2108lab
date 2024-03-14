package  tech.reliab.course.chepurinpa.bank.service.impl;

import  tech.reliab.course.chepurinpa.bank.entity.Bank;
import  tech.reliab.course.chepurinpa.bank.entity.BankOffice;
import  tech.reliab.course.chepurinpa.bank.entity.Employee;
import tech.reliab.course.chepurinpa.bank.service.EmployeeService;

import java.time.LocalDate;

public class EmployeeServiceImplementation implements EmployeeService {
    @Override
    public Employee createEmployee(Long id,
                                   String name,
                                   String surname,
                                   String middleName,
                                   LocalDate dateOfBirth,
                                   String position,
                                   Bank bank,
                                   Boolean isRemote,
                                   BankOffice bankOffice,
                                   Boolean issueCredit,
                                   Double salary) {
        bank.setEmployeeAmount(bank.getEmployeeAmount() + 1);
        return Employee.builder()
                .id(id)
                .name(name)
                .surname(surname)
                .middleName(middleName)
                .dateOfBirth(dateOfBirth)
                .position(position)
                .bank(bank)
                .isRemote(isRemote)
                .bankOffice(bankOffice)
                .issueCredit(issueCredit)
                .salary(salary)
                .build();
    }

}
