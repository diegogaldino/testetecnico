import java.util.Scanner;

public class Tinta {
	public static void main(String[] args) {
		double area, qtdlata, preco;

		Scanner recebe = new Scanner(System.in);

		System.out.println("Tamanho da area: ");
		area = recebe.nextInt();

		qtdlata = (area / 3) / 18;

		if (qtdlata != (int) qtdlata) {
			qtdlata += 1;
		}
		preco = (int) qtdlata * 80;
		System.out.println("QTD: " + (int) qtdlata + " Pre�o: " + preco);
	}
}
