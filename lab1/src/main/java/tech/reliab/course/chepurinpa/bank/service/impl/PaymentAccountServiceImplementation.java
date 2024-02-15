package  tech.reliab.course.chepurinpa.bank.service.impl;

import  tech.reliab.course.chepurinpa.bank.entity.Bank;
import  tech.reliab.course.chepurinpa.bank.entity.PaymentAccount;
import  tech.reliab.course.chepurinpa.bank.entity.User;
import tech.reliab.course.chepurinpa.bank.service.PaymentAccountService;

public class PaymentAccountServiceImplementation implements PaymentAccountService {
    @Override
    public PaymentAccount createPaymentAccount(Long id, User user, Double balance, Bank bank) {
        return PaymentAccount.builder()
                .id(id)
                .user(user)
                .bankName(bank.getName())
                .balance(balance)
                .build();
    }

}
