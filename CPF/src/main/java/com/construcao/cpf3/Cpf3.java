/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.construcao.cpf3;

/**
 *
 * @author Estevão Cristino
 */
public class Cpf3 {
    
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
     * Verifica atravez do Método de Horner. Só que ao invez de realizar 8 
     * repetiçoes dentro de um laço, ele irá fazer todas as contas 
     * sequancialmente.
     *
     * @param d - int[] - cpf a ser verificado
     * @return - boolean - true caso seja valido
     * @throws ArrayIndexOutOfBoundsException
     */
    public static boolean cpf3(int[] d) throws ArrayIndexOutOfBoundsException {
        int p, s, j, k;

        if (d.length == 11) {
            p = d[8];
            s = p;
            p += d[7];
            s += p;
            p += d[6];
            s += p;
            p += d[5];
            s += p;
            p += d[4];
            s += p;
            p += d[3];
            s += p;
            p += d[2];
            s += p;
            p += d[1];
            s += p;
            p += d[0];
            s += p;

            j = (s % 11) % 10;
            k = ((s - p + 9 * j) % 11) % 10;

            return j == d[9] && k == d[10];

        } else {

            throw new ArrayIndexOutOfBoundsException("não há numeros suficiente"
                    + " para ser um cpf valido");

        }
    }

}
