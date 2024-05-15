//Faça um programa que receba o salário de um funcionário, calcule e mostre o novo salário,
//sabendo-se que este sofreu um aumento de 25%.

import java.util.Scanner;
public class Main
{
    public static void main (String[]args) {
    Scanner input = new Scanner (System.in);
    double salario, novosalario;
    
    System.out.println("Informe o valor do seu salario atual: ");
    salario = input.nextDouble();
    
    novosalario = salario + (salario*0.25);
    System.out.printf("O seu novo salario é de: R$%.2f",novosalario);//para limitar o número de casas decimais usar printf %.xf(x de acordo com número de casas desejadas )
    }
}