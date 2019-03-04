package dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import entity.InfoIntraway;
import intraway.persistenceManager;

public class infoIntrawayDao {
    
	

	
	@PersistenceContext
	private EntityManager em;

	
	public void save(InfoIntraway info) {
		// TODO Auto-generated method stub
		EntityManager em = persistenceManager.INSTANCE.getEntityManager();
        em.getTransaction().begin();
        em.persist(info);
        em.getTransaction().commit();
        em.close();
     //   persistenceManager.INSTANCE.close();	           
	}
}
