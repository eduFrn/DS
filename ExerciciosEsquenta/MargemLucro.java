import java.util.Scanner;
public class MargemLucro {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double preco, precoVenda, margemLucro;
		int resposta;
		
		do {
			System.out.println("Digite o valor do pre�o:");
			preco=in.nextDouble();
			
			System.out.println("Digite a margem de lucro:");
			margemLucro=in.nextDouble();
			
			precoVenda=preco+(preco/100*margemLucro);
			System.out.printf("O pre�o de venda �: R$%.2f\n", precoVenda);
			
			System.out.println("\nDeseja continuar a execu��o do programa?");
			System.out.println("1-Sim\n2-N�o");
			resposta=in.nextInt();
		}while(resposta==1);
		
		in.close();
	}

}
