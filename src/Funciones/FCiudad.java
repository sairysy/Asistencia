/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;



import Entidades.Ciudad;
import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author sairy
 */
public class FCiudad implements Serializable {
    public static boolean Insertar(Ciudad ciudad) throws Exception {
        boolean eje = false;
        try {
            ArrayList<accesodatos.Parametro> lstP = new ArrayList<accesodatos.Parametro>();
            String sql = "select * from public.ciudad_insertar(?)";
            
            
           // lstP.add(new Parametro(1, nivel.getCodigo()));
            lstP.add(new accesodatos.Parametro(1, ciudad.getNombreciudad()));
            
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

    public static ArrayList<Ciudad> llenarCiudades(ConjuntoResultado rs) throws Exception {
        ArrayList<Ciudad> lst = new ArrayList<Ciudad>();
        Ciudad ciudad = null;
        try {
            while (rs.next()) {
                ciudad = new Ciudad(rs.getInt("pidciudad"),rs.getString("pnombreciudad"));
                lst.add(ciudad);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<Ciudad> ObtenerCiudades() throws Exception {
        ArrayList<Ciudad> lst = new ArrayList<Ciudad>();
        try {
            String sql = "select * from public.ciudad_buscartodos()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarCiudades(rs);
            rs = null;

        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static Ciudad ObtenerCiudadDadoCodigo(int codigo) throws Exception {
        Ciudad lst;
        try {
            ArrayList<accesodatos.Parametro> lstP = new ArrayList<accesodatos.Parametro>();
            String sql = "select * from public.ciudad_buscarporid(?)";
            lstP.add(new accesodatos.Parametro(1, codigo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new Ciudad();
            lst = llenarCiudades(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static boolean actualizar(Ciudad ciudad) throws Exception {
        boolean eje = false;
        try {
            ArrayList<accesodatos.Parametro> lstP = new ArrayList<accesodatos.Parametro>();
            String sql = "select * from public.ciudad_editar(?,?)";
           
            lstP.add(new accesodatos.Parametro(1, ciudad.getIdciudad()));
            lstP.add(new accesodatos.Parametro(2, ciudad.getNombreciudad()));
           
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

    public static boolean eliminar(Ciudad ciudad) throws Exception {
        boolean eje = false;
        try {
            ArrayList<accesodatos.Parametro> lstP = new ArrayList<accesodatos.Parametro>();
            String sql = "select * from public.ciudad_eliminar(?)";
            lstP.add(new accesodatos.Parametro(1, ciudad.getIdciudad()));
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
