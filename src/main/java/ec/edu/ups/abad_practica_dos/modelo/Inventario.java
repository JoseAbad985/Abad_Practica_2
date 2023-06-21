/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.abad_practica_dos.modelo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Inventario <T>{
    private List<Producto> listaProductos;
    private Producto<T> cabeza;
    private int tamaño;
    private Stack <String> historialTransacciones;
    
    public Inventario() {
        listaProductos = new LinkedList();
        historialTransacciones = new Stack<>();
    }
    public void agregar(Producto producto) {
        listaProductos.add(producto);
        Producto<T> nuevo = producto;
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Producto<T> ultimoNodo = obtenerUltimo();
            ultimoNodo.setSiguiente(nuevo);
        }
        tamaño++;
    }
    //Obtener Ultimo
    public Producto<T> obtenerUltimo() {
        Producto<T> actual = cabeza;
        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();

        }
        return actual;
    }
    //Obtener por codigo
    public Producto buscarPorCodigo(Object codigo) {
        for (Producto producto : listaProductos) {
            if (producto.getCodigo().equals(codigo)) {
                    return producto;
            } else {
                System.out.println("No existe el producto");
            }
        }
        return null;
    }
    
    
    public void venderProducto(Producto producto){
        Iterator<Producto> it = listaProductos.iterator();
        while (it.hasNext()) {
            Producto c = it.next();
            if (c.getCodigo().equals(producto.getCodigo())){
                it.remove();
        String transaccion = "Venta: " + producto+ "";
        historialTransacciones.push(transaccion);                
        }
        tamaño--;
    }
    }
    

    

    
    public void imprimirInventarioProductos() {
        for (Producto producto : listaProductos) {
            System.out.println("Producto: " + producto.getNombre() +
                    ", Código: " + producto.getCodigo() +
                    ", Precio: $" + producto.getPrecio() +
                    ", Cantidad: " + producto.getCantidad());
        }
    }
    public void imprimirHistorialTransacciones() {
        System.out.println("Historial de Transacciones:");
        while (!historialTransacciones.isEmpty()) {
            System.out.println(historialTransacciones.pop());
        }
    }
   

    
}
