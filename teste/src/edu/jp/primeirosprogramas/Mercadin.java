package edu.jp.primeirosprogramas;
import java.util.Scanner;
public class Mercadin {
    public static void main (String[] args){
       Scanner ler = new Scanner(System.in);
       int qtdc;int qtdp; int pix;
       double chicla = 0.50; double panes = 1.0; double total;
       System.out.print("Informe quantos chicletes: ");
       qtdc = ler.nextInt();
       System.out.print("Informe quantos pães: ");
       qtdp = ler.nextInt();
       total = (qtdc * chicla) + (qtdp * panes);
       System.out.println("Digite: \n1 para Pix \n2 para cartão");
       pix = ler.nextInt();
       if (pix == 1){
           System.out.printf("O total ficou: %.2f%n-[20 por cento de desconto]", (total * 0.80));
        }else if (pix == 2){
           System.out.printf("O total ficou: %.2f%n-[5 por cento de desconto]", (total * 0.95));
       }else{
           System.out.print("ERROR 404");
       }
    }
}
