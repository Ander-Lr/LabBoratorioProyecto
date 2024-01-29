/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlled;

/**
 *
 * @author cs023
 */
public class Usuario {
     public String nomb;
    public String correo;
    public String telef;
    public String ci;
    public String cont;
    
    public Usuario (String nomb, String correo, String telef, String ci, String cont){
        this.nomb=nomb;
        this.correo=correo;
        this.telef=telef;
        this.ci=ci;
        this.cont=cont;
    }
    
    //GETTERS
    public String getnomb(){
        return nomb;
    }

    public String getcorreo(){
        return correo;
    }
    public String gettelef(){
        return telef;
    }
    public String getci(){
        return ci;
    }
    public String getcont(){
        return cont;
    }
    //GETTER DE FECHA
    //SETTES
    public void setnomb(String nomb){
        this.nomb=nomb;
    }
    public void setcorreo(String correo){
        this.correo=correo;
    }
    public void settelef(String telef){
        this.telef=telef;
    }
    public void setci(String ci){
        this.ci=ci;
    }    
    public void setcont(String cont){
        this.cont=cont;
    }
}
