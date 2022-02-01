package ProjetoG2;

import java.util.Scanner;

public class Consumo{
	
	Scanner leia = new Scanner(System.in);

	//atributo
	private double kcalConsumo;
	 
	//metodo construtor
	public Consumo() {
		
	 }

	//vari�vel
	int opcAli, unidade;
	double kcalAli;
	
	//m�todo simples
	public void listaAlimentos() {
		System.out.println("\n\t\tESCOLHA SEU ALIMENTO");
		System.out.println("\n1-Arroz");
		System.out.println("2-Feij�o");
		System.out.println("3-Frango");
		System.out.println("4-Macarronada");
		System.out.println("5-P�o");
		System.out.println("6-Volta");
		
		do 
		{
		opcAli = leia.nextInt();
		switch(opcAli) {
			case 1:
				kcalAli = 100;
				System.out.println("\nQuantas escumadeiras de arroz voc� comeu?");
				unidade = leia.nextInt();
				kcalConsumo += kcalAli*unidade;
				break;
				
			case 2:
				kcalAli = 50;
				System.out.println("\nQuantas conchas de feij�o voc� comeu?");
				unidade = leia.nextInt();
				kcalConsumo += kcalAli*unidade;
				break;
				
			case 3:
				kcalAli = 150;
				System.out.println("\nQuantos fil�s de frango voc� comeu?");
				unidade = leia.nextInt();
				kcalConsumo += kcalAli*unidade;
				break;
				
			case 4:
				kcalAli = 200;
				System.out.println("\nQuantas escumadeiras de macarronada voc� comeu?");
				unidade = leia.nextInt();
				kcalConsumo += kcalAli*unidade;
				break;
				
			case 5:
				kcalAli = 70;
				System.out.println("\nQuantos p�es voc� comeu?");
				unidade = leia.nextInt();
				kcalConsumo += kcalAli*unidade;
				break;
				
			case 6:
				break;
				
			default:
				System.out.println("\nOp��o inv�lida! Por favor selecione outra op��o:");
				break;
		} 
		} while(opcAli > 6 || opcAli <0);
	}
	
	//Getter & Setter
	public double getKcalConsumo() {
		return kcalConsumo;
	}

	public void setKcalConsumo(double kcalConsumo) {
		this.kcalConsumo = kcalConsumo;
	}
	
	public Scanner getLeia() {
		return leia;
	}

	public void setLeia(Scanner leia) {
		this.leia = leia;
	}

	public int getOpcAli() {
		return opcAli;
	}

	public void setOpcAli(int opcAli) {
		this.opcAli = opcAli;
	}

	public int getUnidade() {
		return unidade;
	}

	public void setUnidade(int unidade) {
		this.unidade = unidade;
	}

	public double getKcalAli() {
		return kcalAli;
	}

	public void setKcalAli(double kcalAli) {
		this.kcalAli = kcalAli;
	}
	 //teste
}
