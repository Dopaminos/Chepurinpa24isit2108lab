package tech.reliab.course.chepurinpa.bank.service;

import tech.reliab.course.chepurinpa.bank.entity.Bank;
import tech.reliab.course.chepurinpa.bank.entity.BankAtm;
import tech.reliab.course.chepurinpa.bank.entity.BankOffice;
import tech.reliab.course.chepurinpa.bank.entity.Employee;

public interface AtmService {
    BankAtm createBankAtm(Long id,
                          String name,
                          String status,
                          Bank bank,
                          BankOffice bankOffice,
                          Employee servingEmployee,
                          Boolean isWorkingWithdraw,
                          Boolean isWorkingDeposit,
                          Double totalMoney,
                          Double maintenanceCost);
}
