
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sepele Cyrille
 */
public class Exercice1 {
      public static void main(String[] args){
    int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
      int n;
      int i;
      boolean trouve=false;
      System.out.println("entrez le nombre a chercher:");
      Scanner sc = new Scanner(System.in);
      n=sc.nextInt();
      for( i=0; i<tab.length;i++){
          if(tab[i]==n){
              trouve=true;
          }
          }
      if(trouve){
          System.out.println("le nombre est dans le tableau");
      } else{
          System.out.println("le nombre n'est pas dans le tableau");
      }
          
      }
      
      
      
}
