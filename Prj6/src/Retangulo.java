import java.util.Scanner;

public class Retangulo {

	private double base;
	private double altura;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calculaArea(double base, double altura) {
		return base * altura;
	}

	public double calculaPerimetro(double base, double altura) {
		return (base + altura) * 2;
	}

	
}
