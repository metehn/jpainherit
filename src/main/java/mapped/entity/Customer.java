package mapped.entity;

import jakarta.persistence.Entity;
import lombok.*;


@Data
@NoArgsConstructor
@Entity
public class Customer extends Parent{


    private double totalDebit;

    public Customer(long parentId, String parentName, double totalDebit) {
        super(parentId, parentName);
        this.totalDebit = totalDebit;
    }
}
