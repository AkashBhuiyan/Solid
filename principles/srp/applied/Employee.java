package srp.applied;

import java.math.BigDecimal;

public class Employee {

    private final String name;
    private final BigDecimal hourlyRate;
    private BigDecimal hourWorked = BigDecimal.ZERO;

    public Employee(String name, BigDecimal hourlyRate){
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getHourlyRate() {
        return hourlyRate;
    }

    public BigDecimal getHourWorked() {
        return hourWorked;
    }

    public void setHourWorked(BigDecimal hourWorked){
        this.hourWorked = hourWorked;
    }

}
