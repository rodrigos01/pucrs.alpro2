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
     * @param args the command line argume nts
     */
    public static void main(String[] args) {
        
        Sequencia seq = new Sequencia("Teste de string");
        System.out.println(seq.toString());
        
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto(p1);
        Ponto p3 = new Ponto(3, 7);
        System.out.println(Ponto.getCount());
        
        Par par1 = new Par("Rodrigo", 10.9);
        Par par2 = new Par(133, "João das Batatinhas");
        Par par3 = new Par(30.2, 1.145);
        System.out.println(par1.toString()+";"+par2.toString()+";"+par3.toString());
        
        Codigo cod = new Codigo("IMP", 34);
        ProdutoG prod = new ProdutoG(cod, "um produto aí", 20.00);
        System.out.println(prod.toString());
        
        Dicionario dic = new Dicionario();
        dic.add(1, "oi");
        dic.add("dois", 30.7);
        dic.add(90.4, true);
        System.out.println(dic.toString());
        
    }
    
}
