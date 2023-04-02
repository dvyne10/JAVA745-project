import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("what course are you taking?");
        String results = input.nextLine();
        System.out.println("hmmm "+results+", that's a nice course");
    }
}