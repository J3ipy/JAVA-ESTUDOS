package edu.jp.primeirosprogramas;
import java.util.Scanner;

public class Pesos {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        double kg;
        System.out.print("Quantos kilos possui este atleta: ");
        kg = ler.nextDouble();
        if (kg <= 60.0){
            System.out.print("Peso Pena");
        }else if(kg <= 70.0){
            System.out.print("Peso Médio");
        }else{
            System.out.print("Peso Pesado");
        }
    }

}
