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
public class Recordatorio {
   private String idRecordatorio;
   private String codigoMateria;
   private String titulo;
   private String descripcion;
   private String tipo;
   private String fechaEntrega;
   private String fechaRegistro;
   private String estado;

    public Recordatorio() {
    }

    public Recordatorio(String idRecordatorio, String codigoMateria, String titulo, String descripcion, String tipo, String fechaEntrega, String fechaRegistro, String estado) {
        this.idRecordatorio = idRecordatorio;
        this.codigoMateria = codigoMateria;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.fechaEntrega = fechaEntrega;
        this.fechaRegistro = fechaRegistro;
        this.estado = estado;
    }

    public String getIdRecordatorio() {
        return idRecordatorio;
    }

    public void setIdRecordatorio(String idRecordatorio) {
        this.idRecordatorio = idRecordatorio;
    }

    public String getCodigoMateria() {
        return codigoMateria;
    }

    public void setCodigoMateria(String codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Recordatorio{" + "idRecordatorio=" + idRecordatorio + ", codigoMateria=" + codigoMateria + ", titulo=" + titulo + ", descripcion=" + descripcion + ", tipo=" + tipo + ", fechaEntrega=" + fechaEntrega + ", fechaRegistro=" + fechaRegistro + ", estado=" + estado + '}';
    }
   
}
