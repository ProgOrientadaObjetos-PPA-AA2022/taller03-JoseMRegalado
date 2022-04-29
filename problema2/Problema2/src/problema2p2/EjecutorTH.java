/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2p2;
import problema2.TransformarHora;
/**
 *
 * @author SALA I
 */
public class EjecutorTH {
    public static void main(String[] args) {
        TransformarHora th = new TransformarHora();
        
        th.establecerHoras(24);
        th.calcularMinutos();
        th.calcularSegundos();
        th.calcularDias();
        System.out.printf("Transformar Hora\n\nHoras: %.2f\n"
                + "Minutos: %.2f\nSegundos: %.2f\n"
                + "Días: %.2f\n", 
                th.obtenerHoras(),
                th.obtenerMinutos(), th.obtenerSegundos(),
                th.obtenerDias());
        System.out.println("");
        TransformarHora th2 = new TransformarHora();
        
        th2.establecerHoras(48);
        th2.calcularMinutos();
        th2.calcularSegundos();
        th2.calcularDias();
        System.out.printf("Transformar Hora\n\nHoras: %.2f\n"
                + "Minutos: %.2f\nSegundos: %.2f\n"
                + "Días: %.2f\n", 
                th2.obtenerHoras(),
                th2.obtenerMinutos(), th2.obtenerSegundos(),
                th2.obtenerDias());
        System.out.println("");
    }
}
