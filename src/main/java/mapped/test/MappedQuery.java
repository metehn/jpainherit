package mapped.test;

import mapped.entity.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class MappedQuery {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("InheritPersistenceUnit");
        EntityManager entityManager =factory.createEntityManager();

        double totalDebit = 1200;

        String jpql = "select customer from Customer as customer "
                + " where customer.totalDebit > :totalDebit";

        TypedQuery<Customer> query = entityManager.createQuery(jpql, Customer.class);
        query.setParameter("totalDebit", totalDebit);
        List<Customer> customerList = query.getResultList();

        entityManager.close();

        for(Customer customer : customerList){

            System.out.println(customer.getParentId()
                    + " " + customer.getParentName()
                    + " " + customer.getTotalDebit());
        }

    }

}
