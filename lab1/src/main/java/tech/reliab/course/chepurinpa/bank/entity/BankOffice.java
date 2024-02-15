package  tech.reliab.course.chepurinpa.bank.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class BankOffice {

    private Long id;
    private String name;
    private String address;
    private Boolean isWorking;
    private Boolean isAtmPlaceable;
    private Integer AtmAmount;
    private Boolean issueCredit;
    private Boolean isWorkingWithdraw;
    private Boolean isWorkingDeposit;
    private Double totalMoney;
    private Double rentCost;
}
