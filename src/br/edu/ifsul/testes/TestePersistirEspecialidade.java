
package br.edu.ifsul.testes;

import br.edu.ifsul.modelo.Especialidade;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestePersistirEspecialidade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DAW-2016-ProjetoPU");
        EntityManager em = emf.createEntityManager();
        Especialidade m = new Especialidade();        
        m.setDescricao("Pediatra");
        em.getTransaction().begin();
        em.persist(m);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

}
