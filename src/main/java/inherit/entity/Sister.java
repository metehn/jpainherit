package inherit.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@Entity
@DiscriminatorValue("SISTER") // Stüna "SISTER" yazacak, veritabanını kontrol et anlayacaksın
public class Sister extends  Parent{


    private short sisterCode;

    public Sister(long entityId, String entityName, double entityValue, short sisterCode) {
        super(entityId, entityName, entityValue);
        this.sisterCode = sisterCode;
    }
}
