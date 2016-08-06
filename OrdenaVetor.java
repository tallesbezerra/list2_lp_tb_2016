import java.util.Scanner;
class OrdenaVetor{
	public static void main(String[] args){
	Scanner ler = new Scanner(System.in);
	int i,j,aux,n=5;
	int[] a = new int[n];
	
	for(i=0;i<n;i++){
		System.out.printf("Informe um numero: ");
		a[i] = ler.nextInt();
		}
	
	for(i=1;i<n;i++){
		j=i;
		while(j>0 && a[j-1]>a[j]){
			aux=a[j];
			a[j]=a[j-1];
			a[j-1]=aux;
			j=j-1;
			}
		}
	for(i=0;i<n;i++){
		System.out.printf("%d\n",a[i]);
		}
	}
}
