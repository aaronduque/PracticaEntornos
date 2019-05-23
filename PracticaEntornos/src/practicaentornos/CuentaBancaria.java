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
    private String nombre;
    private Cliente propietario;
    private int saldoActual;
    private int codigoCuenta;
    
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
    public String retirarSaldo(int cantidad){
        int cantidadActual = getSaldoActual();
        
        if(cantidadActual < cantidad){
            return "Usted no tiene tanto dinero en la cuenta";
        }
        else{
            setSaldoActual(cantidadActual - cantidad);
        }
        return "Se ha podido retirar la jugada";
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente getPropietario() {
        return propietario;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    public int getCodigoCuenta() {
        return codigoCuenta;
    }

    public void setCodigoCuenta(int codigoCuenta) {
        this.codigoCuenta = codigoCuenta;
    }

}