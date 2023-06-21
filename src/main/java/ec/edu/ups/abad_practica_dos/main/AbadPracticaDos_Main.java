/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.abad_practica_dos.main;

import ec.edu.ups.abad_practica_dos.controlador.ControladorProducto;
import ec.edu.ups.abad_practica_dos.modelo.Inventario;
import ec.edu.ups.abad_practica_dos.vista.VistaProducto;
import java.util.Scanner;

public class AbadPracticaDos_Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int opcion = 0;
        VistaProducto vistaProducto = new VistaProducto ();
        Inventario inventario = new Inventario();
        ControladorProducto controladorProducto = new ControladorProducto(vistaProducto, inventario);
    
        do {
            System.out.println("""                              
                                Menu de Opciones 
                               1. Ingresar un Producto
                               2. Vender un Producto
                               3. Ver el inventario disponible de productos
                               4. Ver el historial de transacciones de venta de productis
                               5. Salir""");
            opcion = teclado.nextInt();
            //Vista//

            switch (opcion) {
                case 1:
                    controladorProducto.registrarProducto();
                    break;

                case 2:
                    controladorProducto.venderProducto();
                    break;

                case 3:
                    controladorProducto.verInventario();
                    break;
                case 4:
                    controladorProducto.verHistorialTransacciones();
                    break;
                case 5:
                    System.out.println("Gracias:)");
                    break;

}
}while (opcion!=5);
    }
    }

