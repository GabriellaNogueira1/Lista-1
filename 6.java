//Faça um programa que receba uma temperatura em Celsius, calcule e mostre essa temperatura em Fahrenheit (F = (C*1,8) + 32)

import java.util.Scanner;
public class Main
{
	public static void main(String[] args){
	    Scanner ent = new Scanner (System.in);
        Double celsius, fahrenheit;
        
        System.out.println("Informe a temperatura em graus celsius: "); 
        celsius=ent.nextDouble();
        
        fahrenheit=(celsius*1.8)+32;
        System.out.printf("A temperatura em graus Fahrenheit é: %.0f",fahrenheit);
	}
}
