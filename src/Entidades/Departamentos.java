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
    private int idempresa;
    private int idturno;
    private String nombredepartamento;

    public Departamentos() {
    }

    public Departamentos(int iddepartamento, int idempresa, int idturno, String nombredepartamento) {
        this.iddepartamento = iddepartamento;
        this.idempresa = idempresa;
        this.idturno = idturno;
        this.nombredepartamento = nombredepartamento;
    }

    public int getIddepartamento() {
        return iddepartamento;
    }

    public void setIddepartamento(int iddepartamento) {
        this.iddepartamento = iddepartamento;
    }

    public int getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(int idempresa) {
        this.idempresa = idempresa;
    }

    public int getIdturno() {
        return idturno;
    }

    public void setIdturno(int idturno) {
        this.idturno = idturno;
    }

    public String getNombredepartamento() {
        return nombredepartamento;
    }

    public void setNombredepartamento(String nombredepartamento) {
        this.nombredepartamento = nombredepartamento;
    }
    
    
}
