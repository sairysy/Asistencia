/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import Entidades.Codpago;
import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author sairy
 */
public class FCodPago {
 public static boolean Insertar(Codpago codpago) throws Exception {
        boolean eje = false;
        try {
            ArrayList<accesodatos.Parametro> lstP = new ArrayList<accesodatos.Parametro>();
            String sql = "select * from public.codpago_insertar(?,?)";
            
            
            lstP.add(new accesodatos.Parametro(1, codpago.getIdcodpago()));
            lstP.add(new accesodatos.Parametro(2, codpago.getCodpagonombre()));
            
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

    public static ArrayList<Codpago> llenarCodpagoes(ConjuntoResultado rs) throws Exception {
        ArrayList<Codpago> lst = new ArrayList<Codpago>();
        Codpago codpago = null;
        try {
            while (rs.next()) {
                codpago = new Codpago(rs.getInt("pidcodpago"),rs.getString("pcodpagonombre"));
                lst.add(codpago);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<Codpago> ObtenerCodpagoes() throws Exception {
        ArrayList<Codpago> lst = new ArrayList<Codpago>();
        try {
            String sql = "select * from public.codpago_buscartodos()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarCodpagoes(rs);
            rs = null;

        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static Codpago ObtenerCodpagoDadoCodigo(int codigo) throws Exception {
        Codpago lst;
        try {
            ArrayList<accesodatos.Parametro> lstP = new ArrayList<accesodatos.Parametro>();
            String sql = "select * from public.codpago_buscarporid(?)";
            lstP.add(new accesodatos.Parametro(1, codigo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new Codpago();
            lst = llenarCodpagoes(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static boolean actualizar(Codpago codpago) throws Exception {
        boolean eje = false;
        try {
            ArrayList<accesodatos.Parametro> lstP = new ArrayList<accesodatos.Parametro>();
            String sql = "select * from public.codpago_editar(?,?)";
           
            lstP.add(new accesodatos.Parametro(1, codpago.getIdcodpago()));
            lstP.add(new accesodatos.Parametro(2, codpago.getCodpagonombre()));
           
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

    public static boolean eliminar(Codpago codpago) throws Exception {
        boolean eje = false;
        try {
            ArrayList<accesodatos.Parametro> lstP = new ArrayList<accesodatos.Parametro>();
            String sql = "select * from public.codpago_eliminar(?)";
            lstP.add(new accesodatos.Parametro(1, codpago.getIdcodpago()));
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
