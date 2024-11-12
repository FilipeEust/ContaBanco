import java.util.Scanner;

public class ContaTerminal{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Conta: ");
		int numero = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Ägëncia: ");
		String agencia = scanner.nextLine();

		System.out.print("Nome Cliente: ");
		String nomeCliente = scanner.nextLine();

		System.out.print("Seu saldo: ");
		double saldo = scanner.nextDouble();
		
		scanner.close();

		System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque.",nomeCliente, agencia, numero, saldo);
	}
}
