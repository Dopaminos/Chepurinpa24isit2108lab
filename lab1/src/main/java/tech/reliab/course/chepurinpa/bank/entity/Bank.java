package tech.reliab.course.chepurinpa.bank.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder


public class Bank {

    private Long id;
    private String name;
    private Integer officeAmount;
    private Integer AtmAmount;
    private Integer employeeAmount;
    private Integer customerAmount;
    private Integer bankRating;
    private Double totalMoney;
    private Double interestRate;
    @Override
    public String toString() {
        return "Bank {" +
                "\nid=" + id +
                ", \nname='" + name + '\'' +
                ", \nofficeAmount=" + officeAmount +
                ", \nAtmAmount=" + AtmAmount +
                ", \nemployeeAmount=" + employeeAmount +
                ", \ncustomerAmount=" + customerAmount +
                ", \nbankRating=" + bankRating +
                ", \ntotalMoney=" + totalMoney +
                ", \ninterestRate=" + interestRate +
                "\n}";
    }
}

