import java.util.Scanner;
public class java8
{
    public static void main(String args[]) 
    {
        Scanner smk = new Scanner(System.in);
		
		System.out.println("What is your Name...? ");
        String name = smk.nextLine();
		System.out.println("How old are you...? ");
        int age = smk.nextInt();

        System.out.println("Hi " + name + " Nice to meet you...");
        System.out.println("Wow, you are " + age + " years old...");
    }
}