package aula26032024OOp;

import java.util.Scanner;

public class Locadora {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Carro C = new Carro();
		System.out.println("Digite a marca do carro: ");
		C.marca = teclado.nextLine();
		System.out.println("Digite o modelo do carro: ");
		C.modelo = teclado.nextLine();
		C.devolver();
		C.exibirDados();

	}

}
