package srp.applied;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        Employee employee = new Employee("Akash", BigDecimal.valueOf(25));
        employee.setHourWorked(BigDecimal.valueOf(4));

        DatabaseService databaseService = new DatabaseService();
        databaseService.saveToDB(employee);

        SalaryCalculationService salaryCalculationService = new SalaryCalculationService();
        System.out.println("Payble amount = "+ salaryCalculationService.calculatePay(employee));

        ReportService reportService = new ReportService();
        System.out.println(reportService.generateReport(employee));
    }
}
