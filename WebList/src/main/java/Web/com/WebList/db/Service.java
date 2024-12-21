package Web.com.WebList.db;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.boot.archive.scan.internal.ScanResultImpl;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "services") //услуги
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "duration")
    private String duration;

}
