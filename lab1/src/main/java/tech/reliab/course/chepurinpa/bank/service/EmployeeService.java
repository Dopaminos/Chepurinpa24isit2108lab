package  tech.reliab.course.chepurinpa.bank.service;

import  tech.reliab.course.chepurinpa.bank.entity.Bank;
import  tech.reliab.course.chepurinpa.bank.entity.BankOffice;
import  tech.reliab.course.chepurinpa.bank.entity.Employee;

import java.time.LocalDate;

public interface EmployeeService {
    Employee createEmployee(Long id,
                            String name,
                            String surname,
                            String middleName,
                            LocalDate dateOfBirth,
                            String position,
                            Bank bank,
                            Boolean isRemote,
                            BankOffice bankOffice,
                            Boolean issueCredit,
                            Double salary);
}
