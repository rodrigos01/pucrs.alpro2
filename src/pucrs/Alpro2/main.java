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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto(p1);
        Ponto p3 = new Ponto(3, 7);
        
        System.out.println(Ponto.getCount());
        
    }
    
}
