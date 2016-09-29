/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

/**
 *
 * @author Luis
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "consulta")
public class Consulta implements Serializable{
    
    @Id
    @SequenceGenerator(name = "seq_consulta",sequenceName = "seq_consulta_id", 
            allocationSize = 1)
    @GeneratedValue(generator = "seq_consulta", strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @NotNull(message = "A data deve ser informado")
    @Temporal(TemporalType.DATE)
    @Column(name = "data", nullable = false)
    private Calendar data;
    
    @NotNull(message = "A hora deve ser informado")
    
    @Column(name = "hora", nullable = false, columnDefinition = "time")
    private Calendar hora;
    
    @NotNull(message = "A pre consulta deve ser informado")
    private String preconsulta;
    
    @NotNull(message = "A pos consulta deve ser informado")
    private String posconsulta;
    
    @OneToMany(mappedBy = "consulta", cascade = CascadeType.ALL, 
            orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Receituario> receituarios = new ArrayList<>();
    
    @OneToMany(mappedBy = "consulta", cascade = CascadeType.ALL, 
            orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Exame> exames = new ArrayList<>();
    
    public Consulta(){
        
    }
    
    public void adicionarReceita(Receituario obj){
        obj.setConsulta(this);
        this.receituarios.add(obj);
    }
    
    public void removerReceita(int index){
        this.receituarios.remove(index);
    }
    
    
    
    public void adicionarExame(Exame obj){
        obj.setConsulta(this);
        this.exames.add(obj);
    }
    
    public void removerExame(int index){
        this.exames.remove(index);
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
 
    
    
    public List<Receituario> getReceituarios() {
        return receituarios;
    }

    public void setReceituarios(List<Receituario> receituarios) {
        this.receituarios = receituarios;
    }

    
    public List<Exame> getExames() {
        return exames;
    }

    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }
    
    
}
