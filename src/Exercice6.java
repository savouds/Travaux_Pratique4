
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
public class Exercice6 {
    
    public static void main(String[] args){
int[] table;
table = new int[6];
for (int i = 0; i<table.length; i++){
System.out.println("Entrez l’entier " + (i+1) + ": ");
Scanner sc= new Scanner(System.in);
table[i] = sc.nextInt();
}
System.out.println("Voici le tableau: ");
for (int i = 0; i<table.length; i++){
System.out.println(" " + table[i]);
}
System.out.println();
}
}

