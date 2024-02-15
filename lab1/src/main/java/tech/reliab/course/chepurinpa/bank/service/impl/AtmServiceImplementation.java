package  tech.reliab.course.chepurinpa.bank.service.impl;

import  tech.reliab.course.chepurinpa.bank.entity.Bank;
import  tech.reliab.course.chepurinpa.bank.entity.BankAtm;
import  tech.reliab.course.chepurinpa.bank.entity.BankOffice;
import  tech.reliab.course.chepurinpa.bank.entity.Employee;
import  tech.reliab.course.chepurinpa.bank.service.AtmService;

public class AtmServiceImplementation implements AtmService {
    @Override
    public BankAtm createBankAtm(Long id,
                                 String name,
                                 String status,
                                 Bank bank,
                                 BankOffice bankOffice,
                                 Employee servingEmployee,
                                 Boolean isWorkingWithdraw,
                                 Boolean isWorkingDeposit,
                                 Double totalMoney,
                                 Double maintenanceCost) {
        BankAtm bankAtm = BankAtm.builder()
                .id(id)
                .name(name)
                .address(bankOffice.getAddress())
                .status(status)
                .bank(bank)
                .bankOffice(bankOffice)
                .servingEmployee(servingEmployee)
                .isWorkingWithdraw(isWorkingWithdraw)
                .isWorkingDeposit(isWorkingDeposit)
                .maintenanceCost(maintenanceCost)
                .build();
        bank.setAtmAmount(bank.getAtmAmount() + 1);
        bankOffice.setAtmAmount(bankOffice.getAtmAmount() + 1);
        if (bank.getTotalMoney() < totalMoney) {
            throw new IllegalArgumentException("Денег в банке меньше, чем передаётся банкомату");
        } else {
            bankAtm.setTotalMoney(totalMoney);
        }
        return bankAtm;
    }
}
