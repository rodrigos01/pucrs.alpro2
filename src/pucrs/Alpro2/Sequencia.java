/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pucrs.Alpro2;

/**
 *
 * @author rodrigo
 */
public class Sequencia {
    
    private final char[] dados;

    public Sequencia(char c[]) {
        dados = c.clone();
    }
    
    public Sequencia(String s) {
        dados = new char[s.length()];
        for (int i=0; i<s.length(); i++) {
            dados[i] = s.charAt(i);
        }
    }

    @Override
    public String toString() {
        String retorno = "";
        for (char i: dados) {
            retorno += i;
        }
        
        return retorno;
    }
    
    
    
}
