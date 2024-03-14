package  tech.reliab.course.chepurinpa.bank.service.impl;

import lombok.Getter;
import lombok.Setter;
import  tech.reliab.course.chepurinpa.bank.entity.Bank;
import  tech.reliab.course.chepurinpa.bank.entity.BankOffice;
import tech.reliab.course.chepurinpa.bank.service.BankOfficeService;

@Getter
@Setter
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
            throw new IllegalArgumentException("N/A денег в банке");
        } else {
            bankOffice.setTotalMoney(totalMoney);
        }
        if (AtmAmount > bank.getAtmAmount()) {
            throw new IllegalArgumentException("Банкоматов в офисе больше общего числа банкоматов");
        } else {
            bankOffice.setAtmAmount(AtmAmount);
        }
        bank.setOfficeAmount(bank.getOfficeAmount() + 1);
        return bankOffice;
    }

}
