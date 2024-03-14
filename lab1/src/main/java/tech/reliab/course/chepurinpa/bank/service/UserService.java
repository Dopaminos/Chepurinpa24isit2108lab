package  tech.reliab.course.chepurinpa.bank.service;

import tech.reliab.course.chepurinpa.bank.entity.Bank;
import tech.reliab.course.chepurinpa.bank.entity.User;

import java.time.LocalDate;
import java.util.List;

public interface UserService {
    User createUser(Long id,
                    String name,
                    String surname,
                    String middleName,
                    LocalDate dateOfBirth,
                    String placeOfWork,
                    List<Bank> banks);

}
