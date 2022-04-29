/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

/**
 *
 * @author SALA I
 */
public class ValorTerreno {

    private double ancho;
    private double largo;
    private double valorMetroCuadrado;
    private double area;
    private double costo_terreno;
    public void establecerAnchoTerreno(double c){
        ancho = c;
    }
    
    public void establecerLargoTerreno(double c){
        largo = c;
    }
    public void establecerValorMetroCuadrado(double c){
        valorMetroCuadrado = c;
    }
    public void calcularAreaTerreno(){
        area = ancho * largo;
    }
    public void calcularCosto(){
        costo_terreno = area * valorMetroCuadrado;
    }
    public double obtenerAnchoTerreno(){
        return ancho;
    }
    
    public double obtenerLargoTerreno(){
        return largo;
    }
    public double obtenerValorMetroCuadrado(){
        return valorMetroCuadrado;
    }
    public double obtenerAreaTerreno(){
        return area;
    }
    public double obtenerCosto(){
        return costo_terreno;
    }
}
