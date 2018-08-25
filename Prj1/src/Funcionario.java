import java.text.Format;

public class Funcionario {
	public static void main(String[] args) {

		double salario = 1000, aumento = 0.015;
		salario = salario * (aumento + 1);
		System.out.println("Ano: 2006");
		System.out.println("Salario: " + String.format("%.2f",salario));

		for (int c = 2007; c <= 2018; c++) {
			System.out.println("Ano: " + c);
			aumento = 2 * aumento;
			System.out.println("Aumento: " + aumento);
			salario = (salario * aumento) + salario;
			System.out.println("Salario: " + String.format("%.2f",salario));
		}

		System.out.println("Salario atual " + String.format("%.2f",salario) );
	}
}
