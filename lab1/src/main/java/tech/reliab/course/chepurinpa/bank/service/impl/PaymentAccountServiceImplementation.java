package  tech.reliab.course.chepurinpa.bank.service.impl;

import  tech.reliab.course.chepurinpa.bank.entity.Bank;
import  tech.reliab.course.chepurinpa.bank.entity.PaymentAccount;
import  tech.reliab.course.chepurinpa.bank.entity.User;
import tech.reliab.course.chepurinpa.bank.service.PaymentAccountService;

public class PaymentAccountServiceImplementation implements PaymentAccountService {
    @Override
    public PaymentAccount createPaymentAccount(Long id, User user, Bank bank) {
        PaymentAccount paymentAccount = PaymentAccount.builder()
                .id(id)
                .user(user)
                .bankName(bank.getName())
                .balance(0.0)
                .build();
        user.getPaymentAccounts().add(paymentAccount);
        return paymentAccount;
    }

}
