//Fa�a um programa que pe�a uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inv�lido e continue pedindo at� que o usu�rio informe um valor v�lido.

import java.util.Scanner;
public class nota_valida {
public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);
	
	int nota = 0; 
	
	do {
		System.out.print("Informe uma nota: ");
		nota = input.nextInt();	
		if(nota < 0 || nota > 10)
			System.out.println("Nota inv�lida, por favor digite um n�mero v�lido");
	} while(nota < 0 || nota > 10);
		System.out.println("A nota �: " + nota);
		
}
}
