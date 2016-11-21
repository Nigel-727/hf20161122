/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.mgm.project1;

/**
 *
 * @author MAGA
 */
public class ThrueTable3 {
  
  public static void main(String[] args) {
    System.out.println("A kizáró vagy művelet igazságtáblája"+
      "\na       b       a vagy b"+
      "\nfalse   false   "+(false^false)+
      "\nfalse   true    "+(false^true)+
      "\ntrue    false   "+(true^false)+
      "\ntrue    true    "+(true^true));
  }
  
}
