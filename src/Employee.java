import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String designation;
    private List<Employee> employeeList;

    public Employee(int id, String name, double salary, String designation) {

        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        employeeList = new ArrayList<>();
    }

    public void add(Employee employee) {
        employeeList.add(employee);
    }

    public void remove(Employee employee) {
        employeeList.remove(employee);
    }

    public Employee getChild(int i) {
        return employeeList.get(i);
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
    public String toString()
    {
        return "Employee: ID"+getId()+"\nName:"+getName()+"\nDesignation"+getDesignation()+"\n Salary"+getSalary();
    }
}
