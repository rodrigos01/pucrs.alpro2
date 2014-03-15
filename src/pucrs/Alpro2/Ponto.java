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
public class Ponto {
    
    private int x,y;
    private static int count = 0;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
        Ponto.count++;
    }
    
    public Ponto() {
        this(0,0);
    }
    
    public Ponto(Ponto ponto){
        this(ponto.getX(), ponto.getY());
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static int getCount() {
        return count;
    }
    
    public double calcDistance(Ponto ponto) {
        return Ponto.calcDistance(ponto.getX(), this.x, ponto.getY(), this.y);
    }
    
    public double calcDistance(int x, int y) {
        return Ponto.calcDistance(x, this.x, y, this.y);
    }
    
    public static double calcDistance(int x1, int x2, int y1, int y2) {        
        return Math.sqrt((Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2)));
    }
    
    
}
