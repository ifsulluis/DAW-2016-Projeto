
package br.edu.ifsul.testes;

import br.edu.ifsul.modelo.Paciente;
import java.util.Calendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Luis
 */
public class TestePersistirPaciente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DAW-2016-ProjetoPU");
        EntityManager em = emf.createEntityManager();
        Paciente p = new Paciente();
        //p.setId(1);
        p.setNome("Luis");
        p.setSexo("M");
        p.setAltura(1.80);
        p.setPeso(71.12);
        p.setTelefone("9918-2121");
        p.setHistorico("Nenhum historico");
        p.setNascimento(Calendar.getInstance());
        
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        em.close();
        emf.close();
        
    }
    
}
