import java.util.Scanner;
public class SimpleCalculator
{
    public static void main(String args[])
    {
        Scanner ibaa = new Scanner(System.in);
        
        System.out.println("Enter the first Number : ");
        double no1 = ibaa.nextDouble();
        
        System.out.println("Enter the Second Number : ");
        double no2 = ibaa.nextDouble();
        
        double ans = no1 + no2;
        System.out.println("Summation is " + ans);
    }
}