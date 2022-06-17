/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.practice;

/**
 *
 * @author Win
 */
public class Grades {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int marks = 30;
        
        if (marks>=75)
            System.out.println("Your grade is A");
        else if (marks>=65)
            System.out.println("Your grade is B");
        else if (marks>=55)
            System.out.println("Your grade is C");
        else if (marks>=35)
            System.out.println("Your grade is S");
        else
            System.out.println("Your grade is F");   
                          
    }
}
