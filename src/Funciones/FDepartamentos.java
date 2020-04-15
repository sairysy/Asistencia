/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import Entidades.Departamentos;
import Entidades.Empresa;
import Entidades.Turnos;
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
public class FDepartamentos implements Serializable{
    
     public static boolean Insertar(Departamentos departamentos) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from public.departamento_insertar(?,?,?,?)";
            
            
           // lstP.add(new Parametro(1, departamentos.getCodigo()));
            lstP.add(new Parametro(1, departamentos.getIddepartamento()));
            lstP.add(new Parametro(2, departamentos.getEmpresa().getIdciudad()));
            lstP.add(new Parametro(3, departamentos.getTurnos().getIdturno()));
            lstP.add(new Parametro(4, departamentos.getNombredepartamento()));
            
            
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

    public static ArrayList<Departamentos> llenarDepartamentos(ConjuntoResultado rs) throws Exception {
       
        
        ArrayList<Departamentos> lst = new ArrayList<Departamentos>();
        Departamentos departamentos = null;
        try {
            while (rs.next()) {
               // departamentos = new Departamentos(rs.getInt("piddepartamento"),rs.getInt("pidempresa"), rs.getInt("pidturno"), rs.getString("pnombredepartamento"));             
             
                
                lst.add(departamentos);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<Departamentos> ObtenerDepartamentos() throws Exception {
        ArrayList<Departamentos> lst = new ArrayList<Departamentos>();
        
        
        try {
            String sql = "select * from actividades.fc_obtener_departamentos()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarDepartamentos(rs);
            rs = null;

        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static Departamentos ObtenerDepartamentosDadoCodigo(int codigo) throws Exception {
        Departamentos lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from public.departamento_obtenerporid(?)";
            lstP.add(new Parametro(1, codigo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new Departamentos();
            lst = llenarDepartamentos(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static boolean actualizar(Departamentos departamentos) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from public.departamento_acualizar(?,?,?,?)";
           
            lstP.add(new Parametro(1, departamentos.getIddepartamento()));
            lstP.add(new Parametro(2, departamentos.getEmpresa().getIdciudad()));
            lstP.add(new Parametro(3, departamentos.getTurnos().getIdturno()));
            lstP.add(new Parametro(4, departamentos.getNombredepartamento()));
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

    public static boolean eliminar(Departamentos departamentos) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from public.departamento_eliminar(?)";
            lstP.add(new Parametro(1, departamentos.getIddepartamento()));
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
