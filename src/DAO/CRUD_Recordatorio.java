/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Servicios.Conexion;
import VO.Recordatorio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 57310
 */
public class CRUD_Recordatorio {
    public static void registraNota(Connection c,Recordatorio r) throws SQLException{
        try{
            PreparedStatement consulta;
            consulta=c.prepareStatement("Insert into recordatorio(id,codigomateria,titulo,descripcion,fechaentrega,fechagenero,tipo,estado) Values(?,?,?,?,?,?,?,?)");
            
            consulta.setString(1, r.getIdRecordatorio());
            consulta.setString(2, r.getCodigoMateria());
            consulta.setString(3, r.getTitulo());
            consulta.setString(4, r.getDescripcion());
            consulta.setString(5, r.getFechaEntrega());
            consulta.setString(6, r.getFechaRegistro());
            consulta.setString(7, r.getTipo());
            consulta.setString(8, r.getEstado());
            consulta.executeUpdate();
            JOptionPane.showInputDialog(null, "Registrado");
            
        }catch(SQLException e){
              JOptionPane.showInputDialog(null, "NOOO Registrado");
            throw new SQLException(e);
        }
    }
    public static String buscarId(Connection c,String titulo,String codigo) throws SQLException{
        try{
            PreparedStatement consulta;
            consulta=c.prepareStatement("select id from recordatorio where titulo='"+titulo+"' && codigomateria='"+codigo+"'");
            String n="";
            ResultSet rs=consulta.executeQuery();
            if(rs.next()){
                n=rs.getString("id");
            }
            return n;
        }catch(SQLException e){
            throw new SQLException(e);
        }
    }
    public static void actualizarEstado(Connection c,String id,String estado) throws SQLException{
        try{
            PreparedStatement consulta;
            consulta=c.prepareStatement("Update recordatorio set estado='"+estado+"' where id='"+id+"'");
            consulta.executeUpdate();
            System.out.println("ACTUALIZA");
        }catch(SQLException e){
            System.out.println("No Accc");
            throw new SQLException(e);
        }
    }
    public static void eliminarNota(Connection c,String id) throws SQLException{
        try{
            PreparedStatement consulta;
            consulta=c.prepareStatement("Delete from recordatorio where id='"+id+"'");
            consulta.executeUpdate();
        }catch(SQLException e){
            throw new SQLException(e);
        }
    }
    public static Recordatorio buscarNota(Connection c,String id) throws SQLException{
        try{
             Recordatorio r=new Recordatorio();
            PreparedStatement consulta;
            consulta=c.prepareStatement("Select id ,codigomateria,titulo,descripcion,fechaentrega,fechagenero,tipo,estado from recordatorio where id='"+id+"'");
            ResultSet rs=consulta.executeQuery();
            if(rs.next()){
               
                r.setIdRecordatorio(rs.getString("id"));
                r.setCodigoMateria(rs.getString("codigomateria"));
                r.setTitulo(rs.getString("titulo"));
                r.setDescripcion(rs.getString("descripcion"));
                r.setFechaEntrega("fechaentrega");
                r.setFechaRegistro(rs.getString("fechagenero"));
                r.setTipo(rs.getString("tipo"));
                r.setEstado(rs.getString("estado"));
            }
            return r;
        }catch(SQLException e){
            throw new SQLException(e);
        }
    }
    public static int numeroNotas(Connection c,String codigo) throws SQLException{
        try{
            int n=0;
            PreparedStatement consulta;
            consulta=c.prepareStatement("Select count(codigomateria) as numeroNotas from recordatorio where codigomateria='"+codigo+"'");
            ResultSet rs=consulta.executeQuery();
            if(rs.next()){
                n=rs.getInt("numeroNotas");
            }
            return n;
        }catch(SQLException e){
            throw new SQLException(e);
        }
    }
    public static String [][] buscarListaRecordatorios(Connection c,String codigo,int numeroR) throws SQLException{
        try{
            String [][] lista=new String[numeroR][5];
            PreparedStatement consulta;
            consulta=c.prepareStatement("Select id ,codigomateria,titulo,descripcion,fechaentrega,fechagenero,tipo,estado from recordatorio where codigomateria='"+codigo+"' ORDER BY estado");
            ResultSet rs=consulta.executeQuery();
            int cont=0;
            while(rs.next()){
                
                lista[cont][0]=rs.getString("titulo");
                lista[cont][1]=rs.getString("descripcion");
                lista[cont][2]=rs.getString("fechaentrega");
                lista[cont][3]=rs.getString("tipo");
                lista[cont][4]=rs.getString("estado");
                cont++;
            }
            return lista;
        }catch(SQLException e){
            throw new SQLException(e);
        }
        
    }
   
    public static Lista listaRecordatorios(Connection c,String codigo) throws SQLException{
        try{
            Lista<Recordatorio> lista=new Lista<>();
            PreparedStatement consulta;
            consulta=c.prepareStatement("Select id ,codigomateria,titulo,descripcion,fechaentrega,fechagenero,tipo,estado from recordatorio where codigomateria='"+codigo+"'");
            ResultSet rs=consulta.executeQuery();
            while(rs.next()){
                Recordatorio r=new Recordatorio();
                r.setIdRecordatorio(rs.getString("id"));
                r.setCodigoMateria(rs.getString("codigomateria"));
                r.setTitulo(rs.getString("titulo"));
                r.setDescripcion(rs.getString("descripcion"));
                r.setFechaEntrega("fechaentrega");
                r.setFechaRegistro(rs.getString("fechagenero"));
                r.setTipo(rs.getString("tipo"));
                r.setEstado(rs.getString("estado"));
                lista.add(r);
            }
            return lista;
            
        }catch(SQLException e){
            throw new SQLException(e);
        }
    }
}
