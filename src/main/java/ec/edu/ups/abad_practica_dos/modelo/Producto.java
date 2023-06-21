/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.abad_practica_dos.modelo;

import java.util.Objects;

public class Producto <T>{
    private T nombre;
    private T codigo;
    private T precio;
    private T cantidad;
    private Producto<T> siguiente;

    public Producto(T nombre, T codigo, T precio, T cantidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public T getNombre() {
        return nombre;
    }

    public void setNombre(T nombre) {
        this.nombre = nombre;
    }

    public T getCodigo() {
        return codigo;
    }

    public void setCodigo(T codigo) {
        this.codigo = codigo;
    }

    public T getPrecio() {
        return precio;
    }

    public void setPrecio(T precio) {
        this.precio = precio;
    }

    public T getCantidad() {
        return cantidad;
    }

    public void setCantidad(T cantidad) {
        this.cantidad = cantidad;
    }

    public Producto<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Producto<T> siguiente) {
        this.siguiente = siguiente;
    }
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.nombre);
        hash = 71 * hash + Objects.hashCode(this.codigo);
        hash = 71 * hash + Objects.hashCode(this.precio);
        hash = 71 * hash + Objects.hashCode(this.cantidad);
        hash = 71 * hash + Objects.hashCode(this.siguiente);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto<?> other = (Producto<?>) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.precio, other.precio)) {
            return false;
        }
        if (!Objects.equals(this.cantidad, other.cantidad)) {
            return false;
        }
        return Objects.equals(this.siguiente, other.siguiente);
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + ", cantidad=" + cantidad + ", siguiente=" + siguiente + '}';
    }
    
    
    
    
}
