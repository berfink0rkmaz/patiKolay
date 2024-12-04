package Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer petID;

    @Column
    private String name;
    private String petImage;
    private String type;
    private int age;
    private String gender;
    private String species;
    private String notes;
    private String education;

    @Column(unique = true)
    private Integer userID;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner;


}
