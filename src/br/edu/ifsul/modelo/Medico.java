/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author Luis
 */
@Entity
@Table(name = "medico")
public class Medico extends Paciente implements Serializable{
    
    
    @Length(max = 11, min = 11, message = "O CRM deve possuir {max} caracteres.")
    @NotBlank(message = "Informe o CRM.")
    @Column(name = "crm", length = 11, nullable = false)
    private String crm;
    
//    @NotBlank(message = "O nome deve ser informado")
//    @Length(max = 50, message = "O nome não deve ter mais que {max} caracteres")
//    @Column(name = "nome", length = 50, nullable = false)
//    private String nome;
    
    @ManyToOne
    @JoinColumn(name = "especialidade", referencedColumnName = "id", nullable = false)
    private Especialidade especialidade;
    
    
    
    public Medico(){
        
    }

    /**
     * @return the crm
     */
    public String getCrm() {
        return crm;
    }

    /**
     * @param crm the crm to set
     */
    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    /**
     * @return the nome
     */
//    public String getNome() {
//        return nome;
//    }
//
//    /**
//     * @param nome the nome to set
//     */
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
    
     public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }
    
    
    
//     @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 79 * hash + Objects.hashCode(this.crm);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Medico other = (Medico) obj;
//        if (!Objects.equals(this.crm, other.crm)) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return crm;
//    }

    
    
    
}
