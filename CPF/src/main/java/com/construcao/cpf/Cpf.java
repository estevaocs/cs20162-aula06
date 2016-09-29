/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.construcao.cpf;

/**
 *
 * @author Estevão Cristino
 */
public class Cpf {
    
    public boolean cpf(int[] d) {
        int sj, sk, j, k;
        
        sj = 0;
        sk = 0;

        for(int i = 0; i < 9 ; i++) {
            sj += (i+1) * d[i]; 
            sk += (i+2) * d[i+1]; 
        }
        
        j = (sk % 10) % 11;
        k = (sk % 10) % 11;
        
        return j == d[9] && k == d[10];
    }
    
    public boolean cpf2(int[] d) {
        int c, p, s, j, k;
        
        s = d[8];
        p = 0;
        
        for(c = 7; c >= 0; c--) {
            p += d[c];
            s += p;
        }
        j = (s % 11) % 10;
        k = ((s - p + 9 * j) % 11) % 10;
        
        return j == d[9] && k == d[10];
        
    }
    
}
