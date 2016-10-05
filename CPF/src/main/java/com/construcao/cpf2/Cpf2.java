/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.construcao.cpf2;

import com.construcao.cpf2.*;

/**
 *
 * @author Estevão Cristino
 */
public class Cpf2 {

    /**
     * Método que verifica se um cpf com 11 digitos é um cpf valido ou não,
     * atravez de um metodo simples de verificacao. Se a regra de formação dos
     * dígitos verificados é atendida, então retorna verdadeiro, caso contrário,
     * retorna falso. O formato de um CPF é definida por abc.def.ghi-jk, onde os
     * dois pontos e o hífen são usados por legibilidade. Os oito primeiros
     * dígitos formam o número-base, enquanto o nono dígito, i, representa a
     * região fiscal (local de emissão do CPF). O valor 1 para esse dígito é
     * paraemissões no DF, GO, MS, MT e TO. O valor 2 para AC, AM, AP, PA, RO e
     * RR. O valor 3 para CE, MA e PI. O dígito 4 para AL, PB, PE e RN. O dígito
     * 6 para MG, 7 para ES e RJ, 8 para SP, 9 para PR e SC e, por último, o
     * dígito 0 para RS.
     *
     * Verifica atravez do Método de Horner. Que se caracteriza em um laço de
     * repeticao 8 vezes somando os digitos em p e somando a soma dos "p" em s
     * para encontrar sk e sj atravez de uma conta simples e verificando se o
     * cpf é um cpf valido.
     *
     * @param d - int[] - cpf a ser verificado
     * @return - boolean - true caso seja valido
     * @throws ArrayIndexOutOfBoundsException
     */
    public static boolean cpf2(int[] d) throws ArrayIndexOutOfBoundsException {
        int c, p, s, j, k;

        if (d.length == 11) {

            c = 7;
            p = d[8];
            s = d[8];

            while (0 <= c) {
                p += d[c];
                s += p;
                c--;
            }

            j = (s % 11) % 10;
            k = ((s - p + 9 * j) % 11) % 10;

            return j == d[9] && k == d[10];
            
        } else {
            
            throw new ArrayIndexOutOfBoundsException("não há numeros suficiente"
                    + " para ser um cpf valido");
        
        }
    }

}
