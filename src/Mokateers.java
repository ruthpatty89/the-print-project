public class Mokateers {

    private int employeeId;
    private String name;
    private long salary;

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    public Mokateers(int employee, String name, long salary) {
        this.employeeId = employee;
        this.name = name;
        this.salary = salary;
    }
    public void print() {
        System.out.println("Name :" + getName());
        System.out.println("Employee ID :" + getEmployeeId());
        System.out.println("Salary :" + getSalary());
    }
}
