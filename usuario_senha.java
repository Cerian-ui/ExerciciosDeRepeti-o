/* Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações*/

import java.util.Scanner;
public class usuario_senha {
public static void main(String[] args) {
	
	Scanner scan = new Scanner (System.in);
	String usuario; 
	String senha;
	boolean valido = false;
	
	do {
		System.out.print("Informe seu nome de usuário: ");
		usuario = scan.next();
		
		System.out.print("Inform sua senha: ");
		senha = scan.next();
		
		if (usuario.equalsIgnoreCase(senha)) {
			System.out.println("Seu nome de usuário e sua senha não podem ser os mesmos. Tente novamente.");
		} else {
			valido = true;
			System.out.println("Bem vindo " + usuario + "!");
		}
		
	} while (!valido);
		
 
} 
}
