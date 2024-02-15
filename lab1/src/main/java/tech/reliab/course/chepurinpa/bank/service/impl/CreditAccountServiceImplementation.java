package  tech.reliab.course.chepurinpa.bank.service.impl;

import  tech.reliab.course.chepurinpa.bank.entity.*;
import tech.reliab.course.chepurinpa.bank.service.CreditAccountService;

import java.time.LocalDate;

public class CreditAccountServiceImplementation implements CreditAccountService {
    @Override
    public CreditAccount createCreditAccount(Long id,
                                             User user,
                                             LocalDate startDate,
                                             LocalDate endDate,
                                             Integer monthsOfCreditAmount,
                                             Double creditSum,
                                             Double monthlyPayment,
                                             Employee providedEmployee,
                                             PaymentAccount paymentAccount,
                                             Bank bank) {
        return CreditAccount.builder()
                .id(id)
                .user(user)
                .bankName(bank.getName())
                .startDate(startDate)
                .endDate(endDate)
                .monthsOfCreditAmount(monthsOfCreditAmount)
                .creditSum(creditSum)
                .monthlyPayment(monthlyPayment)
                .interestRate(bank.getInterestRate())
                .providedEmployee(providedEmployee)
                .paymentAccount(paymentAccount)
                .build();
    }

}
