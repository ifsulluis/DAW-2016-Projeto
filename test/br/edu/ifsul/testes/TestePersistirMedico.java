package br.edu.ifsul.testes;

import br.edu.ifsul.jpa.EntityManagerUtil;
import br.edu.ifsul.modelo.Consulta;
import br.edu.ifsul.modelo.Exame;
import br.edu.ifsul.modelo.Medico;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.persistence.EntityManager;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jorge
 */
public class TestePersistirMedico {
    
    EntityManager em;
    
    public TestePersistirMedico() {
    }
    
    @Before
    public void setUp() {
        em = EntityManagerUtil.getEntityManager();
    }
    
    @After
    public void tearDown() {
        em.close();
    }
    
    @Test
    public void teste(){
        Boolean exception = false;
        try {
            
            Medico t = new Medico();
            t.setNome("Luis");
            t.setCrm("11111111111");
            t.setAltura(1.80);
            t.setPeso(76.70);
            t.setTelefone("99121111");
            t.setSexo("M");
            
            em.getTransaction().begin();
            em.persist(t);
            em.getTransaction().commit();
        } catch(Exception e){
            exception = true;
            e.printStackTrace();
        }
        Assert.assertEquals(false, exception);
    }
    
}
