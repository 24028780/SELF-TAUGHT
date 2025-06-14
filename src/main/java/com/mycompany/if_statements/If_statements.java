/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.if_statements;

/**
 *
 * @author polit
 */
import java.util.Scanner;
public class If_statements {
    public static void main(String[] args) {
        Scanner Polite=new Scanner(System.in);
                                System.out.println("ENTER AGE");
                                int age =Polite.nextInt();
    
    if(age>=18){
                System.out.println("you are legal");
    }
    else if(age==12){
                        System.out.println("you are legal");

    }
                else{
                                      System.out.println("you are not legal");
  
                        }


    }
}
