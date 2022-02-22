import java.util.Scanner;
public class SalarioLiquido {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int numAula;
		double horaAula, desconto, salario, salarioLiquido;
		
		System.out.println("Insira a quantidade de aulas:");
		numAula=in.nextInt();
		
		System.out.println("Insira o valor da hora aula:");
		horaAula=in.nextDouble();
		
		System.out.println("Insira o percentual de desconto:");
		desconto=in.nextDouble();
		
		salario=numAula*horaAula;
		salarioLiquido=salario-(salario/100*desconto);
		
		System.out.printf("O salário líquido é: R$%.2f", salarioLiquido);
		
		in.close();
	}

}
