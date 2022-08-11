package peaksoft.db.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import peaksoft.enums.TypeOfHouse;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String description;
    private String price;
    private String address;
    private int personCount;

    @OneToMany()
    private List<Comment> comment;
    private TypeOfHouse typeOfHouse;

    public House(String description,
                 String price,
                 String address,
                 int personCount,
                 TypeOfHouse typeOfHouse) {
        this.description = description;
        this.price = price;
        this.address = address;
        this.personCount = personCount;
        this.typeOfHouse = typeOfHouse;
    }
}
