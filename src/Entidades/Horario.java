/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

/**
 *
 * @author sairy
 */
public class Horario {
  private int idhorario;
  private String nombre;
  //private boolean estado;
  private String  hora_inicio;
  private String hora_final;
  private int ingreso_temprano;
  private int salida_tardia;
//  private boolean contar_retardo;
//  private boolean contar_saltemp;
  private int minutos_contar;
  private int min_sal_temprano;

    public Horario() {
    }

    public Horario(int idhorario, String nombre, String hora_inicio, String hora_final, int ingreso_temprano, int salida_tardia, int minutos_contar, int min_sal_temprano) {
        this.idhorario = idhorario;
        this.nombre = nombre;
        this.hora_inicio = hora_inicio;
        this.hora_final = hora_final;
        this.ingreso_temprano = ingreso_temprano;
        this.salida_tardia = salida_tardia;
        this.minutos_contar = minutos_contar;
        this.min_sal_temprano = min_sal_temprano;
    }

    public int getIdhorario() {
        return idhorario;
    }

    public void setIdhorario(int idhorario) {
        this.idhorario = idhorario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public String getHora_final() {
        return hora_final;
    }

    public void setHora_final(String hora_final) {
        this.hora_final = hora_final;
    }

    public int getIngreso_temprano() {
        return ingreso_temprano;
    }

    public void setIngreso_temprano(int ingreso_temprano) {
        this.ingreso_temprano = ingreso_temprano;
    }

    public int getSalida_tardia() {
        return salida_tardia;
    }

    public void setSalida_tardia(int salida_tardia) {
        this.salida_tardia = salida_tardia;
    }

    public int getMinutos_contar() {
        return minutos_contar;
    }

    public void setMinutos_contar(int minutos_contar) {
        this.minutos_contar = minutos_contar;
    }

    public int getMin_sal_temprano() {
        return min_sal_temprano;
    }

    public void setMin_sal_temprano(int min_sal_temprano) {
        this.min_sal_temprano = min_sal_temprano;
    }

}