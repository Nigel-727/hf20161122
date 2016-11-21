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
public class KarakterE {
  
  public static void main(String[] args) {
    char ch=0;
    Scanner input = new Scanner(System.in);
    
    while (ch != 'q') {
      System.out.println("Kérem adjon meg egy karaktert, majd nyomjon Entert:/n "+
              "vagy kilép(q)");      
      ch = input.next().charAt(0);      
    
    int x= (int)ch;
    
    byte volt=0;
    if(x<58 && x>47){
      System.out.println("szám");
      volt=1;
    }
    if(x>64 && x <91){
      System.out.println("nagy K");
      volt=1;
    }
    if(x>97&& x<123){
      
      System.out.println("kis K");
      volt=1;
    }
    
    if(volt==0){
      System.out.println("Nem angol nagy vagy kis karakter és nem szám.");
    }
      System.out.println("................................");
      System.out.println(Character.getNumericValue(ch));
      System.out.println((char)200);
    }
  }
  
}
