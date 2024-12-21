package Web.com.WebList.db;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

@Table(name = "appointments") //Записи
public class Appointments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "service_id")
    private Long service_id;

    @Column(name = "client_name")
    private String client_name;

    @Column(name = "appointments_time")
    private LocalDateTime appointments_time;

    @Column(name = "status")
    private String status; // подтверждение либо отмена услуги
}
