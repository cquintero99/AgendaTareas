/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

/**
 *
 * @author 57310
 */
public class Materia {
    private String nombre;
    private String codigo;
    private String grupo;
    private String profesor;
    private String email;
    private String asesoria;

    public Materia() {
    }

    public Materia(String nombre, String codigo, String grupo, String profesor, String email, String asesoria) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.grupo = grupo;
        this.profesor = profesor;
        this.email = email;
        this.asesoria = asesoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAsesoria() {
        return asesoria;
    }

    public void setAsesoria(String asesoria) {
        this.asesoria = asesoria;
    }

    @Override
    public String toString() {
        return "Materia{" + "nombre=" + nombre + ", codigo=" + codigo + ", grupo=" + grupo + ", profesor=" + profesor + ", email=" + email + ", asesoria=" + asesoria + '}';
    }
    
    
    
}
