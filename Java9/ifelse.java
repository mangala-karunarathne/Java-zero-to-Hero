import java.util.Scanner;

public class ifelse {

   
    public static void main(String args[]) {
        
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int num = abc.nextInt();
        int a = 5;
        if (num < 5) {
            System.out.println("It's small.... ");
        }else
        {
            System.out.println("It's large... ");
        }
    }
}
