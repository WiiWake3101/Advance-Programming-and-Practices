import java.util.Scanner;
public class RA2211003010002_Week_5_question1{
    public static void mirror_image(String RA2211003010002_inputWord){
        String RA2211003010002_reversedWord = "";
        for (int i = RA2211003010002_inputWord.length() - 1; i >= 0; i--) {
            RA2211003010002_reversedWord += RA2211003010002_inputWord.charAt(i);
        }
        System.out.println("Mirror Image of " + RA2211003010002_inputWord + " is " + RA2211003010002_reversedWord);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string to mirror image: ");
        String RA2211003010002_inputWord=scanner.nextLine();
        mirror_image(RA2211003010002_inputWord);
        scanner.close();
    }
}