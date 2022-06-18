/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.practice;

/**
 *
 * @author Win
 */
public class nestedif {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int age =17;
        
        if(age>18){
            System.out.println("You can log to the 18+ web site");
        }
        else{
            System.out.println("You can't log to the 18+ web site");
            
            if(age>14){
                
            System.out.println("You can log to the 14+ web site");
            }
            else{
                
            System.out.println("You can't log to the 14+ web site");   
            }
        }
    }
}
