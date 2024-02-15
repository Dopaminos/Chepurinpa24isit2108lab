package  tech.reliab.course.chepurinpa.bank.service.impl;

import  tech.reliab.course.chepurinpa.bank.entity.Bank;
import  tech.reliab.course.chepurinpa.bank.entity.BankOffice;
import tech.reliab.course.chepurinpa.bank.service.BankOfficeService;

public class BankOfficeServiceImplementation implements BankOfficeService {
    @Override
    public BankOffice createBankOffice(Long id,
                                       String name,
                                       String address,
                                       Boolean isWorking,
                                       Boolean isAtmPlaceable,
                                       Integer AtmAmount,
                                       Boolean issueCredit,
                                       Boolean isWorkingWithdraw,
                                       Boolean isWorkingDeposit,
                                       Double totalMoney,
                                       Double rentCost,
                                       Bank bank) {
        BankOffice bankOffice = BankOffice
                .builder()
                .id(id)
                .name(name)
                .address(address)
                .isWorking(isWorking)
                .isAtmPlaceable(isAtmPlaceable)
                .issueCredit(issueCredit)
                .isWorkingWithdraw(isWorkingWithdraw)
                .isWorkingDeposit(isWorkingDeposit)
                .totalMoney(bank.getTotalMoney())
                .rentCost(rentCost)
                .build();
        if (bank.getTotalMoney() < totalMoney
        ) {
            throw new IllegalArgumentException("Некорректное значение количества денег в банке");
        } else {
            bankOffice.setTotalMoney(totalMoney);
        }
        if (AtmAmount > bank.getAtmAmount()) {
            throw new IllegalArgumentException("Количество банкоматов в офисе больше, чем общее количество банкоматов у банка");
        } else {
            bankOffice.setAtmAmount(AtmAmount);
        }
        return bankOffice;
    }

}
