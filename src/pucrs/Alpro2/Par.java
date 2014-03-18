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
public class Par<E,F> {
    
    private E obj1, obj2;

    public Par(E obj1, E obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public E getObj1() {
        return obj1;
    }

    public void setObj1(E obj1) {
        this.obj1 = obj1;
    }

    public E getObj2() {
        return obj2;
    }

    public void setObj2(E obj2) {
        this.obj2 = obj2;
    }
    
    
    
}
