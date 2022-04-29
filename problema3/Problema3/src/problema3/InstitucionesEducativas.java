/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

/**
 *
 * @author SALA I
 */
public class InstitucionesEducativas {
    private String nombre;
    private String tipoI;
    private int numeroA;
    private int numeroD;
    private int numeroS;
    private double gastosProyectados;
    private double presupuesto;
    public void establecerNombre(String c){
    nombre = c;
    }
    public void establecerTipoInstitucion(String c){
    tipoI = c;
    }
    public void establecerNumeroAlumnos(int c){
    numeroA = c;
    }
    public void establecerNumeroDocentes(int c){
    numeroD = c;
    }
    public void establecerNumeroSedes(int c){
    numeroS = c;
    }
    public void establecerGastosProyectados(double c){
    gastosProyectados = c;
    }
    public void calcularPresupuesto(){
    presupuesto = numeroA * gastosProyectados;
    }

    public String obtenerNombre(){
    return nombre;
    }
    public String obtenerTipoInstitucion(){
    return tipoI;
    }
    public int obtenerNumeroAlumnos(){
    return numeroA;
    }
    public int obtenerNumeroDocentes(){
    return numeroD;
    }
    public int obtenerNumeroSedes(){
    return numeroS;
    }
    public double obtenerGastosProyectados(){
    return gastosProyectados;
    }
    public double obtenerPresupuesto(){
    return presupuesto;
    }

    
    
}
