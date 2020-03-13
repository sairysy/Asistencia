/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import Entidades.Empresa;
import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author sairy
 */
public class FEmpresa {
   public static boolean Insertar(Empresa empresa) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from public.insertar_empresa(?,?,?,?,?,?,?,?,?)";
            
            
            lstP.add(new Parametro(1, empresa.getIdempresa()));
            lstP.add(new Parametro(2, empresa.getIdciudad()));
            lstP.add(new Parametro(3, empresa.getNombreempresa()));
            lstP.add(new Parametro(4, empresa.getDireccion1()));
            lstP.add(new Parametro(5, empresa.getDireccion2()));
            lstP.add(new Parametro(6, empresa.getEstado()));
            lstP.add(new Parametro(7, empresa.getSitioweb()));
            lstP.add(new Parametro(8, empresa.getEmail()));
            lstP.add(new Parametro(9, empresa.getTelefono()));
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

    public static ArrayList<Empresa> llenarEmpresas(ConjuntoResultado rs) throws Exception {
        ArrayList<Empresa> lst = new ArrayList<Empresa>();
        Empresa empresa = null;
        try {
            while (rs.next()) {
                empresa = new Empresa(rs.getInt("pidempresa"), rs.getInt("pidciudad"), rs.getString("pnombreempresa"), rs.getString("pdireccion1"), rs.getString("pdireccion2"), rs.getString("pestado"),rs.getString("psitioweb"),rs.getString("pemail"),rs.getString("telefono"));
                lst.add(empresa);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<Empresa> ObtenerEmpresas() throws Exception {
        ArrayList<Empresa> lst = new ArrayList<Empresa>();
        try {
            String sql = "select * from public.empresa_buscartodos()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarEmpresas(rs);
            rs = null;

        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static Empresa ObtenerEmpresaDadoCodigo(int codigo) throws Exception {
        Empresa lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from public.empresa_buscarporid(?)";
            lstP.add(new Parametro(1, codigo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new Empresa();
            lst = llenarEmpresas(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static boolean actualizar(Empresa empresa) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from public.empresa_editar(?,?,?,?,?,?,?,?,?)";
          
            lstP.add(new Parametro(1, empresa.getIdempresa()));
            lstP.add(new Parametro(2, empresa.getIdciudad()));
            lstP.add(new Parametro(3, empresa.getNombreempresa()));
            lstP.add(new Parametro(4, empresa.getDireccion1()));
            lstP.add(new Parametro(5, empresa.getDireccion2()));
            lstP.add(new Parametro(6, empresa.getEstado()));
            lstP.add(new Parametro(7, empresa.getSitioweb()));
            lstP.add(new Parametro(8, empresa.getEmail()));
            lstP.add(new Parametro(9, empresa.getTelefono()));
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

    public static boolean eliminar(Empresa empresa) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from public.empresa_eliminar(?)";
            lstP.add(new Parametro(1, empresa.getIdempresa()));
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

