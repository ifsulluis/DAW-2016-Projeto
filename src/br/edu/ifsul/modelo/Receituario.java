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
public class Receituario implements Serializable{
    
    private Integer id;
    private String posologia;
    private Calendar validade;
    
    public Receituario(){
        
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
     * @return the posologia
     */
    public String getPosologia() {
        return posologia;
    }

    /**
     * @param posologia the posologia to set
     */
    public void setPosologia(String posologia) {
        this.posologia = posologia;
    }

    /**
     * @return the validade
     */
    public Calendar getValidade() {
        return validade;
    }

    /**
     * @param validade the validade to set
     */
    public void setValidade(Calendar validade) {
        this.validade = validade;
    }
    
    
}
