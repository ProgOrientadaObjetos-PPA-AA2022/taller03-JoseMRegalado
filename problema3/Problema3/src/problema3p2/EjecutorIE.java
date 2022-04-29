/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema3p2;
import problema3.InstitucionesEducativas;
/**
 *
 * @author SALA I
 */
public class EjecutorIE {
    public static void main(String[] args) {
        InstitucionesEducativas ie = new InstitucionesEducativas();
        ie.establecerNombre("APC");
        ie.establecerTipoInstitucion("Particular");
        ie.establecerNumeroAlumnos(700);
        ie.establecerNumeroDocentes(50);
        ie.establecerNumeroSedes(2);
        ie.establecerGastosProyectados(100);
        ie.calcularPresupuesto();
        System.out.printf("Instituciones Educativas\n\nNombre: %s\n"
                + "Tipo de Institución: %s\nNúmero de alumnos: %d\n"
                + "Número de docentes: %d\nNúmero de sedes: %d\n"
                + "Gastos proyectados: %.2f\nPresupuesto: %.2f", 
                ie.obtenerNombre(),ie.obtenerTipoInstitucion(),
                ie.obtenerNumeroAlumnos(),ie.obtenerNumeroDocentes(),
                ie.obtenerNumeroSedes(),ie.obtenerGastosProyectados(),ie.obtenerPresupuesto());
        System.out.println("");
        InstitucionesEducativas ie2 = new InstitucionesEducativas();
        ie2.establecerNombre("La Dolorosa");
        ie2.establecerTipoInstitucion("Fiscomisional");
        ie2.establecerNumeroAlumnos(1200);
        ie2.establecerNumeroDocentes(80);
        ie2.establecerNumeroSedes(1);
        ie2.establecerGastosProyectados(40);
        ie2.calcularPresupuesto();
        System.out.printf("Instituciones Educativas\n\nNombre: %s\n"
                + "Tipo de Institución: %s\nNúmero de alumnos: %d\n"
                + "Número de docentes: %d\nNúmero de sedes: %d\n"
                + "Gastos proyectados: %.2f\nPresupuesto: %.2f", 
                ie2.obtenerNombre(),ie2.obtenerTipoInstitucion(),
                ie2.obtenerNumeroAlumnos(),ie2.obtenerNumeroDocentes(),
                ie2.obtenerNumeroSedes(),ie2.obtenerGastosProyectados(),
                ie2.obtenerPresupuesto());
        System.out.println("");
    }
    
}
