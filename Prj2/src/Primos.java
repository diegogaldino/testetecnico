import java.util.Scanner;

public class Primos {

	public static void main(String[] args) {
		
		int inicio, fim;
		String resultado="";
		Scanner recebe = new Scanner(System.in);

		System.out.println("Digite valor de inicio: ");
		inicio = recebe.nextInt();

		System.out.println("Digite valor de fim: ");
		fim = recebe.nextInt();
		
        for (int i = inicio; i <= fim; i++) {
            for (int j = inicio; j <= i; j++) {
                if (((i % j) == 0) && (j != i)) {
                    break;
                }else{             	
                	resultado=resultado+i+" ";
                    break;
                }
            }
        }
        System.out.println(resultado);
	}
}
