package srp.applied;

public class DatabaseService {

    public void saveToDB(Employee employee){
        System.out.println(String.format("Save %s info into Employee table", employee.getName()));
    }
}
