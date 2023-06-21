/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.abad_practica_dos.controlador;

import ec.edu.ups.abad_practica_dos.modelo.Inventario;
import ec.edu.ups.abad_practica_dos.modelo.Producto;
import ec.edu.ups.abad_practica_dos.vista.VistaProducto;

public class ControladorProducto {
    private VistaProducto vistaProducto;
    private Producto producto;
    private Inventario inventario;

    public ControladorProducto(VistaProducto vistaProducto, Producto producto, Inventario inventario) {
        this.vistaProducto = vistaProducto;
        this.producto = producto;
        this.inventario = inventario;
    }

    public ControladorProducto(VistaProducto vistaProducto, Inventario inventario) {
        this.vistaProducto = vistaProducto;
        this.inventario = inventario;
    }
    
    
    public void registrarProducto (){
        producto=vistaProducto.ingresarProducto();
        inventario.agregar(producto);
    }
    
    public void venderProducto() {
        int codigo = vistaProducto.buscarProductoVenta();
        producto = inventario.buscarPorCodigo(codigo);
        inventario.venderProducto(producto);
        System.out.println("Se ha vendido un producto con éxito :)");
    } 
    public void verInventario() {
        inventario.imprimirInventarioProductos();
    }
    public void verHistorialTransacciones() {
        inventario.imprimirHistorialTransacciones();
    }
    }
    
            
    

