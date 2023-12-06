
package com.mycompany.p1lab2laraanderson1;
import java.util.Scanner;

public class Cliente extends Cine{
    String Direccion;
    String Correo;
    Scanner scan =new Scanner(System.in);
    public Cliente(String Direccion, String Correo, String Nombre, String Codigo) {
        super(Nombre, Codigo);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        this.Direccion = Direccion;
        this.Correo = Correo;
    }
    public String SeleccionarPelicula(){
        System.out.println("Ingrese el nombre de la pelicula: ");
        String NombrePelicula=scan.nextLine();
        return NombrePelicula;
    }
    public int SeleccionarHora(){
        System.out.println("Seleccione a que hora desea entrar");
        System.out.println("1........13:00-15:00");
        System.out.println("****Sala: A");
        System.out.println("2........15:00-17:00");
        System.out.println("****Sala: B");
        System.out.println("3........17:00-19:00");
        System.out.println("****Sala: C");
        System.out.println("4........19:00-21:00");
        System.out.println("****Sala: D");
        int OpHora=scan.nextInt();
        return OpHora;
    }
    public int SeleccionarAsiento(){
        System.out.println("Ingrese el asiento que desdea ocupar (1-30): ");
        int Asiento=scan.nextInt();
        return Asiento;
    }
        public void ConfirmarPago(){
        System.out.println("Pago confirmado...."); 
}
}
