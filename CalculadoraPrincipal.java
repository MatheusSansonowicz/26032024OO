package aula26032024OOp;

public class CalculadoraPrincipal {

	public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		//c.a = 10;
		//c.b = 25;
		double res = c.somar(10, 15);
		System.out.println("O resultado da soma é: "+res);
	}

}
