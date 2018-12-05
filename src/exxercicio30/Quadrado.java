/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exxercicio30;

/**
 *
 * @author Luis Guilherme
 */
public class Quadrado implements FigurasGeometricas{
    private double lado;

    public Quadrado() {
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    

    @Override
    public double area() {
        double area = lado * lado;
        return area;
    }
}
