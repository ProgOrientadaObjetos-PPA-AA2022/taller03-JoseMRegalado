/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1p2;

import problema1.ValorTerreno;

/**
 *
 * @author SALA I
 */
public class EjecutorVT {
    public static void main(String[] args) {
        ValorTerreno vt = new ValorTerreno();
        double ancho = 20;
        double largo = 40;
        double metroCuadrado = 30;
        vt.establecerAnchoTerreno(ancho);
        vt.establecerLargoTerreno(largo);
        vt.establecerValorMetroCuadrado(metroCuadrado);
        vt.calcularAreaTerreno();
        vt.calcularCosto();
        System.out.printf("Terreno\n\nAncho del terreno: %.2f\n"
                + "Largo del terreno: %.2f\nValor por metro cuadrado: %.2f\n"
                + "Área del terreno: %.2f\nValor del terreno: %.2f", 
                vt.obtenerAnchoTerreno(),
                vt.obtenerLargoTerreno(), vt.obtenerValorMetroCuadrado(),
                vt.obtenerAreaTerreno(),vt.obtenerCosto());
        System.out.println("");
        ValorTerreno vt2 = new ValorTerreno();
        double ancho2 = 15;
        double largo2 = 25;
        double metroCuadrado2 = 50;
        vt2.establecerAnchoTerreno(ancho2);
        vt2.establecerLargoTerreno(largo2);
        vt2.establecerValorMetroCuadrado(metroCuadrado2);
        vt2.calcularAreaTerreno();
        vt2.calcularCosto();
        System.out.printf("Terreno\n\nAncho del terreno: %.2f\n"
                + "Largo del terreno: %.2f\nValor por metro cuadrado: %.2f\n"
                + "Área del terreno: %.2f\nValor del terreno: %.2f", 
                vt2.obtenerAnchoTerreno(),
                vt2.obtenerLargoTerreno(), vt2.obtenerValorMetroCuadrado(),
                vt2.obtenerAreaTerreno(),vt2.obtenerCosto());
    }
}
