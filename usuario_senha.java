import java.util.Scanner;
public class usuario_senha {
public static void main(String[] args) {
	
	Scanner scan = new Scanner (System.in);
	String usuario; 
	String senha;
	boolean valido = false;
	
	do {
		System.out.print("Informe seu nome de usu�rio: ");
		usuario = scan.next();
		
		System.out.print("Inform sua senha: ");
		senha = scan.next();
		
		if (usuario.equalsIgnoreCase(senha)) {
			System.out.println("Seu nome de usu�rio e sua senha n�o podem ser os mesmos. Tente novamente.");
		} else {
			valido = true;
			System.out.println("Bem vindo " + usuario + "!");
		}
		
	} while (!valido);
		
 
} 
}
