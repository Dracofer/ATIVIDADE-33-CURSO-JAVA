package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		double x = 0;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");

		int n = sc.nextInt();
		Double[] vect = new Double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			if (vect[i] >= x ) {
				x = vect[i];
			}
		}
			double numeroMaior = vect[0];
		    double posicaoNumeroMaior = 0;

		    for (int i=1; i<n; i++) {
		        if (vect[i] > numeroMaior) {
		        	numeroMaior = vect[i];
		            posicaoNumeroMaior = i;
		        }
		}
		System.out.println("");
		System.out.printf("MAIOR VALOR = %.1f%n", x);
		System.out.printf("POSICAO DO MAIOR VALOR = %.0f%n", posicaoNumeroMaior );

		sc.close();
	}

}
