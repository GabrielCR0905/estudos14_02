package pacote2;
import java.util.Scanner;
public class bissexto {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Digite um Ano: ");
		int ano = scanner.nextInt();
		
		if((ano % 4 == 00 && ano % 100 != 0) || (ano % 400 == 0)) {
			System.out.print(" o ano que vc digitou é Bissexto");
			
		}
		else {
			System.out.print("O ano que vc digitou nao é Bissexto");
		}
scanner.close();
	}

}
