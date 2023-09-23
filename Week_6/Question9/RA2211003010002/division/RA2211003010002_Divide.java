package RA2211003010002.division;
public class RA2211003010002_Divide {
    public int divide(int RA2211003010002_a, int RA2211003010002_b) {
        if (RA2211003010002_b != 0) {
            return RA2211003010002_a / RA2211003010002_b;
        } else {
            System.out.println("Error! Dividing by zero is not allowed.");
            return 0;
        }
    }
}