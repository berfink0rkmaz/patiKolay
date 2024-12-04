package Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer jobId;

    private String jobName; //walker, CARETAKER, vet, petshop
    private String petType; //cat , dog
    private String district;
    private String phone;
    private String time; //how many hours etc.

    @ManyToOne
    @JoinColumn(name = "provider_id", nullable = false)
    private User provider; // Hizmeti sunan

    @OneToMany(mappedBy = "job", cascade = CascadeType.ALL)
    private List<Application> applications; // yapılan başvurular


}
