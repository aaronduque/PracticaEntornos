/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaentornos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class PracticaEntornos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int centinela = -1;
        Scanner numeros = new Scanner(System.in);
        Scanner palabras = new Scanner(System.in);
        Cliente cli = new Cliente();
        CuentaBancaria cuen = new CuentaBancaria();
        CuentaBancaria tmp = new CuentaBancaria();
        ArrayList <CuentaBancaria> bbdd = new ArrayList();
        
        while(centinela != 0){
            System.out.println("Opcion1: Crear cliente");
            System.out.println("Opcion2: Crear cuenta");
            System.out.println("Opcion3: Ingresar Saldo");
            System.out.println("Opcion4: Retirar Saldo");
            System.out.println("Opcion5: Pulse 0 para salir de la aplicacion");
            System.out.println("Opcion6: Mandar dinero a otra cuenta");
            System.out.println("Opcion7: Cambiar datos de cuenta");
            centinela = numeros.nextInt();
            
            switch(centinela){
                case 1:
                    System.out.println("Escriba el nombre del cliente");
                    String nombre = palabras.nextLine();
                    System.out.println("Introduzca el apellido");
                    String apellido = palabras.nextLine();
                    System.out.println("Escriba la edad");
                    int edad = numeros.nextInt();
                    System.out.println("Escriba la direccion");
                    String direccion = palabras.nextLine();
                    System.out.println("Escriba el numero de telefono");
                    int telefono = numeros.nextInt();
                    System.out.println("Escriba el codigo del cliente");
                    int codigo = numeros.nextInt();
                    
                    new Cliente(nombre,apellido,edad,direccion,telefono,codigo);
                    break;
                    
                case 2:
                    System.out.println("Introduzcca el nombre de la cuenta");
                    String nombreC = palabras.nextLine();
                    System.out.println("Escriba el nombre del propietario");
                    String nombreP = palabras.nextLine();
                    System.out.println("Esriba el saldo actual de la cuenta");
                    int saldo = numeros.nextInt();
                    System.out.println("Escriba el codigo de la cuenta");
                    int codigoC = numeros.nextInt();
                    new CuentaBancaria(nombreC,cli,saldo,codigoC);
                    bbdd.add(cuen);
                    break;
                    
                case 3:
                    String cuenta = "";
                    if (bbdd.size()>0){
                        System.out.println("En que cuenta quiere ingresar dinero?");
                        cuenta = palabras.nextLine();
                    }
                    for (int i = 0 ; i < bbdd.size(); i++){
                        
                        tmp = bbdd.get(i);
                    }
                    if (tmp.getNombre().equals(cuenta)){
                        System.out.println("Que cantidad quiere ingresar?");
                        int cantidad = numeros.nextInt();
                        cuen.ingresarSaldo(cantidad);
                    }
                    
                    break;
                    
                case 4:
                    System.out.println("Introduzca la cantidad a retirar");
                    int cantidad2 = numeros.nextInt();
                    cuen.retirarSaldo(cantidad2);
                    break;
                case 6:
                    System.out.println("Introduzca el nombre de la cuenta que manda");
                    String nombre11 = palabras.nextLine();
                    System.out.println("Introduzca el nombre de la cuenta que recibe");
                    String nombre12 = palabras.nextLine();
                    System.out.println("Introduce la cantidad a mandar");
                    int cantidad22 = numeros.nextInt();
                    CuentaBancaria cuentamanda = new CuentaBancaria();
                    CuentaBancaria cuentarecibe = new CuentaBancaria();
                    
                    for(int i = 0; i<bbdd.size();i++){
                        if(nombre11.equals(bbdd.get(i).getNombre())){
                          cuentamanda = bbdd.get(i) ; 
                        }
                        if(nombre12.equals(bbdd.get(i).getNombre())){
                          cuentarecibe = bbdd.get(i) ; 
                        }
                    }
                    cuentamanda.retirarSaldo(cantidad22);
                    cuentarecibe.ingresarSaldo(cantidad22);
                    
                    break;
                case 7:
                    System.out.println("Introduzca la Direccion a modificar");
                    cli.setDireccion(palabras.nextLine());
                    cli.setTelefono(palabras.nextInt());
                    
                    
            }
            System.out.println("Opcion1: Crear cliente");
            System.out.println("Opcion2: Crear cuenta");
            System.out.println("Opcion3: Ingresar Saldo");
            System.out.println("Opcion4: Retirar Saldo");
            System.out.println("Pulse 0 para salir de la aplicacion");
            System.out.println("Opcion6: Mandar dinero a otra cuenta");
            System.out.println("Opcion7: Cambiar datos de cuenta");
            centinela = numeros.nextInt();
                
          
        }
    }
    
}
