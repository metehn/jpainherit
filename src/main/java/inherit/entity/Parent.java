package inherit.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn( name = "SIBLING_TYPE") // bunuyazsak veritabanına DTYPE sütun adıyle ekliyor
public abstract class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // GenerationType.IDENTITY olursa @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS ) yüzünden hata veriyor.
    private long entityId;
    private String entityName;
    private double entityValue;
}
