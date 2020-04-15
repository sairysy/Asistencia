/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import Entidades.Horario;
import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author sairy
 */
public class FHorario implements Serializable{
    
public static boolean Insertar(Horario horario) throws Exception {
        boolean eje = false;
        try {
            ArrayList<accesodatos.Parametro> lstP = new ArrayList<accesodatos.Parametro>();
            String sql = "select * from public.horario_insertar(?,?,?,?,?,?,?,?)";
            
            
            lstP.add(new accesodatos.Parametro(1, horario.getIdhorario()));
            lstP.add(new accesodatos.Parametro(2, horario.getNombre()));
            //lstP.add(new accesodatos.Parametro(3, horario
            lstP.add(new accesodatos.Parametro(3, horario.getHora_inicio()));
            lstP.add(new accesodatos.Parametro(4, horario.getHora_final()));
            lstP.add(new accesodatos.Parametro(5, horario.getIngreso_temprano()));
            lstP.add(new accesodatos.Parametro(6, horario.getSalida_tardia()));
            //lstP.add(new accesodatos.Parametro(8, horario.get()));
            //lstP.add(new accesodatos.Parametro(9, horario.getIdhorario()));
            lstP.add(new accesodatos.Parametro(7, horario.getMinutos_contar()));
            lstP.add(new accesodatos.Parametro(8, horario.getMin_sal_temprano()));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = true;
            }
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return eje;
    }

    public static ArrayList<Horario> llenarHorarios(ConjuntoResultado rs) throws Exception {
        ArrayList<Horario> lst = new ArrayList<Horario>();
        Horario horario = null;
        try {
            while (rs.next()) {
                horario = new Horario(rs.getInt("pidhorario"),rs.getString("pnombre"),rs.getString("phora_inicio"),rs.getString("phora_final"),rs.getInt("pingreso_temprano"),
                           rs.getInt("psalida_tardia"),rs.getInt("pminutos_contar"),rs.getInt("pmin_sal_temprano"));
                lst.add(horario);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<Horario> ObtenerHorarios() throws Exception {
        ArrayList<Horario> lst = new ArrayList<Horario>();
        try {
            String sql = "select * from public.horario_buscartodos()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarHorarios(rs);
            rs = null;

        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static Horario ObtenerHorarioDadoCodigo(int codigo) throws Exception {
        Horario lst;
        try {
            ArrayList<accesodatos.Parametro> lstP = new ArrayList<accesodatos.Parametro>();
            String sql = "select * from public.horario_buscarporid(?)";
            lstP.add(new accesodatos.Parametro(1, codigo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new Horario();
            lst = llenarHorarios(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static boolean actualizar(Horario horario) throws Exception {
        boolean eje = false;
        try {
            ArrayList<accesodatos.Parametro> lstP = new ArrayList<accesodatos.Parametro>();
            String sql = "select * from public.horario_editar(?,?,?,?,?,?,?,?)";
           
            lstP.add(new accesodatos.Parametro(1, horario.getIdhorario()));
            lstP.add(new accesodatos.Parametro(2, horario.getNombre()));
            //lstP.add(new accesodatos.Parametro(3, horario
            lstP.add(new accesodatos.Parametro(3, horario.getHora_inicio()));
            lstP.add(new accesodatos.Parametro(4, horario.getHora_final()));
            lstP.add(new accesodatos.Parametro(5, horario.getIngreso_temprano()));
            lstP.add(new accesodatos.Parametro(6, horario.getSalida_tardia()));
            //lstP.add(new accesodatos.Parametro(8, horario.get()));
            //lstP.add(new accesodatos.Parametro(9, horario.getIdhorario()));
            lstP.add(new accesodatos.Parametro(7, horario.getMinutos_contar()));
            lstP.add(new accesodatos.Parametro(8, horario.getMin_sal_temprano()));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
           
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = true;
            }
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return eje;
    }

    public static boolean eliminar(Horario horario) throws Exception {
        boolean eje = false;
        try {
            ArrayList<accesodatos.Parametro> lstP = new ArrayList<accesodatos.Parametro>();
            String sql = "select * from public.horario_eliminar(?)";
            lstP.add(new accesodatos.Parametro(1, horario.getIdhorario()));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = true;
            }
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return eje;
    }
}

