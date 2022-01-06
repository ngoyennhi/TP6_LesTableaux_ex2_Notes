package ex2Notes;

import java.util.Arrays;
import java.util.Scanner;

public class NotesSuperieuresMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] tab ; // celui-ci un tableau vide qui contient les numéro en type int
		int n;
		int nombreElevePlusMoyenne = 0;
		n = 10;
		tab = new int[n]; // creer un tableau 5 élements
		Scanner src = new Scanner(System.in);
		for(int i = 0; i<tab.length;i++) {
			//saisir les numeros selon sa positon dans le tableau
			System.out.println("Saissiez votre numero, svp");
			tab[i] = src.nextInt();
		};
		 System.out.println("Tableau origin est: "+Arrays.toString(tab));
		 
		 Float moyenneNotes = averageTab(tab);
		 
		 
		for (int i = 0; i < tab.length-1; i++) {        

			if(tab[i] >= moyenneNotes){		
				nombreElevePlusMoyenne++;
                }
            } System.out.println("Nombre d'elèves qui ont le note superieur le note moyenne: "+nombreElevePlusMoyenne);
		};
		
	
	public static float averageTab(int[] tab) {
		// calcul la moyenne
				//Une variable "somme" ajoute a chaque itération la valeur de la position courante, 
				int somme = 0;
				for(int i=0;i<tab.length;i++){
					somme+=tab[i]; // calcul somme total
				}
				//"somme" est divisée par la taille du tableau
				float moyenne = somme/tab.length;
				
				System.out.println("la moyenne est " + moyenne) ;
				return moyenne;
	}
	
	
}
