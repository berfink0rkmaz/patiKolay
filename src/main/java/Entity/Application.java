package Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer applicationId;

    @Column
    private boolean status;
    private Integer userId;
    private boolean isApproved;
    private int price;

    @ManyToOne
    @JoinColumn(name = "job_id", nullable = false)
    private Job job;

    @ManyToOne
    @JoinColumn(name = "applicant_id", nullable = false)
    private User applicant; // hizmet alan

    @ManyToOne
    @JoinColumn(name = "provider_id", nullable = false)
    private User jobProvider; // Hizmet veren

}
