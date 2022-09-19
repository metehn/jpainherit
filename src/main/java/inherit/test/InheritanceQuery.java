package inherit.test;

import inherit.entity.Brother;
import inherit.entity.Parent;
import inherit.entity.Sister;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class InheritanceQuery {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("InheritPersistenceUnit");
        EntityManager entityManager =factory.createEntityManager();


        String jpql = "select brother from Brother as brother ";

        TypedQuery<Brother> query = entityManager.createQuery(jpql, Brother.class);
        List<Brother> brotherList = query.getResultList();

        String jpql2 = "select parent from Parent as parent ";

        TypedQuery<Parent> query2 = entityManager.createQuery(jpql2, Parent.class);
        List<Parent> parentList2 = query2.getResultList();

        entityManager.close();

        for(Brother brother : brotherList){

            System.out.println(brother.getEntityId()
                    + " " + brother.getEntityValue()
                    + " " + brother.getEntityName()
                    + " " + brother.isBrotherCheck());
        }
        System.out.println("-----------------------");
        for(Parent parent : parentList2){

            System.out.println(parent.getEntityId()
                    + " " + parent.getEntityValue()
                    + " " + parent.getEntityName());
            /*
            if(parent instanceof Brother){
                System.out.println(" BROTHER");
            }
            else if(parent instanceof Sister){
                System.out.println(" SISTER");
            }else {
                System.out.println();
            }
            */
        }


    }
}
