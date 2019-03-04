package intraway;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public enum persistenceManager {
  INSTANCE;

  private EntityManagerFactory emFactory;

  private persistenceManager() {
    
    emFactory = Persistence.createEntityManagerFactory("jpa-infraway");
  }

  public EntityManager getEntityManager() {
    return emFactory.createEntityManager();
  }

  public void close() {
    emFactory.close();
  }
}