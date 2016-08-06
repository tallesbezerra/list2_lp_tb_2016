import java.util.Scanner;
class MaiorMenor{
	public static void main(String[] args){
	Scanner ler = new Scanner(System.in);
	int i,min,max,n=5;
	int[] a = new int[n];
	
	for(i=0;i<n;i++){
		System.out.printf("Informe um numero: ");
		a[i] = ler.nextInt();
		}
			
	min=a[0];
	max=a[0];
	for(i=1;i<n;i++){
		if(a[i]<min){
			min=a[i];
			}
		if(a[i]>max){
			max=a[i];
			}
		}
		
	System.out.printf("Menor valor: %d\n",min);
	System.out.printf("Maior valor: %d\n",max);
	
	}
}
