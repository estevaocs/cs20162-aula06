/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.construcao.cpf3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Estevao
 */
public class Cpf3Test {
    
    @Test
    public void cpfValido() {
        int[] d = new int[11];
        String num = "56897953482";
        for (int i = 0; i < 11; i++) {
            d[i] = Integer.parseInt(num.substring(i, i + 1));
        }
        assertEquals(true, Cpf3.cpf3(d));
    }
    
    @Test
    public void cpfInvalido() {
        int[] d = new int[11];
        String num = "56897953400";
        for (int i = 0; i < 11; i++) {
            d[i] = Integer.parseInt(num.substring(i, i + 1));
        }
        assertEquals(false, Cpf3.cpf3(d));
    }
    
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void cpfCom10num() throws Exception, ArrayIndexOutOfBoundsException {
        int[] d = new int[10];
        String num = "5689795342";
        for (int i = 0; i < 10; i++) {
            d[i] = Integer.parseInt(num.substring(i, i + 1));
        }
        assertEquals(null, Cpf3.cpf3(d));
    }
    
    
}
