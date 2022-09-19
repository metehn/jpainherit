package mapped.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Supplier extends Parent{


    private double totalCredit;

    public Supplier(long parentId, String parentName, double totalCredit) {
        super(parentId, parentName);
        this.totalCredit = totalCredit;
    }
}
