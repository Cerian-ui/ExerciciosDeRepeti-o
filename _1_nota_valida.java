//Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.

import java.util.Scanner;
public class nota_valida {
public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);
	
	int nota = 0; 
	
	do {
		System.out.print("Informe uma nota: ");
		nota = input.nextInt();	
		if(nota < 0 || nota > 10)
			System.out.println("Nota inválida, por favor digite um número válido");
	} while(nota < 0 || nota > 10);
		System.out.println("A nota é: " + nota);
		
}
}
