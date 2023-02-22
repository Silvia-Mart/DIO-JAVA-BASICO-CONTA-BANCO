package contaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		String agencia;
		String nomeCliente;
		double saldo = 237.48;
		
		System.out.println("Por favor, digite o número da Agência !");
		numero = scan.nextInt();
		System.out.println("Por favor, digite a Agência !");
		agencia = scan.next();
		System.out.println("Por favor, digite seu nome !");
		nomeCliente = scan.next();
		System.out.println("Olá "  + nomeCliente + ", obrigado por criar "
				+ "uma conta em nosso banco, sua agência é " + agencia + ","
				+ " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

	}

}
