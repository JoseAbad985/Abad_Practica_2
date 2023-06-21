/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.abad_practica_dos.vista;

import ec.edu.ups.abad_practica_dos.modelo.Inventario;
import ec.edu.ups.abad_practica_dos.modelo.Producto;
import java.util.Scanner;

public class VistaProducto {
    private Scanner teclado;
    private Inventario inventario;
    
    public Producto ingresarProducto(){
        teclado = new Scanner (System.in);
        System.out.println("Se ingresera un producto para agregarle al inventario: ");
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el codigo del producto: ");
        int codigo = teclado.nextInt();
        System.out.println("Ingrese el precio del producto: ");
        double precio = teclado.nextDouble();
        System.out.println("Ingrese la cantidad de productos: ");
        int cantidad = teclado.nextInt();
        return new Producto (nombre, codigo, precio, cantidad);
        
    }
    public int buscarProductoVenta(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el codigo del producto a vender: ");
        int codigo = teclado.nextInt();
        return codigo;
    }
    
    public int ingresarCantidadVenta(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de producto a vender: ");
        int cantidad = teclado.nextInt();
        return cantidad;
    }
    
    
    
}

