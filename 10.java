//10. Faça um programa que receba o raio, calcule e mostre:
//O comprimento de uma esfera (C = 2 *  π  * R)
//A área de uma esfera (A = π * R2)
//O volume de uma esfera (V = ¾ *  π  * R3)

import java.util.Scanner;
public class Main
{
    public static void main (String[]args) {
    Scanner input = new Scanner (System.in);
    Double raio, comprimento, area, volume;
    
    System.out.println("Informe o raio: ");
    raio=input.nextDouble();
    
    comprimento=2*Math.PI*raio;
    area=Math.PI*(raio*raio);
    volume=(4.0 / 3)*Math.PI*(raio*raio*raio);
    System.out.printf("O comprimento da esfera é %.2f",comprimento);
    System.out.printf(" a área tem valor %.2f",area);
    System.out.printf(" e o volume é de %.2f",volume);
    }
}
    
    