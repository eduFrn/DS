import java.util.Scanner;
public class SalarioLiquidoIf {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int numAula;
		double horaAula, desconto, salario, salarioLiquido;
		
		System.out.println("Insira a quantidade de aulas:");
		numAula=in.nextInt();
		
		System.out.println("Insira o valor da hora aula:");
		horaAula=in.nextDouble();
		
		salario=numAula*horaAula;
		
		if(salario<=1212.00) {
			desconto=7.5;
		}else if(salario<=2427.35) {
			desconto=9;
		}else if(salario<=3641.03) {
			desconto=12;
		}else if(salario<=7087.22) {
			desconto=14;
		}else if(salario<=12136.79) {
			desconto=14.5;
		}else if(salario<=24273.57) {
			desconto=16.5;
		}else if(salario<=47333.46) {
			desconto=19;
		}else {
			desconto=22;
		}
		
		salarioLiquido=salario-(salario/100*desconto);
		
		System.out.printf("O salário líquido é: R$%.2f", salarioLiquido);
		
		in.close();
	}

}
