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
public class Husvet {
  static int M, N;
  
  
  public static void main(String[] args) {
    
    int number = 0;
    int a,b,c,d,e;
    char ch='c';
    
    String husvetNapja;
    

    System.out.println("Ha megad egy 1900 és 2099 közéeső évszámot"
            + " megadom hányadikára fog esni a Húsvét vasárnap az évben.");

    Scanner input = new Scanner(System.in);

    while (number < 1900 || number > 2099) {
      System.out.println("Please enter a integer type number: ");
      while (!input.hasNextInt()) {
        System.out.println("Invalid input\n integer number:");
        input.next();
      }
      number = input.nextInt();
      input.nextLine();
    }
    
    while (ch != 'j' && ch!='g') {
      System.out.println("Kérem válasszon Julian - 'j' vagy Gregorian 'g': ");      
      ch = input.next().charAt(0);      
    }
    
    if(ch == 'j'){
      M=15;
      N=6;
    }else{
      M=24;
      N=5;
    }
    
    a=number%19;
    b=number%4;
    c=number%7;
    
    d=(19*a+M)%30;
    e=(2*b+4*c+6*d+N)%7;
    
    if((d+e)<10){
      husvetNapja="marcius-"+(d+e+22); 
    }else{
      int x=(d+e-9);
      if(x==26){
        x=19;
      }else if(x==25 && d==28 && e==6 && a>10){
        x=18;        
      }
      husvetNapja="aprilis-"+(x-1);
    }
    
    System.out.printf("Az %d évben, húsvét vasárnapja %s %n",number, husvetNapja);
  }

}
