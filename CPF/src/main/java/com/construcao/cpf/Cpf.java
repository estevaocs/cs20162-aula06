/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.construcao.cpf;

/**
 * Classe Cpf que irá verificar
 *
 * @author Estevão Cristino
 */
public class Cpf {

    /**
     * Método que verifica se um cpf com 11 digitos é um cpf valido ou não,
     * atravez de um metodo simples de verificacao.
     * Se a regra de formação dos dígitos verificados é atendida, então retorna 
     * verdadeiro, caso contrário, retorna falso. O formato de um CPF é definida
     * por abc.def.ghi-jk, onde os dois pontos e o hífen são usados por 
     * legibilidade. Os oito primeiros dígitos formam o número-base, enquanto o 
     * nono dígito, i, representa a região fiscal (local de emissão do CPF). O 
     * valor 1 para esse dígito é paraemissões no DF, GO, MS, MT e TO. O valor 2
     * para AC, AM, AP, PA, RO e RR. O valor 3 para CE, MA e PI. O dígito 4 para
     * AL, PB, PE e RN. O dígito 6 para MG, 7 para ES e RJ, 8 para SP, 9 para 
     * PR e SC e, por último, o dígito 0 para RS.
     * 
     * O metodo abaixo assume que o argumento (vetor) define os dígitos de um
     * CPF, desde d[1] até d[11]. Ou seja, os dígitos verificadores são d[10] e 
     * d[11], conforme essa convenção.
     *
     * @param d - int[] - cpf a ser verificado
     * @return - boolean - true caso seja valido
     * @throws ArrayIndexOutOfBoundsException
     */
    public static boolean cpf(int[] d) throws ArrayIndexOutOfBoundsException {
        int sj, sk, j, k;
        if (d.length == 11) {
            sj = d[0] + 2 * d[1] + 3 * d[2] + 4 * d[3] + 5 * d[4] + 6 * d[5]
                    + 7 * d[6] + 8 * d[7] + 9 * d[8];
            sk = d[1] + 2 * d[2] + 3 * d[3] + 4 * d[4] + 5 * d[5] + 6 * d[6]
                    + 7 * d[7] + 8 * d[8] + 9 * d[9];

            j = (sj % 11) % 10;
            k = (sk % 11) % 10;
            
            return j == d[9] && k == d[10];
        } else {
            throw new ArrayIndexOutOfBoundsException("não há numeros suficiente"
                    + " para ser um cpf valido");
        }
    }

}
