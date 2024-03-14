package  tech.reliab.course.chepurinpa.bank.service.impl;

import  tech.reliab.course.chepurinpa.bank.entity.Bank;
import  tech.reliab.course.chepurinpa.bank.entity.User;
import tech.reliab.course.chepurinpa.bank.service.UserService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserServiceImplementation implements UserService {
    @Override
    public User createUser(Long id,
                           String name,
                           String surname,
                           String middleName,
                           LocalDate dateOfBirth,
                           String placeOfWork,
                           List<Bank> banks) {
        Random random = new Random();
        User user = User.builder()
                .id(id)
                .name(name)
                .surname(surname)
                .middleName(middleName)
                .dateOfBirth(dateOfBirth)
                .placeOfWork(placeOfWork)
                .monthlyIncome(Math.round(random.nextDouble(10_000) * 100.0) / 100.0)
                .banks(banks)
                .creditAccounts(new ArrayList<>())
                .paymentAccounts(new ArrayList<>())
                .build();
        setCreditRating(user);
        banks.forEach(bank -> bank.setCustomerAmount(bank.getCustomerAmount() + 1));
        return user;
    }

    private void setCreditRating(User user) {
        user.setCreditRating(switch ((int) (user.getMonthlyIncome() / 1000)) {
            case 2 -> 200;
            case 3 -> 300;
            case 4 -> 400;
            case 5 -> 500;
            case 6 -> 600;
            case 7 -> 700;
            case 8 -> 800;
            case 9 -> 900;
            case 10 -> 1000;
            default -> 100;
        });
    }


}
