package curso_programacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horas;
		System.out.println("quantas horas?");
		horas = sc.nextInt();
		if (horas < 12) {
			System.out.println("bom dia");
		} else if (horas < 18) {
			System.out.println("boa tarde");
		} else {
			System.out.println("boa noite");
		}

		sc.close();
	}
}