package dip;


class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}

class DBRepository {

    public void save(Employee employee){
        System.out.println("Save to Postgres DB");
    }
}

class DBService {
    private DBRepository dbRepository = new DBRepository();

    public void saveEmployee(Employee employee){
        dbRepository.save(employee);
    }
}


public class DipViolationExample {
    public static void main(String[] args){
        DBService dbService = new DBService();
        dbService.saveEmployee(new Employee("Shanto", 28));
    }
}
