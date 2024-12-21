package Web.com.WebList.db;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

@Table(name= "register")
public class Register {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name= "id")
    public Long id;

    @Column(name = "username")
    public String username;

    @Column(name= "email")
    public String email;

    @Column(name = "password")
    public String password;




}
