package srp;

import java.math.BigDecimal;

public class SrpExample {
    public static void main(String[] args){
        EmployeeInfo employeInfo = new EmployeeInfo("Akash", BigDecimal.valueOf(25));
        employeInfo.saveToDataBase();
        System.out.println("Payble amount = " + employeInfo.calculatePay(BigDecimal.valueOf(4)));
        System.out.println(employeInfo.generateReport());
    }
}
