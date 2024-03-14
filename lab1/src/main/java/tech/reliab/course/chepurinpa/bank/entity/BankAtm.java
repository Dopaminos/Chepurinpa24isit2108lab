package  tech.reliab.course.chepurinpa.bank.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

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

    @Override
    public String toString() {
        return "BankAtm {" +
                "\nid=" + id +
                ", \nname='" + name + '\'' +
                ", \naddress='" + address + '\'' +
                ", \nstatus='" + status + '\'' +
                ", \nbank's id=" + bank.getId() +
                ", \nbankOffice's id=" + bankOffice.getId() +
                ", \nservingEmployee's id=" + servingEmployee.getId() +
                ", \nisWorkingWithdraw=" + isWorkingWithdraw +
                ", \nisWorkingDeposit=" + isWorkingDeposit +
                ", \ntotalMoney=" + totalMoney +
                ", \nmaintenanceCost=" + maintenanceCost +
                "\n}";
    }
}