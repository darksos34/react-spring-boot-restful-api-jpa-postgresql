package nl.codebean.reactspringboot.user.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import nl.codebean.reactspringboot.Profile.model.Profile;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

//@Data will generate all getters and setters
@Data
@Entity
//@NoArgsConstructor

@Table(name = "user_table") // Define table name

//@SequenceGenerator(name = "userCounter", sequenceName = "user_id_seq", allocationSize = 1)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 65)
    @Column(name = "first_name")
    private String firstName;

    @Size(max = 65)
    @Column(name = "last_name")
    private String lastName;

    @NotBlank
    @Email
    @Size(max = 100)
    @Column(unique = true)
    private String email;

    @JsonIgnore
    @NotBlank
    @Size(max = 128)
    private String password;

    @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "user")

    private Profile Profile;


    public User(String firstName, String lastName, String email, String password, Profile Profile) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.Profile = Profile;

    }
}
