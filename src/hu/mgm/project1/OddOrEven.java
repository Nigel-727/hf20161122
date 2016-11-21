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
public class OddOrEven {
   public static void main(String[] args) {
    int number;
    
    initialise();
    number = getInputNumber();
    output(oddOrEvenCalculation(number));
  }
  
  public static void initialise(){
    System.out.println("Input: integer number ; output: Odd || Even");
  }
  
  public static int getInputNumber(){
    int x=0;
    boolean goodNumber = false;
    
   
    Scanner input= new Scanner(System.in);
    System.out.println("Please enter a integer type number: ");
    
    while (!input.hasNextInt())
{
    System.out.println("Invalid input\n Type the double-type number:");
    input.next();
}
    return x=input.nextInt();
  }
  
  public static String oddOrEvenCalculation(int number){
    String oddOrEven;
    
    if(number%2==0 || number==0){
      oddOrEven="Even";
    }else{
      oddOrEven="Odd";
    }
    
  return oddOrEven;
  }
  
  public static void output(String oddOrEven){
    System.out.printf("The absoulute value of the entered number: %s %n", oddOrEven);
    
  }
}

