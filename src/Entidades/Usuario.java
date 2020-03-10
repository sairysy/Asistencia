/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author sairy
 */
public class Usuario {
    private int idusuario;
    private String nombreusuario;
    private String claveusuario;

    public Usuario() {
    }

    public Usuario(int idusuario, String nombreusuario, String claveusuario) {
        this.idusuario = idusuario;
        this.nombreusuario = nombreusuario;
        this.claveusuario = claveusuario;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getClaveusuario() {
        return claveusuario;
    }

    public void setClaveusuario(String claveusuario) {
        this.claveusuario = claveusuario;
    }
    
}
