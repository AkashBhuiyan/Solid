package srp.applied;

import java.math.BigDecimal;

public class SalaryCalculationService {
    public BigDecimal calculatePay(Employee employee){
        return new BigDecimal(Math.ceil(employee.getHourWorked().doubleValue() * employee.getHourlyRate().doubleValue()));
    }
}
