//Faça um programa que receba três notas, calcule e mostre a média aritmética entre elas.

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		int nota1, nota2, nota3, media;
		
		System.out.println("Digite a primeira nota: ");
		nota1=ent.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		nota2=ent.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		nota3=ent.nextInt();
		
		media = (nota1 + nota2 + nota3)/ 3;
		System.out.println("A média das notas é " + media);
	    
	}
}
