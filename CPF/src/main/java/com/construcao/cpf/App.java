package com.construcao.cpf;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws NumberFormatException {
        int[] cpf = new int[11];
        String num;
        
        Scanner sc = new Scanner(System.in);
        Cpf c = new Cpf();
        
        System.out.println("Digite um cpf:");
        num = sc.nextLine();
        num = num.replaceAll("[^0-9]*", "");
        System.out.println(num);
        if(num.length() == 11) {
            for(int i = 0; i < 11; i++){
                cpf[i] = Integer.parseInt(num.substring(i, i+1));
            }
            
            if(c.cpf(cpf) && c.cpf2(cpf)){
                System.out.println("cpf valido!");
            } else {
                System.out.println("cpf invalido!");
            }
        }
    }
}

