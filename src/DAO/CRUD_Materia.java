/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import VO.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 57310
 */
public class CRUD_Materia {
    public static void registrarMateria(Connection c,Materia m) throws SQLException{
        try{
            PreparedStatement consulta;
            consulta=c.prepareStatement("Insert into materia(codigo,nombre,grupo,profesor,email,asesoria) Values(?,?,?,?,?,?) ");
            consulta.setString(1, m.getCodigo());
            consulta.setString(2, m.getNombre());
            consulta.setString(3, m.getGrupo());
            consulta.setString(4, m.getProfesor());
            consulta.setString(5,m.getEmail());
            consulta.setString(6, m.getAsesoria());
            consulta.executeUpdate();
            System.out.println("Registra M");
        }catch(SQLException e){
            System.out.println("Error RM");
            throw new SQLException(e);
        }
    }
    public static Materia buscarMateria(Connection c,String codigo) throws SQLException{
        try{
            Materia m=new Materia();
            PreparedStatement consulta;
            consulta=c.prepareStatement("Select codigo ,nombre,grupo,profesor,email,asesoria from materia where codigo='"+codigo+"'");
            ResultSet rs=consulta.executeQuery();
            if(rs.next()){
                m.setCodigo(rs.getString("codigo"));
                m.setNombre(rs.getString("nombre"));
                m.setGrupo(rs.getString("grupo"));
                m.setProfesor(rs.getString("profesor"));
                m.setEmail(rs.getString("email"));
                m.setAsesoria(rs.getString("asesoria"));
            }
            return m;
        }catch(SQLException e){
            throw new SQLException(e);
        }
        
    }
   
  
    public static String[][] nombres(Connection c,int n) throws SQLException{
        String [][] nombres=new String[n][2];
        try{
            
            PreparedStatement consulta;
            consulta=c.prepareStatement("Select codigo ,nombre,grupo,profesor,email,asesoria from materia order by codigo");
            ResultSet rs=consulta.executeQuery();
            
            int cont=0;
            while(rs.next() ){
               
                nombres[cont][0]=rs.getString("codigo");
                nombres[cont][1]=rs.getString("nombre");
                cont++;
                
                
            }
            
            
        }catch(SQLException e){
            throw new SQLException(e);
        }
        return nombres;
    }

    public static Lista listaMaterias(Connection c) throws SQLException{
        try{
            Lista<Materia> lista=new Lista<>();
            PreparedStatement consulta;
            consulta=c.prepareStatement("Select codigo ,nombre,grupo,profesor,email,asesoria from materia");
            ResultSet rs=consulta.executeQuery();
            while(rs.next()){
                Materia m=new Materia();
                m.setCodigo(rs.getString("codigo"));
                m.setNombre(rs.getString("nombre"));
                m.setGrupo(rs.getString("grupo"));
                m.setProfesor(rs.getString("profesor"));
                m.setEmail(rs.getString("email"));
                m.setAsesoria(rs.getString("asesoria"));
                lista.add(m);
            }
            return lista;
        }catch(SQLException e){
            throw new SQLException(e);
        }
    }
    public int numeroMaterias(Connection c) throws SQLException{
        try{
            PreparedStatement consulta;
            consulta=c.prepareStatement("Select count(codigo)as n from materia ");
            ResultSet rs=consulta.executeQuery();
            int n=0;
            if(rs.next()){
                n=rs.getInt("n");
            }
            return n;
        }catch(SQLException e){
            throw new SQLException(e);
        }
    }
}
