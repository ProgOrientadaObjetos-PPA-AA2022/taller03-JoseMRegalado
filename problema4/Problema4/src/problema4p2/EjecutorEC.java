/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema4p2;
import problema4.EquiposCelulares;

public class EjecutorEC {
    public static void main(String[] args) {
        EquiposCelulares ec = new EquiposCelulares();
        ec.establecerSistemaOperativo("Android");
        ec.establecerDireccionMac("4832hj2i9");
        ec.establecerTamanioPantalla(5);
        ec.establecerImei(56891547);
        ec.establecerCostoInicial(450);
        ec.establecerIva(12);
        ec.calcularIvaCostoInicial();
        ec.calcularCostoTotal();
        System.out.printf("Equipos Celulares\n\nSistema operativo: %s\n"
                + "Dirección MAC: %s\nTamaño de pantalla: %.2f\n"
                + "Información IMEI: %d\nIVA: %.2f\n"
                + "Subtotal: %.2f\nIva del costo inicial: %.2f\n" 
                + "Costo Total: %.2f", 
                ec.obtenerSistemaOperativo(),ec.obtenerDireccionMac(),
                ec.obtenerTamanioPantalla(),ec.obtenerImei(),
                ec.obtenerIva(),ec.obtenerCostoInicial(),
                ec.obtenerIvaCostoInicial(),ec.obtenerCostoTotal());
        System.out.println("");
        System.out.println("");
        EquiposCelulares ec2 = new EquiposCelulares();
        ec2.establecerSistemaOperativo("IOS");
        ec2.establecerDireccionMac("83629.j92");
        ec2.establecerTamanioPantalla(7);
        ec2.establecerImei(3186118);
        ec2.establecerCostoInicial(220);
        ec2.establecerIva(14);
        ec2.calcularIvaCostoInicial();
        ec2.calcularCostoTotal();
        System.out.printf("Equipos Celulares\n\nSistema operativo: %s\n"
                + "Dirección MAC: %s\nTamaño de pantalla: %.2f\n"
                + "Información IMEI: %d\nIVA: %.2f\n"
                + "Subtotal: %.2f\nIva del costo inicial: %.2f\n" 
                + "Costo Total: %.2f", 
                ec2.obtenerSistemaOperativo(),ec2.obtenerDireccionMac(),
                ec2.obtenerTamanioPantalla(),ec2.obtenerImei(),
                ec2.obtenerIva(),ec2.obtenerCostoInicial(),
                ec2.obtenerIvaCostoInicial(),ec2.obtenerCostoTotal());
        System.out.println("");
    }
}
