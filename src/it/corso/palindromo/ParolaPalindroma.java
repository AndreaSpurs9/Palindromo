package it.corso.palindromo;

import java.util.Scanner;

public class ParolaPalindroma {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char [] a;
		boolean controllo=true;
		String parola;
		int size;
		System.out.println("Inserisci una parola per determinare se è o meno palindroma");
		parola=sc.nextLine();
		a=parola.toCharArray();
		
		size=a.length-1;
		//con array di caratteri
		for(int i=0; i<size; i++) {
			if(a[i]!=a[size-i]) {
				controllo=false;
			}
		}
		//con stringa
		int j=parola.length()-1;
		for(int i=0; i<size; i++) {
				if (parola.charAt(i)!=parola.charAt(j)) {
					controllo=false;
				}
				j--;
		}
		
		//stampo il risultato
		if(controllo) {
			System.out.println("la parola "+parola+" è palindroma");
		}else {
			System.out.println("la parola "+parola+" non è palindroma");
		}
	}

}
