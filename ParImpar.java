import java.util.Scanner;
class ParImpar{
	public static void main(String[] args){
	Scanner ler = new Scanner(System.in);
	int n;
	
	System.out.printf("Informe um numero: ");
	n = ler.nextInt();
	
	if((n%2)==0){
		System.out.printf("O numero %d e Par\n",n);
		}
	else{
		System.out.printf("O numero %d e Impar\n",n);
		}
	}
}
