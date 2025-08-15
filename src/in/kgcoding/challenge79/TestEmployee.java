package in.kgcoding.challenge79;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Prashant", 30, 25000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("swayam");
        System.out.println(emp.getEmployeeDetails());
    }
}
