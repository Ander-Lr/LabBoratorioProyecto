
package com.mycompany.p1lab2laraanderson1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Cajero extends Cine {
    String FechaCompra;
    Scanner scan =new Scanner(System.in);

    public Cajero(String FechaCompra, String Nombre, String Codigo) {
        super(Nombre, Codigo);
        this.FechaCompra = FechaCompra;
    }
    
    public boolean VerificarPelicula(String NombrePelicula){
        boolean Busqueda=false;
       try{
          // BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
           BufferedReader reader=new BufferedReader (new FileReader("RegistroPeliculas.csv"));
           System.out.println("Buscando pelicula en RegistroPeliculas.csv....");
           // NombrePelicula=in.readLine();
           
           String linea=null;
           while((linea = reader.readLine())!=null){
               String[]partes=linea.split(",");
               int partesTotales=partes.length;
               for(int i=0;i<partesTotales;i++){
                   if (NombrePelicula.compareTo(partes[i])==0){
                       System.out.println("Pelicula si existe en el registro..");
                       Busqueda=true;
                       break;
                   }
               }
           }
           if (Busqueda ==false){
               System.out.println("Pelicula no existe en el registro..");             
           }else{
               System.out.println("Busqueda completada....");
           }
       }catch(IOException e){
           System.out.println("Error al leer archivo RegistroPeliculas.csv");
       }
       return Busqueda;
    }
    public int VerfiricarHorario(int OpHora){
        while ( OpHora<1||OpHora>4){
            System.out.println("Error. Opcion incorrecta. Seleccione nuevamente: ");
            System.out.println("1........13:00-15:00");
            System.out.println("2........15:00-17:00");
            System.out.println("3........17:00-19:00");
            System.out.println("4........19:00-21:00");
            OpHora=scan.nextInt();
        }
        return OpHora;
    }

    public String AsignarSala(int OpHora){
        String Sala;
        if (OpHora==1){
            Sala="A";
        }else if (OpHora==2){
            Sala="B";
        }else if (OpHora==3){
             Sala="C";
        }else if(OpHora==4){
             Sala="D";
        }else{
            Sala=" ";
            System.out.println("Error");
        }
        return Sala;
    }
    public int VerificarAsiento(int Asiento){
       while(Asiento<1||Asiento>30){
            System.out.println("Error. Asiento no existe. Ingrese de nuevo (1-30): ");
            Asiento=scan.nextInt();
        }
       return Asiento;
    }
    

}
