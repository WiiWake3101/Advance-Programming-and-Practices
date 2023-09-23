import java.util.Scanner;
class ThreadA extends Thread {
    String RA2211003010002_k;
    ThreadA(String k) {
        this.RA2211003010002_k = k;
    }

    @Override
    public void run() {
        int RA2211003010002_dc = 0;
        for (char c : RA2211003010002_k.toCharArray()) {
            if (Character.isDigit(c)) {
                RA2211003010002_dc++;
            }
        }
        System.out.println("ThreadA: " + RA2211003010002_dc);
    }
}

class ThreadB extends Thread {
    String RA2211003010002_k;
    ThreadB(String k) {
        this.RA2211003010002_k = k;
    }

    @Override
    public void run() {
        int RA2211003010002_cc = 0;
        for (char c : RA2211003010002_k.toCharArray()) {
            if (Character.isLetter(c)) {
                RA2211003010002_cc++;
            }
        }
        System.out.println("ThreadB: " + RA2211003010002_cc);
    }
}
public class RA2211003010002_Week_7_Question7 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter a String: ");
        String RA2211003010002_k = scan.next();
        ThreadA RA2211003010002_t1 = new ThreadA(RA2211003010002_k);
        ThreadB RA2211003010002_t2 = new ThreadB(RA2211003010002_k);
        RA2211003010002_t1.start();
        RA2211003010002_t2.start();
        scan.close();
    }
}