/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.mgm.project1;

import java.util.Scanner;

/**
 *
 * @author MAGA
 */
public class Legkisebb {
  public static void main(String[] args) {
    double a,b,c,number;
    Scanner input=new Scanner(System.in);
    System.out.println("type a number");
    while (!input.hasNextDouble())
    {
    System.out.println("Invalid input\n Type a double number:");
    input.next();
    }
    a=input.nextDouble();
    System.out.println("type a 2nd number");
    while (!input.hasNextDouble())
    {
    System.out.println("Invalid input\n Type a double number:");
    input.next();
    }
    b=input.nextDouble();
    System.out.println("type a 3rd number");
    while (!input.hasNextDouble())
    {
    System.out.println("Invalid input\n Type a double number:");
    input.next();
    }
    c=input.nextDouble();
    number=Double.MAX_VALUE;
    if(a<number)number=a;
    if(b<number)number=b;
    if(c<number)number=c;
    System.out.println("The smallest is: "+number);
  }
}
