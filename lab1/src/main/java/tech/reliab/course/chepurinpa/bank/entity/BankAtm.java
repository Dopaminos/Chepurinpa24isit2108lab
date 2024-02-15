package  tech.reliab.course.chepurinpa.bank.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class BankAtm {

    private Long id;
    private String name;
    private String address;
    private String status;
    private Bank bank;
    private BankOffice bankOffice;
    private Employee servingEmployee;
    private Boolean isWorkingWithdraw;
    private Boolean isWorkingDeposit;
    private Double totalMoney;
    private Double maintenanceCost;
}