package Employee;

public class TestEmployee {
    public static void main(String[] args) {
        IEmployee employee1 = new PartTimeEmployee("phap", 45000, 7);
        System.out.println("Name: " + employee1.getName());
        System.out.println("Salary per day: " + employee1.calculateSalary());

        IEmployee employee2 = new FullTimeEmployee("hieu", 65000);
        System.out.println("Name: " + employee2.getName());
        System.out.println("Salary per day: " + employee2.calculateSalary());
    }
}
