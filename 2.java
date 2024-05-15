// Faça um programa que receba o ano de nascimento de uma pessoa, o ano atual e imprima:A idade da pessoa no ano atual
// A idade que a pessoa terá em 2050

import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
	Scanner ent = new Scanner (System.in);
	int nascimento, anoatual, futuro, idade;
	
	System.out.println("Escreva seu ano de nascimento: ");
	nascimento = ent.nextInt ();
	
	System.out.println("Escreva o ano atual: ");
	anoatual = ent.nextInt ();
	
	idade = anoatual - nascimento;
	System.out.println("Atualmente você tem "+ idade + " anos e");
	
	futuro = (2050 - anoatual) + idade;
	System.out.println ("em 2050 você terá "+ futuro + " anos");
  }
}