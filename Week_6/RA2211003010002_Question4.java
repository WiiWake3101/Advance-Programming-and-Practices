import java.util.Scanner;
class RA2211003010002_Employee {
    private double RA2211003010002_salary;

    public void RA2211003010002_work() {
        System.out.println("Employee is working...");
    }

    public void RA2211003010002_setSalary(double salary) {
        this.RA2211003010002_salary = salary;
    }

    public double RA2211003010002_getSalary() {
        return this.RA2211003010002_salary;
    }
}
class RA2211003010002_HRManager extends RA2211003010002_Employee {
    @Override
    public void RA2211003010002_work() {
        System.out.println("HR Manager is working...");
    }

    public void RA2211003010002_addEmployee() {
        System.out.println("Adding an employee...");
    }
}

public class RA2211003010002_Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RA2211003010002_HRManager hrManager = new RA2211003010002_HRManager();
        System.out.println("Enter the HR Manager's salary:");
        double salary = scanner.nextDouble();
        hrManager.RA2211003010002_setSalary(salary);
        hrManager.RA2211003010002_work();
        System.out.println("Enter the number of employees to add:");
        int numEmployees = scanner.nextInt();
        for (int i = 0; i < numEmployees; i++) {
            hrManager.RA2211003010002_addEmployee();
        }
        System.out.println("Salary: " + hrManager.RA2211003010002_getSalary());
        scanner.close();
    }
}