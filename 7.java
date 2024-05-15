//Faça um programa que receba o valor do salário mínimo e o valor do salário de um funcionário, calcule e mostre a quantidade 
//de salários mínimos que ganha esse funcionário.


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner ent = new Scanner (System.in);
	    int salariominimo, salariofuncionario, valor;
	 
		System.out.println("Informe o seu salário atual: ");
		salariofuncionario=ent.nextInt();
		
		System.out.println("Informe o valor do salário mínimo atual: ");
		salariominimo=ent.nextInt();
		
		valor=salariofuncionario/salariominimo;
		
		System.out.println("Você recebe "+valor+" salários mínimos.");
	}
}
