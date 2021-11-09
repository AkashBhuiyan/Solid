package srp;

import java.math.BigDecimal;

public class EmployeInfo {
    private final String name;
    private final BigDecimal hourlyRate;
    private BigDecimal hourWorked = BigDecimal.ZERO;

    public EmployeInfo(String name, BigDecimal hourlyRate){
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    public BigDecimal calculatePay(BigDecimal hourWorked){
        this.hourWorked = hourWorked;
        return new BigDecimal(Math.ceil(this.hourWorked.doubleValue()* this.hourlyRate.doubleValue()));
    }

    public void saveToDataBase(){
        System.out.println("Employee Save to database");
    }

    public String generateReport(){
        StringBuilder report = new StringBuilder();
        report.append("Hours Report:\n");
        report.append("-------------\n");
        report.append(String.format("Name: %s \n", name));
        report.append(String.format("Working Hours: %s \n", hourWorked));
        report.append("-------------\n");

        return report.toString();
    }
}
