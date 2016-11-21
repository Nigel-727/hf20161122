/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.mgm.project1;

import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author MAGA
 */
public class NameOfMonth {
  public static void main(String[] args) {
    int number;
    Scanner input= new Scanner(System.in);
    System.out.println("Please enter a integer type number: ");
    
    while (!input.hasNextInt())
    {
    System.out.println("Invalid input\n Type the double-type number:");
    input.next();
    }
    number=input.nextInt();
    
    
    System.out.println(Month.of(number).name());
    
  }
}
