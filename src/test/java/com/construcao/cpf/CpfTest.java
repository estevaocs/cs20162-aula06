/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.construcao.cpf;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Estevao
 */
public class CpfTest {

    Cpf cpf;
    int[] a = new int[11];
    int[] b = new int[10];
    int[] c = new int[12];

    public CpfTest() {
        cpf = new Cpf();
    }

    /**
     * Teste Valido Com Cpf valido
     */
    @Test
    public void testCpfValido1() {
        String n = "42372744623";
        for (int i = 0; i < n.length(); i++) {
            a[i] = Integer.parseInt(n.substring(i, i + 1));
        }
        assertEquals(true, cpf.cpf(a));
    }

    /**
     * Teste Valido Com Cpf invalido
     */
    @Test
    public void testCpfValido2() {
        String n = "42372744699";
        for (int i = 0; i < n.length(); i++) {
            a[i] = Integer.parseInt(n.substring(i, i + 1));
        }
        assertEquals(false, cpf.cpf(a));
    }

    /**
     * Teste Invalido com Cpf com menos digitos
     */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testCpfInvalida1() {
        String n = "4237274469";
        for (int i = 0; i < n.length(); i++) {
            b[i] = Integer.parseInt(n.substring(i, i + 1));
        }
        assertEquals(false, cpf.cpf(b));
    }

    /**
     * Teste Invalido com Cpf com mais digitos
     */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testCpfInvalida2() {
        String n = "423727446993";
        for (int i = 0; i < n.length(); i++) {
            c[i] = Integer.parseInt(n.substring(i, i + 1));
        }
        assertEquals(false, cpf.cpf(c));
    }
    
    /**
     * Test of cpf2 method, of class Cpf.
     */
    @Test
    public void testCpf2Valido1() {
        String n = "42372744623";
        for (int i = 0; i < n.length(); i++) {
            a[i] = Integer.parseInt(n.substring(i, i + 1));
        }
        assertEquals(true, cpf.cpf2(a));
    }

    /**
     * Teste Valido Com Cpf invalido
     */
    @Test
    public void testCpf2Valido2() {
        String n = "42372744699";
        for (int i = 0; i < n.length(); i++) {
            a[i] = Integer.parseInt(n.substring(i, i + 1));
        }
        assertEquals(false, cpf.cpf2(a));
    }

    /**
     * Teste Invalido com Cpf com menos digitos
     */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testCpf2Invalida1() {
        String n = "4237274469";
        for (int i = 0; i < n.length(); i++) {
            b[i] = Integer.parseInt(n.substring(i, i + 1));
        }
        assertEquals(false, cpf.cpf2(b));
    }
    
    /**
     * Teste Invalido com Cpf com menos digitos
     */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testCpf2Invalida2() {
        String n = "423727446991";
        for (int i = 0; i < n.length(); i++) {
            c[i] = Integer.parseInt(n.substring(i, i + 1));
        }
        assertEquals(false, cpf.cpf2(c));
    }

    /**
     * Test of cpf3 method, of class Cpf.
     */
    @Test
    public void testCpf3() {
        String n = "42372744623";
        for (int i = 0; i < n.length(); i++) {
            a[i] = Integer.parseInt(n.substring(i, i + 1));
        }
        assertEquals(true, cpf.cpf3(a));
    }

    /**
     * Teste Valido Com Cpf invalido
     */
    @Test
    public void testCpf3Valido() {
        String n = "42372744699";
        for (int i = 0; i < n.length(); i++) {
            a[i] = Integer.parseInt(n.substring(i, i + 1));
        }
        assertEquals(false, cpf.cpf3(a));
    }

    /**
     * Teste Invalido com Cpf com menos digitos
     */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testCpf3Invalida1() {
        String n = "4237274469";
        for (int i = 0; i < n.length(); i++) {
            b[i] = Integer.parseInt(n.substring(i, i + 1));
        }
        assertEquals(false, cpf.cpf3(b));
    }
    
     /**
     * Teste Invalido com Cpf com menos digitos
     */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testCpf3Invalida2() {
        String n = "423727446991";
        for (int i = 0; i < n.length(); i++) {
            c[i] = Integer.parseInt(n.substring(i, i + 1));
        }
        assertEquals(false, cpf.cpf3(c));
    }
}
