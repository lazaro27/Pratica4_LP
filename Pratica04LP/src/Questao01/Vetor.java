package Questao01;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Vetor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int [] vet = new int [10];
		float media = 0;
	
		
		for(int i = 0; i< 10; i++) {
			System.out.print("Digite a " + (i+1) + " Nota: ");
			vet[i] = ler.nextInt();
			media = media + vet[i];
			
		}
		
		Arrays.sort(vet);
		System.out.println("A Maior nota e: " + vet[9]);
		System.out.println("A Segunda maior nota e: " + vet[8]);
		System.out.println("A Terceira Maior nota e: " + vet[7]);
		System.out.println("A menor nota e: " + vet[0]);
		System.out.println("A media das notas e: " + (media/10));
		
		ler.close();

	}

}
