import java.util.Scanner;
public class NumeroInvertido {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num, unidade, dezena, centena, nInvertido;
		
		System.out.println("Insira o n�mero com 3 digitos que deseja inverter:");
		num=in.nextInt();
		
		unidade=num/100;
		dezena=(num-unidade*100)/10*10;
		centena=(num-unidade*100-dezena)*100;
		
		nInvertido=unidade+dezena+centena;

		System.out.println("O n�mero invertido �: "+nInvertido);
		
		in.close();
	}

}
