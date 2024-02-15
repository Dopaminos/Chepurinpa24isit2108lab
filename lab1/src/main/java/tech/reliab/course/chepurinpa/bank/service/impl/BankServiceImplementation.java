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
                .totalMoney(Math.round(random.nextDouble(1_000_000) * 100.0) / 100.0)
                .build();
        bank.setInterestRate(Math.round(20 - bank.getBankRating() * 0.2 * 100.0) / 100.0);
        return bank;
    }

}
