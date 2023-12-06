
package com.mycompany.p1lab2laraanderson1;

public class Cine {
    private String Nombre;
    private String Codigo;

    public Cine(String Nombre, String Codigo) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
    }
    public String getNombre() {
        return Nombre;
    }
    public String getCodigo() {
        return Codigo;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    public void MostrarDatos(){
        System.out.println("Nombre: "+Nombre);
        System.out.println("Codigo: "+Codigo);
    }
  
}
