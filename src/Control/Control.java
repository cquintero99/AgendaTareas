/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.CRUD_Materia;
import DAO.CRUD_Recordatorio;
import DAO.Lista;
import Servicios.Conexion;
import VO.Materia;
import VO.Recordatorio;

/**
 *
 * @author 57310
 */
public class Control {
    public void rMateria(Materia m){
        try{
            
            CRUD_Materia rm=new CRUD_Materia();
            rm.registrarMateria(Conexion.obtener(), m);
            System.out.println("_______________________-................");
        }catch(Exception e){
            
        }
    }
    public Lista listaMaterias(){
        try{
            CRUD_Materia lm=new CRUD_Materia();
            return lm.listaMaterias(Conexion.obtener());
        }catch(Exception e){
            
        }
        return null;
    }
     public Materia buscarMateria(String codigo){
        try{
           CRUD_Materia m=new CRUD_Materia();
           return m.buscarMateria(Conexion.obtener(), codigo);
        }catch(Exception e){
            
        }
        return  null;
    }
     public int numeroMateria(){
         try{
             CRUD_Materia m=new CRUD_Materia();
           return   m.numeroMaterias(Conexion.obtener());
         }catch(Exception e){
             
         }
         return 0;
     }
     public String[][] nombreYcodigo2(int n){
         try{
             CRUD_Materia m=new CRUD_Materia();
            return  m.nombres(Conexion.obtener(), n);
         }catch(Exception e){
             
         }
         return null;
     }
    /*
    *************************************************************************************************+
    */
    public void registrarRecordatorio(Recordatorio r){
        try{
            CRUD_Recordatorio rr=new CRUD_Recordatorio();
            rr.registraNota(Conexion.obtener(), r);
        }catch(Exception e){
            
        }
    }
    public Recordatorio buscarRecordatorio(String id){
        try{
            CRUD_Recordatorio r=new CRUD_Recordatorio();
            return r.buscarNota(Conexion.obtener(), id);
        }catch(Exception e){
            
        }
        return null;
    }
    public String buscarId(String codigo,String titulo){
        try{
            CRUD_Recordatorio r=new CRUD_Recordatorio();
            return r.buscarId(Conexion.obtener(), titulo, codigo);
        }catch(Exception e){
            
        }
        return null;
    }
    public void actualizarEstado(String id ,String estado){
        try{
            CRUD_Recordatorio r=new CRUD_Recordatorio();
            r.actualizarEstado(Conexion.obtener(), id, estado);
        }catch(Exception e){
            
        }
    }
    public void eliminarNota(String codigo){
        try{
            CRUD_Recordatorio r=new CRUD_Recordatorio();
            r.eliminarNota(Conexion.obtener(), codigo);
        }catch(Exception e){
            
        }
    }
    public int numeroNotas(String codigo){
        try{
            CRUD_Recordatorio r=new CRUD_Recordatorio();
            return r.numeroNotas(Conexion.obtener(), codigo);
        }catch(Exception e){
            
        }
        return 0;
    }
    public Lista listaNotas(String codigo){
        try{
            CRUD_Recordatorio r=new CRUD_Recordatorio();
            return r.listaRecordatorios(Conexion.obtener(), codigo);
        }catch(Exception e){
            
        }
        return null;
    }
    public String [][] buscarListaRecordatorio(String codigo ,int n){
        try{
            CRUD_Recordatorio r=new CRUD_Recordatorio();
            return r.buscarListaRecordatorios(Conexion.obtener(), codigo, n);
        }catch(Exception e){
            
        }
        return null;
    }
}
