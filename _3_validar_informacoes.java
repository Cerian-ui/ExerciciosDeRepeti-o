/* Faça um programa que leia e valide as seguintes informações:
 * a. Nome: maior que 3 caracteres;
 * b. Idade: entre 0 e 150;
 * c. Sexo: "f" ou "m";
 * d. Estado Civil: 's', 'c', 'v' ou 'd';
 */
import java.util.Scanner;

public class _3_validar_informacoes {
public static void main(String[] args) {
	
	Scanner scan = new Scanner (System.in);
	
	String nome;
	int idade;
	double salario;
	String sexo;
	String estadoCivil;
	
	//Adicionei um bonus, ou seja, a cada informação inválida inserida, aparecerá uma mensagem de alerta.
	
	do {
		System.out.print("Digite o seu nome: ");
		nome = scan.next();
	}while (nome.length() <= 3);
	
	do {
		System.out.print("Digite sua idade: ");
		idade = scan.nextInt();
	}while (idade < 0 && idade > 150);
	
	do {
		System.out.print("Digite seu salário: ");
		salario = scan.nextDouble();
		if (salario <= 0)
			System.out.println("Salário inválido");
	}while (salario <= 0);
	
	do {
		System.out.print("Digite seu gênero: ");
		sexo = scan.next();
	}while (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m"));
	
	do {
		System.out.print("Digite seu Estado Civil: ");
		estadoCivil = scan.next();
	}while (!estadoCivil.equalsIgnoreCase("s") &&
		   !estadoCivil.equalsIgnoreCase("c") &&
		   !estadoCivil.equalsIgnoreCase("v") &&
		   !estadoCivil.equalsIgnoreCase("s"));
	}
}
