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
public class Ciudad {
  private int  idciudad;
  private String nombreciudad;

    public Ciudad() {
    }

    public Ciudad(int idciudad, String nombreciudad) {
        this.idciudad = idciudad;
        this.nombreciudad = nombreciudad;
    }

    public int getIdciudad() {
        return idciudad;
    }

    public void setIdciudad(int idciudad) {
        this.idciudad = idciudad;
    }

    public String getNombreciudad() {
        return nombreciudad;
    }

    public void setNombreciudad(String nombreciudad) {
        this.nombreciudad = nombreciudad;
    }
   
 
}
