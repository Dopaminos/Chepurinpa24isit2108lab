package  tech.reliab.course.chepurinpa.bank.service;

import tech.reliab.course.chepurinpa.bank.entity.Bank;
import tech.reliab.course.chepurinpa.bank.entity.BankOffice;

public interface BankOfficeService {
    BankOffice createBankOffice(Long id,
                                String name,
                                String address,
                                Boolean isWorking,
                                Boolean isAtmPlaceable,
                                Integer amountOfAtms,
                                Boolean issueCredit,
                                Boolean isWorkingWithdraw,
                                Boolean isWorkingDeposit,
                                Double totalMoney,
                                Double rentCost,
                                Bank bank);
}
