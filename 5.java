//Faça um programa que calcule e mostre a área de um losango AREA = (DIAGONAL MAIOR * DIAGONAL MENOR)/2

import java.util.Scanner;
public class Main
{
	public static void main(String[] args){
	    Scanner ent = new Scanner (System.in);
	    double diagonalmaior, diagonalmenor, area;
	    
	    
	System.out.println("Informe a diagonal maior: ");
	diagonalmaior=ent.nextDouble();

	System.out.println("Informe a diagonal menor: ");
	diagonalmenor=ent.nextDouble();
	
	area=(diagonalmaior * diagonalmenor)/2;
	System.out.printf("O tamanho da área é:%.2f",+area);//Para limitar o número de casas decimais usar printf %.xf(x de acordo com número de casas desejadas) além de utilizar a virgula após o fechamento de aspas. )

	
	}
}
