/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.practicepro;

/**
 *
 * @author Win
 */
public class increment {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       int apple = 15;
        System.out.println("The value of Apple now is : " + apple);
        System.out.print("The value of Apple now is : " );
        System.out.println(++apple);
        System.out.print("The value of Apple now is : ");
        System.out.println(--apple);
        System.out.println("The value of Apple now is : " + apple++);// Same as apple, because ++ ditect after print apple
        
        apple += 5;
        System.out.println("The value of Apple now is : " + apple);
        System.out.print("The value of Apple now is : ");
        System.out.println(--apple);
    }
}
