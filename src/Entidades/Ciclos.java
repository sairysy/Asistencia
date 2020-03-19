/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;



/**
 *
 * @author sairy
 */
public class Ciclos {
  private int idciclo;
private Date fechainicio;
private String tipo;
private int nociclos;

    public Ciclos() {
    }

    public Ciclos(int idciclo, Date fechainicio, String tipo, int nociclos) {
        this.idciclo = idciclo;
        this.fechainicio = fechainicio;
        this.tipo = tipo;
        this.nociclos = nociclos;
    }

    public int getIdciclo() {
        return idciclo;
    }

    public void setIdciclo(int idciclo) {
        this.idciclo = idciclo;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNociclos() {
        return nociclos;
    }

    public void setNociclos(int nociclos) {
        this.nociclos = nociclos;
    }

}
