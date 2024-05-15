//Faça um programa que calcule e mostre a tabuada de multiplicação de um número digitado pelo usuário.

import java.util.Scanner;
public class Main
{
	public static void main(String[] args){
	    Scanner input = new Scanner (System.in);
	    int n; 
	    
	    System.out.println("Informe o número: ");
	    n=input.nextInt();
	    
	    for (int i=0; i<=10; i++){
	        System.out.println(n +" X "+ i +" = "+(n*i));
	    }
	}
}
	 
	    
	    
