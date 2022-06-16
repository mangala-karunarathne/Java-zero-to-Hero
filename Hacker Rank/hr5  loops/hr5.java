import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class hr5 {
    public static void main(String args[]) 
    {
        Scanner ab = new Scanner(System.in);
        int N = ab.nextInt();
        for(int i=1; i <=10; i++)
        {
            int result = N*i;
            System.out.println(N + " x " + i + " = " + result);
            
        }
    }
}