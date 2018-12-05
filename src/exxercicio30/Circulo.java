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
public class Circulo implements FigurasGeometricas{
    private double diametro;

    public Circulo() {
    }

    public Circulo(double diametro) {
        this.diametro = diametro;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    
    

    @Override
    public double area() {
        double area = (((3.1415)*(diametro*diametro))/4);
        return area;
    }
    
    
}
