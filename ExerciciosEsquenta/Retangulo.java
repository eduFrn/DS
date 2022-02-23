import java.util.Scanner;
public class Retangulo {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		double base, altura, perimetro, area;

		System.out.println("Insira o valor da base:");
		base=in.nextDouble();
		
		System.out.println("Insira o valor da altura:");
		altura=in.nextDouble();

		area=base*altura;
		perimetro=altura*2+base*2;

		System.out.println("O valor da área é: "+area+"\nO valor do perímetro é: "+perimetro);
	}
}