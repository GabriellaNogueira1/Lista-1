// Faça um programa que receba o peso de uma pessoa, calcule e mostre:
//a) O seu novo peso, se a pessoa engordar 15% sobre o peso digitado
//b) O seu novo peso, se a pessoa emagrecer 20% sobre o peso digitado

import java.util.Scanner;
public class Main{
    
    public static void main(String[] args){
	    Scanner ent = new Scanner (System.in);
	    double peso, engordou, emagreceu;
	    
	    System.out.println("Informe seu peso atual: ");
	    peso=ent.nextDouble();
	    
	    engordou=peso+(peso*0.15);
	    emagreceu=peso-(peso*0.20);
	    
	    System.out.println("Caso engorde 15% seu peso será "+engordou+"kg e caso emagreça 20% seu peso será "+emagreceu+"kg");
    }
}