/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.sql.Time;

/**
 *
 * @author sairy
 */
public class Descansos {
    private int iddescanso;
    private String nombredescanso;
    private Time hora_inicio;
    private Time hora_fin;
    private int descanso_minutos;
    private String estado_cobro;

    public Descansos() {
    }

    public Descansos(int iddescanso, String nombredescanso, Time hora_inicio, Time hora_fin, int descanso_minutos, String estado_cobro) {
        this.iddescanso = iddescanso;
        this.nombredescanso = nombredescanso;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.descanso_minutos = descanso_minutos;
        this.estado_cobro = estado_cobro;
    }

    public int getIddescanso() {
        return iddescanso;
    }

    public void setIddescanso(int iddescanso) {
        this.iddescanso = iddescanso;
    }

    public String getNombredescanso() {
        return nombredescanso;
    }

    public void setNombredescanso(String nombredescanso) {
        this.nombredescanso = nombredescanso;
    }

    public Time getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(Time hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public Time getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(Time hora_fin) {
        this.hora_fin = hora_fin;
    }

    public int getDescanso_minutos() {
        return descanso_minutos;
    }

    public void setDescanso_minutos(int descanso_minutos) {
        this.descanso_minutos = descanso_minutos;
    }

    public String getEstado_cobro() {
        return estado_cobro;
    }

    public void setEstado_cobro(String estado_cobro) {
        this.estado_cobro = estado_cobro;
    }
    
    
}
