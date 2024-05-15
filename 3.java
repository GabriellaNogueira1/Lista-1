//Faça um programa que receba a cotação do dólar em reais, e o valor que o usuário possui em dólares. Imprima este valor em reais.

import java.util.Scanner;
public class Main
{
    public static void main (String[]args) {
	Scanner entrada  = new Scanner (System.in);
	double valordolar, dinheiro, valoremreais;
	
	System.out.println("Informe a cotação atual do dolár em reais: ");
    valordolar = entrada.nextDouble();
	
	System.out.println("Digite o valor que possuí em dolares: ");
	dinheiro = entrada.nextDouble();
	
	valoremreais = valordolar * dinheiro;
	System.out.printf("O valor que você possuí em reais é R$ %.2f",valoremreais); // para limitar número de casas decimais, usar printf e %.2f(o número é de acordo com o número que deseje limitar)
    }
}