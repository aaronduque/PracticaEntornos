/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaentornos;

import java.util.Scanner;

/**
 *
 * @author Aaron
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
        
        while(centinela != 0){
            System.out.println("Opcion1: Crear cliente");
            System.out.println("Opcion2: Crear cuenta");
            System.out.println("Opcion3: Ingresar Saldo");
            System.out.println("Opcion4: Retirar Saldo");
            System.out.println("Opcion5: Pulse 0 para salir de la aplicacion");
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
                    break;
                    
                case 3:
                    System.out.println("Introduzca la cantidad a ingresar");
                    int cantidad = numeros.nextInt();
                    cuen.ingresarSaldo(cantidad);
                    
                    break;
                    
                case 4:
                    System.out.println("Introduzca la cantidad a retirar");
                    int cantidad2 = numeros.nextInt();
                    cuen.retirarSaldo(cantidad2);
                    break;
                    
            }
            System.out.println("Opcion1: Crear cliente");
            System.out.println("Opcion2: Crear cuenta");
            System.out.println("Opcion3: Ingresar Saldo");
            System.out.println("Opcion4: Retirar Saldo");
            System.out.println("Opcion5: Pulse 0 para salir de la aplicacion");
            centinela = numeros.nextInt();
                
          
        }
    }
    
}
