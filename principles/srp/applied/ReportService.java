package srp.applied;

public class ReportService {

    public String generateReport(Employee employee){
        StringBuilder report = new StringBuilder();
        report.append("Hours Report:\n");
        report.append("-------------\n");
        report.append(String.format("Name: %s \n", employee.getName()));
        report.append(String.format("Working Hours: %s \n", employee.getHourWorked()));
        report.append("-------------\n");

        return report.toString();
    }
}
