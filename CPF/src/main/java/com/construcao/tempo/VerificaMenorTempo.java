/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.construcao.tempo;

import com.construcao.cpf.Cpf;
import com.construcao.cpf.Cpf;
import com.construcao.cpf3.Cpf3;
import com.construcao.cpf2.Cpf2;

/**
 * Classe que verifica qual tempo gasto pelo metodos cpf cf2 e cpf3, e retorna o
 * qual é o mais eficiente em questao de tempo de execucao.
 * 
 * @author Estevao Cristino da silva
 * @since 1.0
 */
public class VerificaMenorTempo {
    
    /**
     * Metodo que pega o tempo de execucao do metodo cpf.
     * 
     * @param d - int[] - cpf a ser ultilizado.
     * @return - long - tempo de execucao.
     */
    private static long getTempoCpf(int[] d) {
        long tempoI, tempoF;
        Cpf cpf1 = new Cpf();
        tempoI = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            cpf1.cpf(d);
        }
        tempoF = (System.nanoTime() - tempoI);
        return tempoF;
    }

    /**
     * Metodo que pega o tempo de execucao do metodo cpf2.
     * 
     * @param d - int[] - cpf a ser ultilizado.
     * @return - long - tempo de execucao.
     */
    private static long getTempoCpf2(int[] d) {
        long tempoI, tempoF;
        Cpf2 cpf2 = new Cpf2();
        tempoI = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            cpf2.cpf2(d);
        }
        tempoF = (System.nanoTime() - tempoI);
        return tempoF;
    }

    /**
     * Metodo que pega o tempo de execucao do metodo cpf3.
     * 
     * @param d - int[] - cpf a ser ultilizado.
     * @return - long - tempo de execucao.
     */
    private static long getTempoCpf3(int[] d) {
        long tempoI, tempoF;
        Cpf3 cpf3 = new Cpf3();
        tempoI = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            cpf3.cpf3(d);
        }
        tempoF = (System.nanoTime() - tempoI);
        return tempoF;
    }

    /**
     * Metodo que irá verificar qual dos metodos cpf, cpf2 e cpf3 é mais 
     * eficiente em questão de velocidade de execução.
     * 
     * @param d - int[] - cpf a ser ultilizado para verificar o tempo
     * @return - String - qual o  metodo mais eficiente.
     * @throws java.lang.Exception
     */
    public static String menorTempo(int[] d)
            throws Exception{

        if (d.length == 11) {

            if (getTempoCpf(d) <= getTempoCpf2(d)
                    && getTempoCpf(d) <= getTempoCpf3(d)) {
                return "cpf1 é o metodo mais rapido";
            } else if (getTempoCpf2(d) <= getTempoCpf(d)
                    && getTempoCpf2(d) <= getTempoCpf3(d)) {
                return "cpf2 é o metodo mais rapido";
            } else {
                return "cpf3 é o metodo mais rapido";
            }

        } else {
            
            throw new Exception("não há numeros suficiente"
                    + " para ser um cpf valido");
       
        }
    }
}
