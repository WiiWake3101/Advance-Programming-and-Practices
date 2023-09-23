import java.util.Scanner;
import RA2211003010002.addition.RA2211003010002_Add;
import RA2211003010002.subtraction.RA2211003010002_Subtract;
import RA2211003010002.multiplication.RA2211003010002_Multiply;
import RA2211003010002.division.RA2211003010002_Divide;

public class RA2211003010002_Question9{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        RA2211003010002_Add addObj = new RA2211003010002_Add();
        RA2211003010002_Subtract subtractObj = new RA2211003010002_Subtract();
        RA2211003010002_Multiply multiplyObj = new RA2211003010002_Multiply();
        RA2211003010002_Divide divideObj = new RA2211003010002_Divide();
        System.out.print("Enter Number 1: ");
        int a=scan.nextInt();
        System.out.print("Enter Number 2: ");
        int b=scan.nextInt();
        System.out.println("Addition: " + addObj.add(a, b));
        System.out.println("Subtraction: " + subtractObj.subtract(a, b));
        System.out.println("Multiplication: " + multiplyObj.multiply(a, b));
        System.out.println("Division: " + divideObj.divide(a, b));
        scan.close();
    }
}