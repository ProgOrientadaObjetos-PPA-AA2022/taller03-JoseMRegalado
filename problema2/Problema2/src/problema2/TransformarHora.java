/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

/**
 *
 * @author SALA I
 */
public class TransformarHora {
    private double horas;
    private double minutos;
    private double segundos;
    private double dias;
    public void establecerHoras(double c){
        horas = c;
    }
    public void calcularMinutos() {
        minutos = horas * 60;
    }
    public void calcularSegundos() {
        segundos = horas * 3600;
    }
    public void calcularDias() {
        dias = horas / 24;
    }
    public double obtenerHoras(){
        return horas;
    }
    public double obtenerMinutos(){
        return minutos;
    }
    public double obtenerSegundos(){
        return segundos;
    }
    public double obtenerDias(){
        return dias;
    }
}
