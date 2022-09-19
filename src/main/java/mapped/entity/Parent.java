package mapped.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass//Databasede ayrı bir tablo tutmamak için @Entity yazmadık
public class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long parentId;
    private String parentName;

}
