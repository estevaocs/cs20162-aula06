package com.construcao.tempo;

import java.util.Scanner;

/**
 * Classe principal do aplicativo
 *
 * @author Estevão Cristino da Silva
 * @since 1.0
 */
public class App {

    /**
     * Metodo principal
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] cpf = new int[11];
        String num;

        Scanner sc = new Scanner(System.in);
        VerificaMenorTempo c = new VerificaMenorTempo();

        boolean sair = false;
        while (sair == false) {
            
            try {
            System.out.println("Digite um cpf:");
            num = (sc.nextLine());
            num = num.replaceAll("[^0-9]*", "");
            if (num.length() == 11) {
                for (int i = 0; i < 11; i++) {
                    cpf[i] = Integer.parseInt(num.substring(i, i + 1));
                }

                System.out.println(c.menorTempo(cpf));
                sair = true;

            } else {

                System.out.println("isso não é um cpf");

            }
            } catch (Exception exception) {
                System.out.println(exception);
            }
        }
    }

}
