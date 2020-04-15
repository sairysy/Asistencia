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
public class Empresa {
    private int idempresa;
    private int idciudad;
    private String nombreempresa;
    private String direccion1;
    private String direccion2;
    private String estado;
    private String sitioweb;
    private String email;
    private String telefono;

    public Empresa() {
    }

    public Empresa(int idempresa, int idciudad, String nombreempresa, String direccion1, String direccion2, String estado, String sitioweb, String email, String telefono) {
        this.idempresa = idempresa;
        this.idciudad = idciudad;
        this.nombreempresa = nombreempresa;
        this.direccion1 = direccion1;
        this.direccion2 = direccion2;
        this.estado = estado;
        this.sitioweb = sitioweb;
        this.email = email;
        this.telefono = telefono;
    }

    public int getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(int idempresa) {
        this.idempresa = idempresa;
    }

    public int getIdciudad() {
        return idciudad;
    }

    public void setIdciudad(int idciudad) {
        this.idciudad = idciudad;
    }

    public String getNombreempresa() {
        return nombreempresa;
    }

    public void setNombreempresa(String nombreempresa) {
        this.nombreempresa = nombreempresa;
    }

    public String getDireccion1() {
        return direccion1;
    }

    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }

    public String getDireccion2() {
        return direccion2;
    }

    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSitioweb() {
        return sitioweb;
    }

    public void setSitioweb(String sitioweb) {
        this.sitioweb = sitioweb;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    @Override 
    public String toString(){
        return nombreempresa;
    }
}
