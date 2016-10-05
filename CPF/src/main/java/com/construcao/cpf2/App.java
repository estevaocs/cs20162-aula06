package com.construcao.cpf2;

import java.util.Scanner;

/**
 * Classe principal do aplicativo
 * @author Estevão Cristino da Silva
 * @since 1.0
 */
public class App {

    /**
     * Metodo principal
     * @param args
     */
    public static void main(String[] args) {
        int[] cpf = new int[11];
        String num;

        Scanner sc = new Scanner(System.in);
        Cpf2 c = new Cpf2();

        System.out.println("Digite um cpf:");
        num = (sc.nextLine());
        num = num.replaceAll("[^0-9]*", "");
        if (num.length() == 11) {
            for (int i = 0; i < 11; i++) {
                cpf[i] = Integer.parseInt(num.substring(i, i + 1));
            }

            if (c.cpf2(cpf)) {
                System.out.println("cpf valido!");
            } else {
                System.out.println("cpf invalido!");
            }

        } else {

            System.out.println("isso não é um cpf");

        }
    }
}
