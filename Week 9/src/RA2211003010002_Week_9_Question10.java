import java.util.Scanner;
class Employee {
    private String name;
    private String id;
    public String RA2211003010002_getName() {
        return name;
    }
    public void RA2211003010002_setName(String name) {
        this.name = name;
    }
    public String RA2211003010002_getId() {
        return id;
    }
    public void RA2211003010002_setId(String id) {
        this.id = id;
    }
}
class RA2211003010002_EmployeeView {
    public void RA2211003010002_displayEmployeeDetails(String name, String id) {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
class EmployeeController {
    private Employee model;
    private RA2211003010002_EmployeeView view;
    public EmployeeController(Employee model, RA2211003010002_EmployeeView view) {
        this.model = model;
        this.view = view;
    }
    public void RA2211003010002_setEmployeeName(String name) {
        model.RA2211003010002_setName(name);
    }
    public String RA2211003010002_getEmployeeName() {
        return model.RA2211003010002_getName();
    }
    public void RA2211003010002_setEmployeeId(String id) {
        model.RA2211003010002_setId(id);
    }
    public String RA2211003010002_getEmployeeId() {
        return model.RA2211003010002_getId();
    }
    public void RA2211003010002_updateView() {
        view.RA2211003010002_displayEmployeeDetails(model.RA2211003010002_getName(), model.RA2211003010002_getId());
    }
}

public class RA2211003010002_Week_9_Question10{
    public static void main(String[] args) {
        Employee model = new Employee();
        RA2211003010002_EmployeeView view = new RA2211003010002_EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();
        System.out.print("Enter employee ID: ");
        String employeeId = scanner.nextLine();
        controller.RA2211003010002_setEmployeeName(employeeName);
        controller.RA2211003010002_setEmployeeId(employeeId);
        controller.RA2211003010002_updateView();
        scanner.close();
    }
}