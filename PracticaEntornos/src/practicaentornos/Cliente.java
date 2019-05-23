/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaentornos;

/**
 *
 * @author Aaron
 */
public class Cliente {
    String nombre;
    String apellidos;
    int edad;
    String direccion;
    int telefono;
    int codigoCliente;
    
    public Cliente(){
        
    }
    public Cliente(String nombre, String apellidos, int edad, String direccion, int telefono, int codigoCliente) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.codigoCliente = codigoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", direccion=" + direccion + ", telefono=" + telefono + ", codigoCliente=" + codigoCliente + '}';
    }
    
    
    
}
