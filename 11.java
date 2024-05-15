//Faça um programa que solicite ao usuário que informe os coeficientes a, b e c de uma equação de segundo grau, 
//e que imprima as raízes desta equação (considere que os valores informados sempre retornarão raízes reais para a equação).

import java.util.Scanner;
public class Main
{
    public static void main (String[]args) {
    Scanner input = new Scanner (System.in);
    double a,b,c,delta,raiz1,raiz2;
    
    System.out.println("Informe o coeficiente a: ");
    a=input.nextDouble();
    
    System.out.println("Informe o coeficiente b: ");
    b=input.nextDouble();
    
    System.out.println("Informe o coeficiente c: ");
    c=input.nextDouble();
    
    delta=java.lang.Math.pow(b,2)-4*a*c;
    System.out.println("O valor de delta é "+delta);
    if (delta>0){
    raiz1=-b+java.lang.Math.pow(delta,0.5)/(2*a);
    raiz2=-b-java.lang.Math.pow(delta,0.5)/(2*a);
    System.out.printf("O valor da primeira raiz é %.2f", raiz1);
    System.out.printf(" e o valor da segunda raiz é %.2f ",raiz2);
    }
    else{
        System.out.println("Não é possível prosseguir");
    }
    }
}   