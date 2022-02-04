package ProjetoG2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner; //

public class cadastro {

	Scanner leia = new Scanner(System.in);

	Consumo consumo = new Consumo();

	Gasto gasto = new Gasto();

	private String nome, sexo;
	private int idade, op = 0, altura;
	private double peso, imc = 0, tmb = 0;
	private List<Double> historicoCons = new ArrayList<Double>();
	private List<Double> historicoGast = new ArrayList<Double>();

	public cadastro(String nome, String sexo, int idade, int op, int altura, double peso) {

		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.op = op;
		this.altura = altura;
		this.peso = peso;
		this.imc = imc;
		this.tmb = tmb;
	}

	boolean continueLoop = true;

	public String getNome() {
		return nome;
	}

	public List<Double> getHistoricoCons() {
		return historicoCons;
	}

	public void setHistoricoCons(List<Double> historicoCons) {
		this.historicoCons = historicoCons;
	}

	public List<Double> getHistoricoGast() {
		return historicoGast;
	}

	public void setHistoricoGast(List<Double> historicoGast) {
		this.historicoGast = historicoGast;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getOp() {
		return op;
	}

	public void setOp(int op) {
		this.op = op;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}

	public double getTmb() {
		return tmb;
	}

	public void setTmb(double tmb) {
		this.tmb = tmb;
	}

	public Consumo getConsumo() {
		return consumo;
	}

	public void setConsumo(Consumo consumo) {
		this.consumo = consumo;
	}

	public Gasto getGasto() {
		return gasto;
	}

	public void setGasto(Gasto gasto) {
		this.gasto = gasto;
	}

	public void inicioCadastro() {

		int opLiga = 0;
		do {

			do {
				continueLoop = true;
				try {

					System.out.println("\t\tSelecione uma op��o");
					System.out.println("1 - Inserir novos dados");
					System.out.println("2 - J� tenho cadastro");
					opLiga = leia.nextInt();
					continueLoop = false;

				} catch (InputMismatchException ex) {
					System.err.println("Op��o inv�lida, entre com um valor v�lido");
					leia.nextLine();
				}
			} while (continueLoop);

			switch (opLiga) {

			case 1: // CADASTRO/NOVOS DADOS

				historicoCons.clear();
				historicoGast.clear();
				System.out.println("Ol�! Insira seus dados abaixo.");
				System.out.println("\nNome:");
				nome = leia.next();
				do {
					continueLoop = true;
					try {

						System.out.println("\nIdade:");
						idade = leia.nextInt();
						continueLoop = false;

					} catch (InputMismatchException ex) {
						System.err.println("Op��o inv�lida, entre com um valor v�lido");
						leia.nextLine();
					}
				} while (continueLoop);

				do {
					continueLoop = true;
					try {
						System.out.println("\nSexo (F ou M):");
						sexo = leia.next();
						sexo = sexo.toUpperCase();
						if (sexo.equals("M") || sexo.equals("F")) {
							continueLoop = false;
						} else {
							System.err.println("Op��o inv�lida, entre com um valor v�lido");
						}

					} catch (InputMismatchException ex) {
						System.err.println("Op��o inv�lida, entre com um valor v�lido");
						leia.nextLine();
					}
				} while (continueLoop);

				do {
					continueLoop = true;
					try {

						System.out.println("\nAltura em cm:");
						altura = leia.nextInt();
						continueLoop = false;

					} catch (InputMismatchException ex) {
						System.err.println("Op��o inv�lida, entre com um valor v�lido");
						leia.nextLine();
					}
				} while (continueLoop);

				do {
					continueLoop = true;
					try {

						System.out.println("\nPeso:");
						peso = leia.nextDouble();
						continueLoop = false;

					} catch (InputMismatchException ex) {
						System.err.println("Op��o inv�lida, entre com um valor v�lido");
						leia.nextLine();
					}
				} while (continueLoop);

				imc = peso / (altura * altura) * 10000;

				if (sexo.equals("M")) {
					tmb = 66.5 + (13.75 * peso) + (5.003 * altura) - (6.755 * idade);
					tmb *= 1.25;
				} else if (sexo.equals("F")) {
					tmb = 655.1 + (9.563 * peso) + (1.850 * altura) - (4.676 * idade);
					tmb *= 1.20;
				}

			case 2:
				break;
			default:
				System.err.println("Op��o inv�lida, entre com um valor v�lido");
				break;
			}
		} while (opLiga > 2 || opLiga < 0);

	}

	public void appSelect() {

		Scanner leia = new Scanner(System.in);

		do {
			int opApp = 0;
			do {
				continueLoop = true;
				try {

					System.out.println("\n\n\t\tSelecione uma op��o");
					System.out.println("1 - Iniciar um novo dia");
					System.out.println("2 - Adicionar consumo");
					System.out.println("3 - Adicionar gastos");
					System.out.println("4 - Resumo di�rio");
					System.out.println("5 - Hist�rico");
					System.out.println("6 - Op��es");
					opApp = leia.nextInt();
					continueLoop = false;

				} catch (InputMismatchException ex) {
					System.err.println("Op��o inv�lida, entre com um valor v�lido");
					leia.nextLine();
				}
			} while (continueLoop);

			switch (opApp) {

			case 1: // M�TODO NOVO DIA
				if (consumo.getKcalConsumoDia() != 0 || gasto.getKcalGastoDia() != 0) { // Salva s� se for != 0

					if (historicoCons.size() == 7 || historicoGast.size() == 7) { // Desloca Lista pra liberar ultimo
																					// espa�o
						historicoCons.remove(0);
						historicoGast.remove(0);
					}

					historicoCons.add(consumo.getKcalConsumoDia());
					historicoGast.add(gasto.getKcalGastoDia() + tmb);

					consumo.setKcalConsumoDia(0);
					gasto.setKcalGastoDia(0);
					System.out
							.println("Voc� iniciou um novo dia! Os dados de ontem " + "foram salvos no seu hist�rico!");

				} else {
					System.out.println("\t\tAinda n�o foram inseridos dados no dia de hoje!");
				}

				break;

			case 2:

				consumo.listaAlimentos();

				break;

			case 3:

				gasto.listaExerc�cios();

				break;

			case 4: // M�TODO DI�RIO

				System.out.println("At� o momento voc� j� consumiu: " + consumo.getKcalConsumoDia() + "Kcals!");
				System.out.println("At� o momento voc� j� gastou: " + (gasto.getKcalGastoDia() + tmb) + "Kcals!");// Atvd
																													// vida
																													// diaria

				if (consumo.getKcalConsumoDia() + 75 > gasto.getKcalGastoDia() + tmb) {
					System.out.println("Voc� consumiu mais calorias do que gastou, est� seguindo para um"
							+ " caminho de ganho de peso!");
				} else if (gasto.getKcalGastoDia() + tmb + 75 > consumo.getKcalConsumoDia()) {
					System.out.println("Voc� gastou mais calorias do que consumiu, est� seguindo para um"
							+ " caminho de perda de peso!");
				} else {
					System.out.println("Voc� consumiu e gastou de maneira semelhante, est� seguindo para um"
							+ "caminho de manuten��o de peso!");
				}
				break;

			case 5: // M�TODO HIST�RICO
				int op5 = 0;
				do {
					do {
						continueLoop = true;
						try {

							System.out.println("\n\n\t\tSelecione uma op��o");
							System.out.println("1 - M�dia dos seus resumos");
							System.out.println("2 - M�dia dos seus consumos");
							System.out.println("3 - M�dia dos seus gastos");
							System.out.println("4 - Voltar");
							op5 = leia.nextInt();
							continueLoop = false;

						} catch (InputMismatchException ex) {
							System.err.println("Op��o inv�lida, entre com um valor v�lido");
							leia.nextLine();
						}
					} while (continueLoop);

					switch (op5) {
					case 1:

						double somaHisCons = 0;
						double somaHisGast = 0;

						for (int i = 0; i < historicoCons.size(); i++) {

							somaHisCons += historicoCons.get(i);
						}

						for (int i = 0; i < historicoCons.size(); i++) {

							somaHisGast += historicoCons.get(i);
						}

						double mediaHis = (somaHisCons - somaHisGast) / historicoCons.size();

						System.out.print("Nos �ltimos " + historicoCons.size() + " voc� ficou em ");

						if (mediaHis + 75 > 0) {
							System.out.print("um super�vit em m�dia de " + mediaHis + "Kcals por dia!"
									+ "\nIsso indica um ganho de peso!");
						} else if (mediaHis - 75 < 0) {
							System.out.print("um d�ficit em m�dia de " + (mediaHis * -1) + "Kcals por dia!"
									+ "\nIsso indica uma perda de peso!");
						} else {

							if (mediaHis < 0) {
								mediaHis = mediaHis * -1;
							}
							System.out.print("uma m�dia de " + mediaHis + "Kcals por dia!"
									+ "\nEsse baixo valor indica manuten��o de peso!");
						}

						break;
					case 2:
						double somaConsumo = 0;

						for (int i = 0; i < historicoCons.size(); i++) {

							somaConsumo += historicoCons.get(i);
						}

						System.out.println("Nos �ltimos " + historicoCons.size() + " dias, voc� consumiu em m�dia "
								+ (somaConsumo / historicoCons.size()) + "Kcals!");

						break;
					case 3:

						double somaGasto = 0;

						for (int i = 0; i < historicoGast.size(); i++) {

							somaGasto += historicoGast.get(i);
						}

						System.out.println("Nos �ltimos " + historicoGast.size() + " dias, voc� gastou em m�dia "
								+ (somaGasto / historicoGast.size()) + "Kcals!");
						break;

					case 4:
						break;
					default:
						System.err.println("Op��o inv�lida, entre com um valor v�lido");
						break;
					}

				} while (op5 > 4 || op5 < 1);
				break;

			case 6: // M�TODO OP��ES
				int op6 = 0;
				do {
					do {
						continueLoop = true;
						try {

							System.out.println("\n\n\t\tSelecione uma op��o");
							System.out.println("1 - Iniciar um novo cadastro");
							System.out.println("2 - Alterar meu peso");
							System.out.println("3 - Alterar minha idade");
							System.out.println("4 - Voltar");
							op6 = leia.nextInt();
							continueLoop = false;

						} catch (InputMismatchException ex) {
							System.err.println("Op��o inv�lida, entre com um valor v�lido");
							leia.nextLine();
						}
					} while (continueLoop);

					switch (op6) {
					case 1:
						inicioCadastro();
						break;
					case 2:
						System.out.println("Insira o novo peso:");
						peso = leia.nextDouble();
						imc = peso / (altura * altura) * 10000;

						if (sexo.equals("M")) {
							tmb = 66.5 + (13.75 * peso) + (5.003 * altura) - (6.755 * idade);
						} else if (sexo.equals("F")) {
							tmb = 655.1 + (9.563 * peso) + (1.850 * altura) - (4.676 * idade);
						}
						break;
					case 3:
						System.out.println("Insira a nova idade:");
						idade = leia.nextInt();
						imc = peso / (altura * altura) * 10000;

						if (sexo.equals("M")) {
							tmb = 66.5 + (13.75 * peso) + (5.003 * altura) - (6.755 * idade);
						} else if (sexo.equals("F")) {
							tmb = 655.1 + (9.563 * peso) + (1.850 * altura) - (4.676 * idade);
						}
						break;
					case 4:
						break;
					default:
						System.err.println("Op��o inv�lida, entre com um valor v�lido");
					}
				} while (op6 > 4 || op6 < 1);

				break;

			default:
				System.err.println("Op��o inv�lida, entre com um valor v�lido");
			}

		} while (true);

	}
}
