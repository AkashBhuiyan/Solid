package dip.applied;

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

interface PersistenceRepository{
    void saveEmployee(Employee employee);
}

class PostgresSQL implements PersistenceRepository {

    @Override
    public void saveEmployee(Employee employee) {
        System.out.println("Save to Postgres DB");
    }
}

class MySQL implements PersistenceRepository {

    @Override
    public void saveEmployee(Employee employee) {
        System.out.println("Save to MySQL DB");
    }
}

class PersistenceService {
    private PersistenceRepository persistenceRepository;

    public PersistenceService(PersistenceRepository persistenceRepository){
        this.persistenceRepository = persistenceRepository;
    }

    public void saveEmployee(Employee employee){
        persistenceRepository.saveEmployee(employee);
    }
}

public class DipViolationSolution {
    public static void main(String[] args){
        PersistenceRepository persistenceRepository = new PostgresSQL();
        //PersistenceRepository persistenceRepository = new MySQL();

        PersistenceService persistenceService = new PersistenceService(persistenceRepository);
        persistenceService.saveEmployee(new Employee("Shanto", 28));

    }
}
