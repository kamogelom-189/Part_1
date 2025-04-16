/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.part_2;

/**
 *
 * @author RC_Student_lab
 */
public class Part_2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
         String str = "Four score and seven years ago";
   int first, last;
   first = str.indexOf("r");
   last = str.lastIndexOf("r");
   System.out.println("The letter r first appears at" + "position" + first);
   System.out.println("The letter r last appears at" + "position" + last);
   
   String fullName = "kamogelo Mathe";
   String lastName = fullName.substring(9);
   System.out.println("The full name is " + fullName);
   System.out.println("The last Name is " + lastName);
    }
  
}
