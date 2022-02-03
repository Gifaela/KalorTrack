package ProjetoG2;

import java.util.Scanner;

public class Gasto{
    
    Scanner leia = new Scanner(System.in);

    //atributo
    private double kcalGastoDia;
     
    //metodo construtor
    public Gasto () {
    
     }


    //vari�vel
    int opcExerc, tempo;
    double kcalExerc;
    
    //m�todo simples
    public void listaExerc�cios() {
        System.out.println("\n\t\tESCOLHA SEU EXERC�CIO");
        System.out.println("\n1-Caminhada");
        System.out.println("2-Corrida");
        System.out.println("3-Bicicleta");
        System.out.println("4-Muscula��o");
        System.out.println("5-Alongamento");
        System.out.println("6-Volta");
        
        do {
            opcExerc = leia.nextInt();
            switch (opcExerc) {
            case 1:
                kcalExerc = 10;
                System.out.println("\nPor quantos minutos voc� praticou esse exerc�cio?");
                tempo = leia.nextInt();
                kcalGastoDia += kcalExerc * tempo;
                System.out.println("Voc� gastou" + kcalGastoDia + " Kcal! Continue assim!");
                break;

            case 2:
                kcalExerc = 5;
                System.out.println("\nPor quantos minutos voc� praticou esse exerc�cio?");
                tempo = leia.nextInt();
                kcalGastoDia += kcalExerc * tempo;
                System.out.println("Voc� gastou" + kcalGastoDia + " Kcal! Continue assim!");
                break;

            case 3:
                kcalExerc = 15;
                System.out.println("\nPor quantos minutos voc� praticou esse exerc�cio?");
                tempo = leia.nextInt();
                kcalGastoDia += kcalExerc * tempo;
                System.out.println("Voc� gastou" + kcalGastoDia + " Kcal! Continue assim!");
                break;

            case 4:
                kcalExerc = 20;
                System.out.println("\nPor quantos minutos voc� praticou esse exerc�cio?");
                tempo = leia.nextInt();
                kcalGastoDia += kcalExerc * tempo;
                System.out.println("Voc� gastou" + kcalGastoDia + " Kcal! Continue assim!");
                break;

            case 5:
                kcalExerc = 7;
                System.out.println("\nPor quantos minutos voc� praticou esse exerc�cio?");
                tempo = leia.nextInt();
                kcalGastoDia += kcalExerc * tempo;
                System.out.println("Voc� gastou" + kcalGastoDia + " Kcal! Continue assim!");
                break;

            case 6:
                break;

            default:
                System.out.println("\nOp��o inv�lida! Por favor selecione outra op��o:");
                break;
            }
        } while (opcExerc > 6 || opcExerc < 0);
    }

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
    
    //Getter & Setter
    
     
}