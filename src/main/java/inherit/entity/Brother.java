package inherit.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@DiscriminatorValue("BROTHER") // Sütuna "SISTER" yazacak, veritabanını kontrol et anlayacaksın
public class Brother extends Parent{


    private  boolean brotherCheck;

    public Brother(long entityId, String entityName, double entityValue, boolean brotherCheck) {
        super(entityId, entityName, entityValue);
        this.brotherCheck = brotherCheck;
    }
}
