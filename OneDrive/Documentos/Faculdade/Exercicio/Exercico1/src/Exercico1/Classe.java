package Exercico1;
import java.util.Scanner;

public class Classe {

	public static void main(String[] args) {
		
				int a;
				int b;
				int resultado;
				int resultadoPow;
				Scanner entrada = new Scanner(System.in);
				System.out.println("Digite um numero: ");
				a = entrada.nextInt();
				System.out.println("Digite outro numero: ");
				b = entrada.nextInt();
				
				if (a >= b) {
					System.out.println("O primeiro numero digitado é maior que o segundo!");
					resultado = a - b;
					System.out.println("A subtração entre os números possui o resultado de: " + resultado);
					resultadoPow = (int) Math.pow(a, b);
					System.out.println("A potenciação possui o resultado de: " + resultadoPow);
				}
				else {
					System.out.println("O segundo numero digitado é maior que o primeiro!");
					resultado = b - a;
					System.out.println("A subtração entre os números possui o resultado de: " + resultado);
					resultadoPow = (int) Math.pow(b, a);
					System.out.println("A potenciação possui o resultado de: " + resultadoPow);
				}
			}

	}


