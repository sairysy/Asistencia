/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import Entidades.Usuario;
import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author sairy
 */
public class FUsuario {
   public static boolean Insertar(Usuario usuario) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select *from public.usuario_insertar(?,?,?)";
            lstP.add(new Parametro(1, usuario.getIdusuario()));
            lstP.add(new Parametro(2, usuario.getNombreusuario()));
            lstP.add(new Parametro(3, usuario.getClaveusuario()));
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

    public static ArrayList<Usuario> llenarUsuarios(ConjuntoResultado rs) throws Exception {
        ArrayList<Usuario> lst = new ArrayList<Usuario>();
        Usuario usuario = null;
        try {
            while (rs.next()) {
                usuario = new Usuario(rs.getInt("pidusuario"), rs.getString("pnombreusuario"), rs.getString("pclaveusuario"));
                lst.add(usuario);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<Usuario> ObtenerUsuarios() throws Exception {
        ArrayList<Usuario> lst = new ArrayList<Usuario>();
        try {
            String sql = "select * from public.usuario_buscartodos()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarUsuarios(rs);
            rs = null;

        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static Usuario ObtenerUsuarioDadoCodigo(int codigo) throws Exception {
        Usuario lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from public.usuario_buscarporid(?)";
            lstP.add(new Parametro(1, codigo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new Usuario();
            lst = llenarUsuarios(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static boolean actualizar(Usuario usuario) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from public.usuario_editar(?,?,?)";
            lstP.add(new Parametro(1, usuario .getIdusuario()));
            lstP.add(new Parametro(2, usuario .getNombreusuario()));
            lstP.add(new Parametro(3, usuario .getClaveusuario()));
            
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

    public static boolean eliminar(Usuario usuario) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select *from public.usuario_eliminar(?)";
            lstP.add(new Parametro(1, usuario.getIdusuario()));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = true;
            }
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return eje;
    }}