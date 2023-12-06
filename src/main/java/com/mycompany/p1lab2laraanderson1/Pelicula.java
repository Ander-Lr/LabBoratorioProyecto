
package com.mycompany.p1lab2laraanderson1;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class Pelicula extends Cine{
    String Categoria;
    String Genero;
    float Precio;
    String Sala;
    int NumeroAsientos;
    String Horario;
    public Pelicula(String Categoria, String Genero, float Precio, String Sala, int NumeroAsientos, String Horario, String Nombre, String Codigo) {
        super(Nombre, Codigo);
        this.Categoria = Categoria;
        this.Genero = Genero;
        this.Precio = Precio;
        this.Sala = Sala;
        this.NumeroAsientos = NumeroAsientos;
        this.Horario = Horario;
    }

    public String MostrarDatosPelis(){
        return "Persona{"+"Categoria="+Categoria+",Genero="+Genero+",Precio= "+Precio+",Sala= "+Sala+", NumeroAsientos="+NumeroAsientos+",Horario="+Horario+", NomPelicula="+getNombre()+", CodigoPelicula="+getCodigo()+'}'; 
    }
    public String ActualizarPeliculas(){
        return this.Categoria+","+this.Genero+","+this.Precio+","+this.Sala+","+this.NumeroAsientos+","+this.Horario+","+this.getNombre()+","+this.getCodigo();
    }  
}