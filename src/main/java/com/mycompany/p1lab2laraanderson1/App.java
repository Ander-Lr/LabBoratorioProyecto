
package com.mycompany.p1lab2laraanderson1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class App {
    
    public static void main(String[] args) {
    MenuPrincipal menu= new MenuPrincipal();
      //  op2Json json=new op2Json();
      //  json.OpJson(); 
     ArrayList <String> caratula =new ArrayList();//crear arrarlist
     caratula.add("******************************************************");
     caratula.add("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");///metiendo datos a array list
     caratula.add("NOMBRE: LARA ANDERSON");///metiendo datos a array list
     caratula.add("CURSO: 2 ITIN");///metiendo datos a array list
     caratula.add("MATERIA: POO");///metiendo datos a array list
     caratula.add("DOCENTE: VERONICA MARTINEZ");///metiendo datos a array list
     caratula.add("LABORTATORIO 2");///metiendo datos a array list
     caratula.add("SISTEMA DE GESTION DE UN CINE");
     caratula.add("******************************************************");
///Escribir archivo
     try(BufferedWriter bw=new BufferedWriter(new FileWriter("Encabezado.txt"))){
         for (int i=0;i<caratula.size();i++){
             bw.write(caratula.get(i));// escribir array / leer posicion de arraylist
               bw.newLine();//salto de linea
         }  
     }catch(IOException e){
         System.out.println("Error-. Archivo no encontrado");
     }finally{/// se coloca finaly despues de una sentancia de try
///leer archivo
        try(BufferedReader br=new BufferedReader(new FileReader("Encabezado.txt")) ){
            String linea;
            while((linea=br.readLine())!=null){
                 System.out.println(linea);
                 }
        
     }catch(IOException e){
         System.out.println("Error. Archivo no encontrado");
        } 
       }
     menu.OpMenu();
    }  
}


class MenuPrincipal{ 
    public void OpMenu(){
    Scanner scan=new Scanner(System.in);
        int op;
        Op1 Opcion1=new Op1();
        Op2 Opcion2=new Op2(); 
        op2Json ActualizarJson=new op2Json();
        do{
        System.out.println("**********MENU PRINCIPAL*********");
        System.out.println("1.....Boleteria");
        System.out.println("2.....Gestionar Cartelera");
        System.out.println("3.....EliminarCaratula txt");
        System.out.println("4...Salir");
        System.out.println("*********************************");
        op=scan.nextInt();
        switch(op){
            case 1:
                Opcion1.MostrarOpcion();
                break;
            case 2:
        System.out.println("*********MOSTRANDO PELICULAS DISPONIBLES POR TEMPORADA (Se mostrara en un archivo CSV)*******");
        Opcion2.MostrarPeliculas();
        System.out.println("*************************************************************");
                System.out.println("1...Actualizar Cartelera..(Hasta 4 peliculas)");
                System.out.println("2...Eliminar Cartelera...");
                System.out.println("3...Salir");
 
                System.out.println("Elija una opcion");
                int Op2=scan.nextInt();
                while(Op2<1||Op2>3){
                 System.out.println("Error. Opcion no valida. Elija una opcion");
                Op2=scan.nextInt();                   
                }
                if (Op2==1){
                    ActualizarJson.OpJson();
                }else if (Op2==2){
                    File file =new File("RegistroPeliculas.csv");
                    
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("Archivo RegistroPeliculas.csv eliminado con éxito.");
            } else {
                System.out.println("Error al intentar eliminar el archivo RegistroPeliculas.csv.");
            }
        } else {
            System.out.println("El archivo RegistroPeliculas.csv no existe.");
        }
                }else if(Op2==3){
                    System.out.println("***Hasta pronto...");
                }
                break;
            case 3:
             File file =new File("Encabezado.txt");   
            if (file.exists()) {
            if (file.delete()) {
                System.out.println("Archivo Encabezado.txt eliminado con éxito.");
            } else {
                System.out.println("Error al intentar eliminar el archivo Encabezado.txt.");
            }
        } else {
            System.out.println("El archivo Encabezado.txt no existe.");
        }
                
                break;
                
            case 4:
                System.out.println("Gracias por usar...");
                break;
            default:
                System.out.println("Error. Opcion no valida");
                break;
        }
             }while(op!=4);
        }
    }
    
 class Op1{
     
     public void MostrarOpcion(){
         char band='F';
        Scanner scan= new Scanner(System.in);
        System.out.println("********INGRESE DATOS DEL EMPLEADO A CARGO********");
        System.out.println("Ingrese nombre del Empleado encargado: ");
        String NombreEmpleado=scan.nextLine();
        //////////////CONTROLAR LOS CARACTERES DEL EMPLEADO
        while ((NombreEmpleado.length())>15){
                 System.out.print("***Error. Nombre del Empleado no puede exceder los 15 caracteres. Intente nuevamente: ");
                 NombreEmpleado=scan.nextLine();
            }
        
        System.out.println("Ingrese codigo Empleado: ");
        String CodigoEmpleado=scan.nextLine();
        ///////////////////////CONTROLAR EL CODIGO DE EMPLEADO
            while(band=='F'){
               for(char CodigoEmp:CodigoEmpleado.toCharArray()){
                if (!Character.isDigit(CodigoEmp)){
                    band='F';
         System.out.print("***Error, codigo de Empleado (Solo puede tener 5 numeros). Intente nuevamente: ");
         CodigoEmpleado=scan.nextLine();
                    break;
                }
                band='V';
            }}
            while ((CodigoEmpleado.length())!=5){
                 System.out.print("***Error, codigo de Empleado (Solo puede tener 5 numeros). Intente nuevamente: ");
                 CodigoEmpleado=scan.nextLine(); 
            }
        ///////////////////////////////////////
        System.out.println("Ingrese Fecha de compra: ");
        /////CONTROLAR DIA
         System.out.println("Ingrese Dia (1-30):");
         int dia=scan.nextInt();
         while(dia<1||dia>30){
             System.out.println("Error. dia solo tiene 30 dias. Intente de nuevo: ");
             dia=scan.nextInt();
         }
         System.out.println("Ingrese Mes (1-12):");
         int mes =scan.nextInt();
         while(mes<1||mes>12){
             System.out.println("Error. Mes solo puede tener 12 meses (+)");
             mes =scan.nextInt();
         }
         System.out.println("Ingrese Anio (Anio Actual 2023): ");
         int Anio=scan.nextInt();
         while(Anio!=2023){
             System.out.println("Error. Solo se puede elegir el anio actual");
             Anio=scan.nextInt();
         }
        String FechaCompraBoleto= Integer.toString(dia)+"/"+Integer.toString(mes)+"/"+Integer.toString(Anio);
        Cajero cajero = new Cajero(FechaCompraBoleto,NombreEmpleado,CodigoEmpleado);
        ///////////////////////////
        scan.nextLine();
        System.out.println("********INGRESE DATOS DEL CLIENTE A ATENDER*******");
        System.out.println("Ingrese nombre y apellidos del cliente ");
        String NombreCliente=scan.nextLine();
         while ((NombreCliente.length())>20){
                 System.out.print("***Error. Nombre y Apellido del Cliente no puede exceder los 20 caracteres. Intente nuevamente: ");
                 NombreCliente=scan.nextLine();
            }

        System.out.println("Ingrese cedula de Cliente:");
        String CedulaCliente=scan.nextLine();
 ///////////////////CONTROLAR CEDULA
            while(band=='F'){
               for(char Cedula:CedulaCliente.toCharArray()){
                if (!Character.isDigit(Cedula)){
                    band='F';
         System.out.print("***Error, Cedula (Solo puede tener 10 numeros). Intente nuevamente: ");
         CedulaCliente=scan.nextLine();
                    break;
                }
                band='V';
            }}
            while ((CedulaCliente.length())!=10){
                 System.out.print("***Error, Cedula (Solo puede tener 10 numeros). Intente nuevamente: ");
                 CedulaCliente=scan.nextLine();
            }
////////////////////////////
        
        System.out.println("Ingrese Direccion del cliente: ");
        String DireccionCliente=scan.nextLine();
        
        System.out.println("Ingrese correo del cliente");
        String CorreoCliente=scan.nextLine();
        
        Cliente cliente = new Cliente (DireccionCliente,CorreoCliente,NombreCliente,CedulaCliente);
        String nombrePelicula=cliente.SeleccionarPelicula();
        
        while(cajero.VerificarPelicula(nombrePelicula)==false){
            nombrePelicula=cliente.SeleccionarPelicula();
            cajero.VerificarPelicula(nombrePelicula);
        }
        
        int hora=cliente.SeleccionarHora();
        hora=cajero.VerfiricarHorario(hora);
        String Horario;
        
        if(hora==1){
             Horario="13:00-15:00";
        }else if (hora==2){
             Horario="15:00-17:00";
        }else if(hora==3){
             Horario="17:00-19:00";
        }else if (hora==4){
             Horario="19:00-21:00";
        }
        
        String Sala=cajero.AsignarSala(hora);
        System.out.println("SALA: "+Sala);
        System.out.println("HORA: "+hora);
        
        int Asiento=cliente.SeleccionarAsiento();
        Asiento=cajero.VerificarAsiento(Asiento);
        

        Pelicula peliculas =new Pelicula("A","Comedia",6.50f,Sala,Asiento,"13:00-15:00",nombrePelicula,"001");
 
        float TotalPagar=6.50f+(6.50f*0.12f);
        
        System.out.println("Total A pagar: "+TotalPagar);  
         System.out.println("DATOS DEL ENCARGADO DE COMPRA: ");
        cajero.MostrarDatos();
         System.out.println("DATOS DEL CLIENTE ATENDIDO");
        cliente.MostrarDatos();
        
        JSONObject DatosCompra=new JSONObject();
        JSONArray Datosventa = new JSONArray();
        DatosCompra.put("Empleado: ",cajero.getNombre());
        DatosCompra.put("CodigoEmpleado: ",cajero.getCodigo());
        DatosCompra.put("FechaCompra:",cajero.FechaCompra);
 
        DatosCompra.put("NomApeCliente: ",cliente.getNombre());
        DatosCompra.put("Cedula: ",cliente.getCodigo());
        DatosCompra.put("Direccion: ",cliente.Direccion);
        DatosCompra.put("Correo: ",cliente.Correo);
        
        DatosCompra.put("NombrePelicula: ", peliculas.getNombre());
        DatosCompra.put("CodigoPelicula: ",peliculas.getCodigo());
        DatosCompra.put("Categoria: ",peliculas.Categoria);
        DatosCompra.put("Genero: ",peliculas.Genero);
        DatosCompra.put("Precio: ",Float.toString(peliculas.Precio));
        DatosCompra.put("Horario: ",peliculas.Horario);
        DatosCompra.put("Sala: ",peliculas.Sala);
        DatosCompra.put("Asiento: ",Integer.toString(peliculas.NumeroAsientos));
        DatosCompra.put("Total a pagar: ",Float.toString(TotalPagar));
        
        //JSONArray DPelicula =new JSONArray();
        Datosventa.add(DatosCompra);
        
        try(FileWriter file= new FileWriter("DatosCompra.json")){
            file.write(Datosventa.toString());
            file.flush();
            System.out.println("Registo de compras perfectamente guardado en DatosCompra.json");
        }catch (IOException e){
            System.out.print("Error no se pudo guardar datos en DatosCompra.json: ");
            e.printStackTrace();
            
        }
   /////
        MostrarFactura factura =new MostrarFactura();
        factura.LeerArchivoJSON();
        cliente.ConfirmarPago();
     }
    
}

class op2Json{
    Op2 Opcion2=new Op2();
    public void OpJson(){

       try(BufferedReader reader=new BufferedReader (new FileReader("RegistroPeliculas.csv"))){
           int i=0;
           String linea=null;
           while((linea = reader.readLine())!=null){
                 i++;
                 if (i>=4){
                break;
                }   
            }
                if (i>=4){
                System.out.println("***Error. Solo se pueden agregar 4 peliculas: ");        
            }else{
                Opcion2.Guardarpeliculas();
                
                }
       }catch(IOException e){
           System.out.println("***Error al leer archivo RegistroPeliculas.csv para contar");
           System.out.println("***El archivo se ha eliminado o no se encuentra. Cree uno de nuevo:");
            Opcion2.Guardarpeliculas();
       }
        
        
    }
}




class MostrarFactura{
    
    public void LeerArchivoJSON(){
    JSONParser jsonParser=new JSONParser();
    
    try(FileReader reader =new FileReader("DatosCompra.json")){
        Object obj =jsonParser.parse(reader);
        
        JSONArray DatosCompra =(JSONArray)obj;
        System.out.println("Lectura del JSON dentro del archivo");
        System.out.println(DatosCompra);
        for(Object DCompra:DatosCompra){
            MostrarDtosJson((JSONObject) DCompra);
        }
        
    }catch(FileNotFoundException e){
        System.out.println("Error al abrir el Json DatosCompra.json");
    }catch(IOException e){
        System.out.println("Error al abrir el Json DatosCompra.json");
    }catch(ParseException e){
        System.out.println("Error al abrir el Json DatosCompra.json");
    }
    
    }
    
    public void MostrarDtosJson(JSONObject jsonObject){
       JSONObject DatosCompra = (JSONObject) jsonObject;
        System.out.println("*****Datos de compra dentro del JSON******");
        
        String Empleado=(String) DatosCompra.get("Empleado: ");
        System.out.println("Nombre del Empleado: "+Empleado);
        
        String CEmpleado=(String)DatosCompra.get("CodigoEmpleado: ");
        System.out.println("Codigo del Empleado: "+CEmpleado);
        
        String Fecha=(String)DatosCompra.get("FechaCompra: ");
        System.out.println("Fecha de compra: "+Fecha);
        
        String Cliente=(String)DatosCompra.get("NomApeCliente: ");
        System.out.println("Nombre del Cliente: "+Cliente);
        
        String Cedula=(String)DatosCompra.get("Cedula: ");
        System.out.println("Cedula del cliente: "+Cedula);
        
        String Direccion=(String)DatosCompra.get("Direccion: ");
        System.out.println("Direccion del Cliente: "+Direccion);
    
        String Correo=(String)DatosCompra.get("Correo: ");
        System.out.println("Correo del cliente :"+Correo);
        
        String Pelicula=(String)DatosCompra.get("NombrePelicula: ");
        System.out.println("Nombre de la pelicula: "+Pelicula);
        
        String CodigoPeli=(String)DatosCompra.get("CodigoPelicula: ");
        System.out.println("Codigo de la pelicula: "+CodigoPeli);
        
        String Categoria=(String)DatosCompra.get("Categoria: ");
        System.out.println("Categoria: "+Categoria);
        
        String Genero = (String)DatosCompra.get("Genero: ");
        System.out.println("Genero: "+Genero);
        
        String Precio=(String)DatosCompra.get("Precio: ");
        System.out.println("Precio de la pelicula: "+Precio);
        
        String Horario=(String)DatosCompra.get("Horario: ");
        System.out.println("Horario de entrada a la pelicula: "+Horario);
        
        String Sala=(String)DatosCompra.get("Sala: ");
        System.out.println("Sala: "+Sala);
        
        String Asiento =(String)DatosCompra.get("Asiento: ");
        System.out.println("Asiento reservados: "+Asiento);
        
        String Total=(String)DatosCompra.get("Total a pagar: ");
        System.out.println("Total a pagar +IVA: "+Total);  
    }    
}
class Op2{

    
    public void Guardarpeliculas(){
        Scanner sc=new Scanner(System.in);
        ArrayList<Pelicula> ADPeliculas=new ArrayList<Pelicula>();
        Pelicula pelicula; 
        File fileCSV=new File("RegistroPeliculas.csv");
        String CategoriaPelicula;
        String GeneroPelicula;
        String SalaPelicula;
        String HorarioPelicula;
        String NombrePelicula;
        String CodigoPelicula;
        
        char band='F';/// banderita que lana V o F en caso de que se ingrese alguna letra en CODIGO
            System.out.print("Ingrese NOMBRE DE PELICULA (max 15 Caracteres): ");
            NombrePelicula=sc.nextLine();
            while ((NombrePelicula.length())>15){
                 System.out.print("***Error. Nombre de pelicula no puede exeder los 15 caracteres. Intente nuevamente: ");
                 NombrePelicula=sc.nextLine();
            }
            System.out.print("Ingrese CODIGO DE PELICULA (Solo puede tener 5 numeros): ");
            CodigoPelicula=sc.nextLine();
            while(band=='F'){
               for(char CodigoPeli:CodigoPelicula.toCharArray()){
                if (!Character.isDigit(CodigoPeli)){
                    band='F';
         System.out.print("***Error, codigo de pelicula (Solo puede tener 5 numeros). Intente nuevamente: ");
         CodigoPelicula=sc.nextLine(); 
                    break;
                }
                band='V';
            }}
            while ((CodigoPelicula.length())!=5){
                 System.out.print("***Error, codigo de pelicula (Solo puede tener 5 numeros). Intente nuevamente: ");
                 CodigoPelicula=sc.nextLine(); 
            }
            System.out.print("Ingrese CATEGORIA DE PELICULA (A/B/C/D) (Debe tener una letra:): ");
            CategoriaPelicula=sc.nextLine();
            band='F';  
            do{   
                CategoriaPelicula.toUpperCase();   
                if(((CategoriaPelicula.toUpperCase()).compareTo("A"))==0){
                 band='V';   
                }else if (((CategoriaPelicula.toUpperCase()).compareTo("B"))==0){
                 band='V';                       
                }else if (((CategoriaPelicula.toUpperCase()).compareTo("C"))==0){
                  band='V';                                       
                }else if (((CategoriaPelicula.toUpperCase()).compareTo("D"))==0){
                  band='V';                                      
                }else if(band=='F'){
                   System.out.print("***Error. categoria solo debe tener 1 caracter entre A Y D: ");
                    CategoriaPelicula=sc.nextLine();                    
                }
            }while(band!='V');
            System.out.print("Ingrese GENERO DE PELICULA (15 caracte. Max): ");
            GeneroPelicula=sc.nextLine();
            while((GeneroPelicula.length())>15){
               System.out.print("Ingrese GENERO DE PELICULA (15 caracte. Max): ");
                GeneroPelicula=sc.nextLine();
            }
            pelicula =new Pelicula(CategoriaPelicula.toUpperCase(),GeneroPelicula,6.50f,"A/B/C/D",30,"13:00-15:00/15:00-17:00/17:00-19:00/19:00-21:00",NombrePelicula,CodigoPelicula);
            ADPeliculas.add(pelicula);       
 
            try(FileWriter file= new FileWriter(fileCSV,true)){
                
                for(Pelicula peli :ADPeliculas ){
                    file.write(peli.ActualizarPeliculas()+"\n");
                }
                System.out.println("Datos de peliculas guardados en RegistroPeliculas.csv exitosamente");
            }catch(Exception e){
                System.out.println("***Error. Al abrir RegistroPeliculas.csv");
            } 
        }
    
    public void MostrarPeliculas(){
        ArrayList<Pelicula> ADPeliculas=new ArrayList<Pelicula>(); 
        Pelicula pelicula;
        String [] DatosPelicula;
        try(Scanner file = new Scanner(new File("RegistroPeliculas.csv"))){
            while (file.hasNextLine()) {
                 DatosPelicula = file.nextLine().split(",");
                    if (DatosPelicula.length >= 8) {
                          pelicula = new Pelicula(DatosPelicula[0], DatosPelicula[1], Float.parseFloat(DatosPelicula[2]), DatosPelicula[3], Integer.parseInt(DatosPelicula[4]), DatosPelicula[5], DatosPelicula[6], DatosPelicula[7]);
                          ADPeliculas.add(pelicula);
        } else {
            
            System.out.println("***Error: Formato incorrecto en una línea del archivo.");
        }
    }   
        }catch(Exception e){
            System.out.println("***Error al leer RegistroPeliculas.csv: " + e.getMessage());
        }
        for (Pelicula peli: ADPeliculas){
            System.out.println(peli.MostrarDatosPelis());
        }
    }

}

