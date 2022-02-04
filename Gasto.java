package ProjetoG2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Gasto {

	public Gasto() {
	}

	Scanner leia = new Scanner(System.in);

	// atributo
	private double kcalGastoDia;

	// vari�vel
	int opcExerc, tempo;
	double kcalExerc;
	boolean continueLoop = true;

	// m�todo simples
	public void listaExerc�cios() {
		do {
			continueLoop = true;
			try {

				System.out.println("\n\t\tESCOLHA SEU EXERC�CIO");
				System.out.println("\n1-Caminhada");
				System.out.println("2-Corrida");
				System.out.println("3-Bicicleta");
				System.out.println("4-Muscula��o");
				System.out.println("5-Alongamento");
				System.out.println("6-Volta");

				opcExerc = leia.nextInt();
				continueLoop = false;

			} catch (InputMismatchException ex) {
				System.err.println("Op��o inv�lida, entre com um valor v�lido");
				leia.nextLine();
			}
		} while (continueLoop);

		do {
			switch (opcExerc) {
			case 1:
				System.out.println("\nPor quantos minutos voc� praticou esse exerc�cio?");
				tempo = leia.nextInt();
				kcalExerc = 3.3 * /* getPeso() */tempo;
				kcalGastoDia += kcalExerc;
				System.out.println("Voc� gastou" + kcalGastoDia + " Kcal! Continue assim!");
				break;

			case 2:
				System.out.println("\nPor quantos minutos voc� praticou esse exerc�cio?");
				tempo = leia.nextInt();
				kcalExerc = 8 * /* getPeso() */tempo;
				kcalGastoDia += kcalExerc;
				System.out.println("Voc� gastou" + kcalGastoDia + " Kcal! Continue assim!");
				break;

			case 3:
				System.out.println("\nPor quantos minutos voc� praticou esse exerc�cio?");
				tempo = leia.nextInt();
				kcalExerc = 8 * /* getPeso() */tempo;
				kcalGastoDia += kcalExerc;
				System.out.println("Voc� gastou" + kcalGastoDia + " Kcal! Continue assim!");
				break;

			case 4:
				System.out.println("\nPor quantos minutos voc� praticou esse exerc�cio?");
				tempo = leia.nextInt();
				kcalExerc = 5.5 * /* getPeso() */tempo;
				kcalGastoDia += kcalExerc;
				System.out.println("Voc� gastou" + kcalGastoDia + " Kcal! Continue assim!");
				break;

			case 5:
				System.out.println("\nPor quantos minutos voc� praticou esse exerc�cio?");
				tempo = leia.nextInt();
				kcalExerc = 2.5 * /* getPeso() */tempo;
				kcalGastoDia += kcalExerc;
				;
				System.out.println("Voc� gastou" + kcalGastoDia + " Kcal! Continue assim!");
				break;

			case 6:
				break;

			default:
				System.err.println("Op��o inv�lida, entre com um valor v�lido");
				break;
			}
		} while (opcExerc > 6 || opcExerc < 0);
	}

	// Getter & Setter
	public Scanner getLeia() {
		return leia;
	}

	public void setLeia(Scanner leia) {
		this.leia = leia;
	}

	public double getKcalGastoDia() {
		return kcalGastoDia;
	}

	public void setKcalGastoDia(double kcalGastoDia) {
		this.kcalGastoDia = kcalGastoDia;
	}

	public int getOpcExerc() {
		return opcExerc;
	}

	public void setOpcExerc(int opcExerc) {
		this.opcExerc = opcExerc;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public double getKcalExerc() {
		return kcalExerc;
	}

	public void setKcalExerc(double kcalExerc) {
		this.kcalExerc = kcalExerc;
	}

}