
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
public class Exercice5 {
    public static void main(String[] args){
int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
int indice1, indice2, memoire;
System.out.println("Entrez le premier indice: ");
Scanner sc= new Scanner(System.in);
indice1= sc.nextInt();

System.out.println("Entrez le deuxième indice: ");
indice2= sc.nextInt();
if ((indice1 < 0) || (indice1 >= tab.length)){
System.out.println("indice 1 non valide");
}else if((indice2 < 0) || (indice2 >= tab.length)){
System.out.println("indice 2 non valide");
}else{
System.out.println("tableau avant echange : ");
for (int i = 0; i<tab.length; i++){
System.out.println(tab[i]);
System.out.println(" ");

}
System.out.println();
memoire = tab[indice1];
tab[indice1] = tab[indice2];
tab[indice2] = memoire;
System.out.println("tableau après echange : ");
for (int i = 0; i<tab.length; i++){
System.out.println(tab[i]);
System.out.println(" ");
}
System.out.println();
}
}
}
    


