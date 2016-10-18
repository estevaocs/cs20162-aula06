package com.construcao.cpf;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Estevao
 */
public class VerificaMenorTempoTest {
    
    VerificaMenorTempo v;
    int[] a = new int[11];
    int[] b = new int[10];
    int[] c = new int[12];
    
    public VerificaMenorTempoTest() {
        v = new VerificaMenorTempo();
    }

    /**
     * Test of menorTempo method, of class VerificaMenorTempo.
     * @throws java.lang.Exception
     */
    @Test
    public void testMenorTempoValido1() throws Exception {
        String n = "42372744623";
        for (int i = 0; i < n.length(); i++) {
            a[i] = Integer.parseInt(n.substring(i, i + 1));
            System.out.print(a[i]);
        }
        
        assertEquals(3, v.menorTempo(a));
    }
    
    
    /**
     * Test of menorTempo method, of class VerificaMenorTempo.
     * @throws java.lang.Exception
     */
    @Test (expected = Exception.class)
    public void testMenorTempoInvalido1() throws Exception {
        String n = "4237274462";
        for (int i = 0; i < n.length(); i++) {
            b[i] = Integer.parseInt(n.substring(i, i + 1));
        }
        VerificaMenorTempo.menorTempo(b);
    }
    
    /**
     * Test of menorTempo method, of class VerificaMenorTempo.
     * @throws java.lang.Exception
     */
    @Test (expected = Exception.class)
    public void testMenorTempoInvalido2() throws Exception {
        String n = "423727446231";
        for (int i = 0; i < n.length(); i++) {
            c[i] = Integer.parseInt(n.substring(i, i + 1));
        }
        VerificaMenorTempo.menorTempo(c);
    }
    
}
