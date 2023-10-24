import java.util.Scanner;
class RA2211003010002_Student {
    private String rollNo;
    private String name;
    public String RA2211003010002_getRollNo() {
        return rollNo;
    }
    public void RA2211003010002_setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    public String RA2211003010002_getName() {
        return name;
    }
    public void RA2211003010002_setName(String name) {
        this.name = name;
    }
}
class RA2211003010002_StudentView {
    public void printStudentDetails(String studentName, String studentRollNo) {
        System.out.println("RA2211003010002_Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
class StudentController {
    private RA2211003010002_Student model;
    private RA2211003010002_StudentView view;
    public StudentController(RA2211003010002_Student model, RA2211003010002_StudentView view) {
        this.model = model;
        this.view = view;
    }
    public void RA2211003010002_setStudentName(String name) {
        model.RA2211003010002_setName(name);
    }
    public String getStudentName() {
        return model.RA2211003010002_getName();
    }
    public void setStudentRollNo(String rollNo) {
        model.RA2211003010002_setRollNo(rollNo);
    }
    public String getStudentRollNo() {
        return model.RA2211003010002_getRollNo();
    }
    public void updateView() {
        view.printStudentDetails(model.RA2211003010002_getName(), model.RA2211003010002_getRollNo());
    }
}
public class RA2211003010002_Week_9_Question9{
    public static void main(String[] args) {
        RA2211003010002_Student model = new RA2211003010002_Student();
        RA2211003010002_StudentView view = new RA2211003010002_StudentView();
        StudentController controller = new StudentController(model, view);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter RA2211003010002_Student name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter RA2211003010002_Student roll number: ");
        String studentRollNo = scanner.nextLine();
        controller.RA2211003010002_setStudentName(studentName);
        controller.setStudentRollNo(studentRollNo);
        controller.updateView();
        scanner.close();
    }
}