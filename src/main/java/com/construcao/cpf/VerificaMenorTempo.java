package com.construcao.cpf;

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
     * @throws Exception
     */
    private static long getTempoCpf(int[] d) throws Exception{
        long tempoI, tempoF;
        
        tempoI = System.nanoTime();
        
        for (int i = 0; i < 10000000; i++) {
            Cpf.cpf(d);
        }
        tempoF = (System.nanoTime() - tempoI);
        return tempoF;
    }

    /**
     * Metodo que pega o tempo de execucao do metodo cpf2.
     * 
     * @param d - int[] - cpf a ser ultilizado.
     * @return - long - tempo de execucao.
     * @throws Exception
     */
    private static long getTempoCpf2(int[] d) throws Exception{
        long tempoI, tempoF;
        
        tempoI = System.nanoTime();
        
        for (int i = 0; i < 10000000; i++) {
            Cpf.cpf2(d);
        }
        tempoF = (System.nanoTime() - tempoI);
        return tempoF;
    }

    /**
     * Metodo que pega o tempo de execucao do metodo cpf3.
     * 
     * @param d - int[] - cpf a ser ultilizado.
     * @return - long - tempo de execucao.
     * @throws Exception
     */
    private static long getTempoCpf3(int[] d) throws Exception {
        long tempoI, tempoF;
        
        tempoI = System.nanoTime();
        
        for (int i = 0; i < 10000000; i++) {
            Cpf.cpf3(d);
        }
        tempoF = (System.nanoTime() - tempoI);
        return tempoF;
    }

    /**
     * Metodo que irá verificar qual dos metodos cpf, cpf2 e cpf3 é mais 
     * eficiente em questão de velocidade de execução.
     * 
     * @param d - int[] - cpf a ser ultilizado para verificar o tempo
     * @return - int -  1 : cpf
     *                  2 : cpf2
     *                  3 : cpf3
     * @throws Exception
     */
    public static int menorTempo(int[] d) throws Exception{

        if (d.length == 11) {

            if (getTempoCpf(d) <= getTempoCpf2(d)
                    && getTempoCpf(d) <= getTempoCpf3(d)) {
                return 1;
            } else if (getTempoCpf2(d) <= getTempoCpf(d)
                    && getTempoCpf2(d) <= getTempoCpf3(d)) {
                return 2;
            } else {
                return 3;
            }

        } else {
            
            throw new Exception("não há numeros suficiente"
                    + " para ser um cpf valido");
       
        }
    }
}
