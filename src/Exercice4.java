
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
public class Exercice4 {
    public static void main(String[] args){
int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
int n, indice;
System.out.println("Entrez le nombre a inserer: ");
Scanner sc= new Scanner(System.in);
n = sc.nextInt();
System.out.println("Entrez l’indice: ");
indice = sc.nextInt();
if ((indice >= 0) && (indice < tab.length)){
System.out.println("tableau avant insertion : ");
for (int i = 0; i<tab.length; i++){
System.out.println(tab[i]);
System.out.println(" ");
}
System.out.println();
tab[indice] = n;
System.out.println("tableau après insertion : ");
for (int i = 0; i<tab.length; i++){
System.out.println(tab[i]);
System.out.println(" ");
}
System.out.println();
}else{
System.out.println("indice non valide");
}
}
}

