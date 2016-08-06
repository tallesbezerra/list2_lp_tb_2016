import java.util.Scanner;
class MediaAluno{
	public static void main(String[] args){
	Scanner ler = new Scanner(System.in);
	double n1,n2,n3,n4,media,ex,mediaf;
	
	System.out.printf("Informe a nota 1: ");
	n1 = ler.nextDouble();
	System.out.printf("Informe a nota 2: ");
	n2 = ler.nextDouble();
	System.out.printf("Informe a nota 3: ");
	n3 = ler.nextDouble();
	System.out.printf("Informe a nota 4: ");
	n4 = ler.nextDouble();
	media=(n1+n2+n3+n4)/4;
	if(media>=7){
		System.out.printf("Nota Final: "+media+"\nAluno aprovado!\n");
		}
	else{
		System.out.printf("Informe a nota da prova final: ");
		ex = ler.nextDouble();
		mediaf=(media+ex)/2;
		if(mediaf>=5){
			System.out.printf("Nota Final: "+mediaf+"\nAluno aprovado!\n");
			}
		else{
			System.out.printf("Nota Final: "+mediaf+"\nAluno reprovado!\n");
			}
		}
	}
}
