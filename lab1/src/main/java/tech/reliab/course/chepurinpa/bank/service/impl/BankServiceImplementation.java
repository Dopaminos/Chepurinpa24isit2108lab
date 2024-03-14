package  tech.reliab.course.chepurinpa.bank.service.impl;

import  tech.reliab.course.chepurinpa.bank.entity.Bank;
import  tech.reliab.course.chepurinpa.bank.service.BankService;

import java.util.Random;

public class BankServiceImplementation implements BankService {

    @Override
    public Bank createBank(Long id, String name) {
        Random random = new Random();
        Bank bank = Bank.builder()
                .id(id)
                .name(name)
                .officeAmount(0)
                .AtmAmount(0)
                .employeeAmount(0)
                .customerAmount(0)
                .bankRating(random.nextInt(101))
                .totalMoney(generateTotalMoney())
                .build();
        bank.setInterestRate(generateInterestRate(bank.getBankRating()));
        return bank;
    }
    private double generateTotalMoney() {
        Random random = new Random();
        return Math.round(random.nextDouble(1000000) * 100.0) / 100.0;
    }

    private double generateInterestRate(int bankRating) {
        return Math.round(20 - bankRating * 0.2 * 100.0) / 100.0;
    }
}
