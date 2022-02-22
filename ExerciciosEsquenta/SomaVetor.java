import java.util.Scanner;
public class SomaVetor {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a[], b[], c[], i;
		
		a = new int[10];
		b = new int[10];
		c = new int[10];
		
		for(i=0;i<10;i++) {
			System.out.println("Insira o "+(i+1)+" elemento do vetor A:");
			a[i]=in.nextInt();
		}
		
		for(i=0;i<10;i++) {
			System.out.println("Insira o "+(i+1)+" elemento do vetor B:");
			b[i]=in.nextInt();
			
			c[i]=a[i]+b[i];
		}
		
		System.out.println("\nVetor C:");
		
		for(i=0;i<10;i++) {
			System.out.print(c[i]+" ");
		}
		
		in.close();
	}

}
