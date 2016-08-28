/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.modelo;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author Luis
 */
public class Consulta implements Serializable{
    
    private Integer id;
    private Calendar data;
    private Calendar hora;
    private String preconsulta;
    private String posconsulta;
    
    public Consulta(){
        
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the data
     */
    public Calendar getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Calendar data) {
        this.data = data;
    }

    /**
     * @return the hora
     */
    public Calendar getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(Calendar hora) {
        this.hora = hora;
    }

    /**
     * @return the preconsulta
     */
    public String getPreconsulta() {
        return preconsulta;
    }

    /**
     * @param preconsulta the preconsulta to set
     */
    public void setPreconsulta(String preconsulta) {
        this.preconsulta = preconsulta;
    }

    /**
     * @return the posconsulta
     */
    public String getPosconsulta() {
        return posconsulta;
    }

    /**
     * @param posconsulta the posconsulta to set
     */
    public void setPosconsulta(String posconsulta) {
        this.posconsulta = posconsulta;
    }
    
    
}
