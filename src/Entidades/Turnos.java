/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author sairy
 */
public class Turnos {
  private int idturno;
  private int idcodpago;
  private int idhorario;
  private String nombreturno;
  private Date fecha;
  private Time hora_entrada;
  private Time hora_salida;

    public Turnos() {
    }

    public Turnos(int idturno, int idcodpago, int idhorario, String nombreturno, Date fecha, Time hora_entrada, Time hora_salida) {
        this.idturno = idturno;
        this.idcodpago = idcodpago;
        this.idhorario = idhorario;
        this.nombreturno = nombreturno;
        this.fecha = fecha;
        this.hora_entrada = hora_entrada;
        this.hora_salida = hora_salida;
    }

    public int getIdturno() {
        return idturno;
    }

    public void setIdturno(int idturno) {
        this.idturno = idturno;
    }

    public int getIdcodpago() {
        return idcodpago;
    }

    public void setIdcodpago(int idcodpago) {
        this.idcodpago = idcodpago;
    }

    public int getIdhorario() {
        return idhorario;
    }

    public void setIdhorario(int idhorario) {
        this.idhorario = idhorario;
    }

    public String getNombreturno() {
        return nombreturno;
    }

    public void setNombreturno(String nombreturno) {
        this.nombreturno = nombreturno;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(Time hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public Time getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(Time hora_salida) {
        this.hora_salida = hora_salida;
    }
    
  
}
