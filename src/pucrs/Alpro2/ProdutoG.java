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
public class ProdutoG<T> {
   private final T codigo;
   private final String descricao;
   private final double preco;
    
   public ProdutoG(T cod,String descr, double pr) {
       codigo = cod;
       descricao = descr;
       preco = pr;
   }

   public T getCodigo() { return codigo; }
   public String getDescricao() { return descricao; }
   public double getPreco() { return preco; }

   @Override
   public String toString() {
       return "ProdutoG{" + "codigo=" + codigo + ", descricao=" +
       descricao + ", preco=" + preco + "}";
    }
}

