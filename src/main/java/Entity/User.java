package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer userID;

    @Column
    private boolean status;
    private String name;
    private String surname;
    private String email;
    private String city;
    private String district;
    private String address;
    private String userImage;
    private Date startDate;

    private int providedJob=0;
    private int receivedJob=0;


    private boolean isWalker=false;
    private boolean isCaretaker=false;
    private boolean isVet=false;
    private boolean isPetshop=false;

    private int totalPoint=0;
    private int pointCount=0;

    @Column(unique=true)
    private String tckn;

    @Column(unique=true)
    private String phone;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<Pet> pets;

    @OneToMany(mappedBy = "provider", cascade = CascadeType.ALL)
    private List<Job> jobsProvided; // Kullanıcının sunduğu hizmetler

    @OneToMany(mappedBy = "applicant", cascade = CascadeType.ALL)
    private List<Application> applications; // Kullanıcının yaptığı başvurular

    @OneToMany(mappedBy = "jobProvider", cascade = CascadeType.ALL)
    private List<Application> jobsOffered; // Kullanıcının sunduğu hizmetlere yapılan başvurular

}
