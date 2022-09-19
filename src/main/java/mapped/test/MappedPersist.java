package mapped.test;

import mapped.entity.Customer;
import mapped.entity.Supplier;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MappedPersist {


    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("InheritPersistenceUnit");
        EntityManager entityManager =factory.createEntityManager();

        Customer customer1 = new Customer(0, "customer1", 1010.11);
        Customer customer2 = new Customer(0, "customer2", 1233.22);
        Supplier supplier1 = new Supplier(0, "supplier1", 412312.123);
        Supplier supplier2 = new Supplier(0, "supplier2", 443.867);


        entityManager.getTransaction().begin();

        entityManager.persist(customer1);
        entityManager.persist(customer2);
        entityManager.persist(supplier1);
        entityManager.persist(supplier2);

        entityManager.getTransaction().commit();

        entityManager.close();
    }
}
