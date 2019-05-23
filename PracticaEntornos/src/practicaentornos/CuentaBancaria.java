/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaentornos;

/**
 *
 * @author Pedro
 */
public class CuentaBancaria {
    String nombre;
    Cliente propietario;
    int saldoActual;
    int codigoCuenta;
    
    public CuentaBancaria(){
        
    }

    public CuentaBancaria(String nombre, Cliente propietario, int saldoActual, int codigoCuenta) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.saldoActual = saldoActual;
        this.codigoCuenta = codigoCuenta;
    }

    
    public void ingresarSaldo(int cantidad){
        int cantidadActual = getSaldoActual();
        
        setSaldoActual(cantidadActual + cantidad);
    }
    public void retirarSaldo(int cantidad){
        int cantidadActual = getSaldoActual();
        
        setSaldoActual(cantidadActual - cantidad);
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    
}