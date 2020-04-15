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
public class Departamentos {
    private int iddepartamento;
    private Empresa empresa;
    private Turnos turnos;
    private String nombredepartamento;

    public Departamentos() {
    }

    public Departamentos(int iddepartamento, Empresa empresa, Turnos turnos, String nombredepartamento) {
        this.iddepartamento = iddepartamento;
        this.empresa = empresa;
        this.turnos = turnos;
        this.nombredepartamento = nombredepartamento;
    }

    public int getIddepartamento() {
        return iddepartamento;
    }

    public void setIddepartamento(int iddepartamento) {
        this.iddepartamento = iddepartamento;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Turnos getTurnos() {
        return turnos;
    }

    public void setTurnos(Turnos turnos) {
        this.turnos = turnos;
    }

    public String getNombredepartamento() {
        return nombredepartamento;
    }

    public void setNombredepartamento(String nombredepartamento) {
        this.nombredepartamento = nombredepartamento;
    }
 @Override 
    public String toString(){
        return nombredepartamento;
    }
}
