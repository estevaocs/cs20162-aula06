/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.construcao.tempo;

import com.construcao.cpf.Cpf;
import com.construcao.cpf2.Cpf2;
import com.construcao.cpf3.Cpf3;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 *
 * @author Estevao
 */
public class VerificaMenorTempoTest {
    
    public VerificaMenorTempoTest() {
    }

    /**
     * Teste do metodo do cpf2 com cpf Valido
     */
    @Test
    public void cpf2Valido() {
        int[] d = new int[11];
        String num = "56897953482";
        for (int i = 0; i < 11; i++) {
            d[i] = Integer.parseInt(num.substring(i, i + 1));
        }
        assertEquals(true, Cpf2.cpf2(d));
    }
    
    /**
     * Teste do metodo do cpf2 com cpf Invalido
     */
    @Test
    public void cpf2Invalido() {
        int[] d = new int[11];
        String num = "56897953400";
        for (int i = 0; i < 11; i++) {
            d[i] = Integer.parseInt(num.substring(i, i + 1));
        }
        assertEquals(false, Cpf2.cpf2(d));
    }
    
    /**
     *  Testando o metodo cpf2 com cpf invalido com apenas 10 numeros.
     * @throws Exception
     * @throws ArrayIndexOutOfBoundsException
     */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void cpf2Com10num() throws Exception, ArrayIndexOutOfBoundsException {
        int[] d = new int[10];
        String num = "5689795342";
        for (int i = 0; i < 10; i++) {
            d[i] = Integer.parseInt(num.substring(i, i + 1));
        }
        assertEquals(null, Cpf2.cpf2(d));
    }
    
    /**
     * Teste do metodo do cpf3 com cpf Valido
     */
    @Test
    public void cpf3Valido() {
        int[] d = new int[11];
        String num = "56897953482";
        for (int i = 0; i < 11; i++) {
            d[i] = Integer.parseInt(num.substring(i, i + 1));
        }
        assertEquals(true, Cpf3.cpf3(d));
    }
    
    /**
     * Teste do metodo do cpf3 com cpf Invalido
     */
    @Test
    public void cpf3Invalido() {
        int[] d = new int[11];
        String num = "56897953400";
        for (int i = 0; i < 11; i++) {
            d[i] = Integer.parseInt(num.substring(i, i + 1));
        }
        assertEquals(false, Cpf3.cpf3(d));
    }
   
    /**
     *  Testando o metodo cpf3 com cpf invalido com apenas 10 numeros.
     * @throws Exception
     * @throws ArrayIndexOutOfBoundsException
     */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void cpf3Com10num() throws Exception, ArrayIndexOutOfBoundsException {
        int[] d = new int[10];
        String num = "5689795342";
        for (int i = 0; i < 10; i++) {
            d[i] = Integer.parseInt(num.substring(i, i + 1));
        }
        assertEquals(null, Cpf3.cpf3(d));
    }
    
    /**
     * Teste do metodo do cpf1 com cpf Valido
     */
    @Test
    public void cpf1Valido() {
        int[] d = new int[11];
        String num = "56897953482";
        for (int i = 0; i < 11; i++) {
            d[i] = Integer.parseInt(num.substring(i, i + 1));
        }
        assertEquals(true, Cpf.cpf(d));
    }
    
    /**
     * Teste do metodo do cpf1 com cpf Invalido
     */
    @Test
    public void cpf1Invalido() {
        int[] d = new int[11];
        String num = "56897953400";
        for (int i = 0; i < 11; i++) {
            d[i] = Integer.parseInt(num.substring(i, i + 1));
        }
        assertEquals(false, Cpf.cpf(d));
    }
    
    /**
     *  Testando o metodo cpf1 com cpf invalido com apenas 10 numeros.
     * @throws Exception
     * @throws ArrayIndexOutOfBoundsException
     */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void cpf1Com10num() throws Exception, ArrayIndexOutOfBoundsException {
        int[] d = new int[10];
        String num = "5689795342";
        for (int i = 0; i < 10; i++) {
            d[i] = Integer.parseInt(num.substring(i, i + 1));
        }
        assertEquals(null, Cpf.cpf(d));
    }
    
    /**
     * Testando o metodo verificaMenorTempo com um cpf valido
     * @throws Exception 
     */
    @Test
    public void cpfValido() throws Exception {
        int[] d = new int[11];
        String num = "56897953482";
        for (int i = 0; i < 11; i++) {
            d[i] = Integer.parseInt(num.substring(i, i + 1));
        }
        assertEquals("cpf2 é o metodo mais rapido", 
                VerificaMenorTempo.menorTempo(d));
    }
    
    /**
     * testando o metodo VerificaMenorTempo, com um cpf invalido com 10 numeros
     * @throws Exception - Nao há numeros o suficiente para ser um cpf valido
     */
    @Test (expected = Exception.class) 
    public void cpfInvalido() throws Exception {
        int[] d = new int[10];
        String num = "5689795348";
        for (int i = 0; i < 10; i++) {
            d[i] = Integer.parseInt(num.substring(i, i + 1));
        }
        assertEquals("cpf3 é o metodo mais rapido", 
                VerificaMenorTempo.menorTempo(d));
    }
    
   
}
