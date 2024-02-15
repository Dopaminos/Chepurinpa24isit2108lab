package tech.reliab.course.chepurinpa.bank.service;

import tech.reliab.course.chepurinpa.bank.entity.*;

import java.time.LocalDate;

public interface CreditAccountService {
    CreditAccount createCreditAccount(Long id,
                                      User user,
                                      LocalDate startDate,
                                      LocalDate endDate,
                                      Integer monthOfCreditAmount,
                                      Double creditSum,
                                      Double monthlyPayment,
                                      Employee providedEmployee,
                                      PaymentAccount paymentAccount,
                                      Bank bank);
}
