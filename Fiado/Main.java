package Fiado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o nome do cliente: ");
		String nome = scanner.nextLine();

		System.out.println("Informe o telefone: ");
		String telefone = scanner.nextLine();
		Consumidor consumidor = new Consumidor(nome, telefone);

		System.out.print("Informe o valor da compra: ");
		int fiado = Integer.valueOf(scanner.nextLine());
		consumidor.registrarFiado(fiado);

		int total = consumidor.getFiado();

		if (total < 0) {
			System.out.println("Cliente " + consumidor.getNome() + " deve inserir um valor inteiro: R$" + total
					+ ", não é possivel contabilizar");
		} else {
			System.out.println("Cliente " + consumidor.getNome() + " deve: " + total);

		}

		// CTRL + Shift + F = organiza o codigo
		System.out.println("Total: " + total);

	}

	public static int somaWhile(int[] fiados) {
		int i = 0;
		int total = 0;
		while (i < fiados.length) {
			total += fiados[i];
			// total = total + fiados [i];
			i++;
		}
		return total;
	}
}
