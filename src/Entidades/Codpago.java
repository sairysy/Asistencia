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
public class Codpago {
    
    private int idcodpago;
    private String codpagonombre;

    public Codpago() {
    }

    public Codpago(int idcodpago, String codpagonombre) {
        this.idcodpago = idcodpago;
        this.codpagonombre = codpagonombre;
    }

    public int getIdcodpago() {
        return idcodpago;
    }

    public void setIdcodpago(int idcodpago) {
        this.idcodpago = idcodpago;
    }

    public String getCodpagonombre() {
        return codpagonombre;
    }

    public void setCodpagonombre(String codpagonombre) {
        this.codpagonombre = codpagonombre;
    }
    
    
}
