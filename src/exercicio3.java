import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o graus Celsius: \n");
		double c = ler.nextFloat();

		Calc cal = new Calc();

		double ca = cal.calcularcelsius(c);

		System.out.printf(c + " graus Celsius convertidos em Fahrenheit é igual a %.2f", ca);

		System.out.print("\nDigite o graus Fahrenheit: \n");
		double ce = ler.nextFloat();

		double calcu = cal.calcularfarenheit(ce);

		System.out.printf(ce + " graus Fahrenheit tranformado e Celsius é igual a %.2f", calcu);

	}

}
