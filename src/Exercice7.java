
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
public class Exercice7 {
    public static void main(String[] args){
int[] table;
int plusGrand;
table = new int[6];
for (int i = 0; i<table.length; i++){
System.out.println("Entrez l’entier " + (i+1) + ": ");
Scanner sc= new Scanner(System.in);
table[i]= sc.nextInt();
}
plusGrand = table[0];
for (int i = 1; i<table.length; i++){
if (table[i] > plusGrand){
plusGrand = table[i];
}
}
System.out.println("Plus grand: " + plusGrand);
}
}
    

