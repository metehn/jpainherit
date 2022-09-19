package inherit.test;

import inherit.entity.Brother;
import inherit.entity.Sister;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class InheritencePersist {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("InheritPersistenceUnit");
        EntityManager entityManager =factory.createEntityManager();

        Brother brother1 = new Brother(0, "Parent", 10.0,true);
        Brother brother2 = new Brother(0,"Parent", 10.0, false);
        Sister sister1 = new Sister(0,"Parent", 10.0, (short) 328);
        Sister sister2 = new Sister(0,"Parent", 10., (short) 123);


        entityManager.getTransaction().begin();

        entityManager.persist(brother1);
        entityManager.persist(brother2);
        entityManager.persist(sister1);
        entityManager.persist(sister2);

        entityManager.getTransaction().commit();


        entityManager.close();
    }

}
