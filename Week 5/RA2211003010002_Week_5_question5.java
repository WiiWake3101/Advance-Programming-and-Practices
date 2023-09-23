import java.util.Scanner;
public class RA2211003010002_Week_5_question5{
    public static boolean prime_checker(int RA2211003010002_number) {
        if (RA2211003010002_number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(RA2211003010002_number); i++) {
            if (RA2211003010002_number % i == 0) {
                return false;
            }
        }
        return true;
    }    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number to prime number: ");
        int RA2211003010002_number= scanner.nextInt();
        if (prime_checker(RA2211003010002_number)) {
            System.out.println(RA2211003010002_number + " is prime");
        } 
        else {
            System.out.println(RA2211003010002_number + " is not prime");
        }
        scanner.close();
    }
}