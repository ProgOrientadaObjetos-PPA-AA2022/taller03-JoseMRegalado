/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

/**
 *
 * @author SALA I
 */
public class EquiposCelulares {
    private String sistemaO;
    private String direccionMac;
    private double tamanioPantalla;
    private int informacionImei;
    private double costoInicial;
    private double iva;
    private double ivaCostoInicial;
    private double costoTotal;

    public void establecerSistemaOperativo(String c){
        sistemaO = c;
    }
    public void establecerDireccionMac(String c){
        direccionMac = c;
    }
    public void establecerTamanioPantalla(double c){
        tamanioPantalla = c;
    }
    public void establecerImei(int c){
        informacionImei = c;
    }
    public void establecerCostoInicial(double c){
        costoInicial = c;
    }
    public void establecerIva(double c){
        iva = c;
    }
    public void calcularIvaCostoInicial(){
        ivaCostoInicial = (iva / 100)  * costoInicial;
    }
    public void calcularCostoTotal(){
        costoTotal = ivaCostoInicial + costoInicial;
    }
    
    public String obtenerSistemaOperativo(){
        return sistemaO;
    }
    public String obtenerDireccionMac(){
        return direccionMac;
    }
    public double obtenerTamanioPantalla(){
        return tamanioPantalla;
    }
    public int obtenerImei(){
        return informacionImei;
    }
    public double obtenerCostoInicial(){
        return costoInicial;
    }
    public double obtenerIva(){
        return iva;
    }
    public double obtenerIvaCostoInicial(){
        return ivaCostoInicial;
    }
    public double obtenerCostoTotal(){
        return costoTotal;
    }
}
