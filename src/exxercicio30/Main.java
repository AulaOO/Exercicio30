/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exxercicio30;

import java.util.Scanner;

/**
 *
 * @author Luis Guilherme
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o diâmetro do círculo: ");
        double diametro = ler.nextDouble();
        Circulo circulo = new Circulo(diametro);
        System.out.println("Informe a base e a altura do retângulo: ");
        System.out.println("Base: ");
        double base = ler.nextDouble();
        System.out.println("Altura: ");
        double altura = ler.nextDouble();
        Retangulo retangulo = new Retangulo(base, altura);
        System.out.println("Informe o lado do quadrado: ");
        double lado = ler.nextDouble();
        Quadrado quadrado = new Quadrado(lado);
        System.out.println("As áreas das figuras geométricas são:");
        System.out.println("Círculo: " + circulo.area() + "\nRetângulo: " + retangulo.area() + "\nQuadrado: " + quadrado.area());
}
}