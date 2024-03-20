package  tech.reliab.course.chepurinpa.bank.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder
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

    @Override
    public String toString() {
        return "BankOffice: " +
                "\nid=" + id +
                ", \nname='" + name + '\'' +
                ", \naddress='" + address + '\'' +
                ", \nisWorking=" + isWorking +
                ", \nisAtmPlaceable=" + isAtmPlaceable +
                ", \nAtmAmount=" + AtmAmount +
                ", \nissueCredit=" + issueCredit +
                ", \nisWorkingWithdraw=" + isWorkingWithdraw +
                ", \ncisWorkingDeposit=" + isWorkingDeposit +
                ", \ntotalMoney=" + totalMoney +
                ", \nrentCost=" + rentCost +
                "\n}";
    }
}
