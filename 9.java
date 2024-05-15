//Faça um programa que receba o valor dos catetos de um triângulo, calcule e mostre o valor da hipotenusa.

import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		double cateto1, cateto2, hipotenusa;
		
		System.out.println("Informe o tamanho do cateto 1 do triângulo: ");
		cateto1=ent.nextDouble();
		
		System.out.println("Informe o tamanho do cateto 2 do triângulo: ");
		cateto2=ent.nextDouble();
		
		hipotenusa=(cateto1*cateto1)+(cateto2*cateto2);
		System.out.printf("A hipotenusa desse triângulo é: %.2f", java.lang.Math.sqrt(hipotenusa));
	}
}
