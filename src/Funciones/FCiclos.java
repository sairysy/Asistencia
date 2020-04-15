/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import Entidades.Ciclos;
import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author sairy
 */
public class FCiclos implements Serializable{
    
public static boolean Insertar(Ciclos ciclos) throws Exception {
        boolean eje = false;
        try {
            
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from public.ciclo_insertar(?,?,?,?)";
            lstP.add(new Parametro(1, ciclos.getIdciclo()));
            lstP.add(new Parametro(2, ciclos.getFechainicio()));
            lstP.add(new Parametro(3, ciclos.getTipo()));
            lstP.add(new Parametro(4, ciclos.getNociclos()));
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
    public static ArrayList<Ciclos> llenarCiclos(ConjuntoResultado rs) throws Exception {
        ArrayList<Ciclos> lst = new ArrayList<Ciclos>();
        Ciclos ciclos = null;
        try {
            while (rs.next()) {
                ciclos = new Ciclos(rs.getInt("pidciclo"),rs.getDate("pfechainicio"),rs.getString("ptipo"),rs.getInt("pnociclos"));
                lst.add(ciclos);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<Ciclos> ObtenerCiclos() throws Exception {
        ArrayList<Ciclos> lst = new ArrayList<Ciclos>();
        try {
            String sql = "select * from public.ciclo_buscartodos()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarCiclos(rs);
            rs = null;

        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static Ciclos ObtenerCiclosDadoCodigo(int codigo) throws Exception {
        Ciclos lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from public.ciclo_buscarporid(?)";
            lstP.add(new Parametro(1, codigo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new Ciclos();
            lst = llenarCiclos(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static boolean actualizar(Ciclos ciclos) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from public.ciclo_editar(?,?,?,?)";
             lstP.add(new Parametro(1, ciclos.getIdciclo()));
            lstP.add(new Parametro(2, ciclos.getFechainicio()));
            lstP.add(new Parametro(3, ciclos.getTipo()));
            lstP.add(new Parametro(4, ciclos.getNociclos()));
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
    public static boolean eliminar(Ciclos ciclos) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select *from public.ciclo_eliminar(?)";
            lstP.add(new Parametro(1, ciclos.getIdciclo()));
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
    

