package nl.codebean.reactspringboot.Profile.model;


import lombok.Data;

import nl.codebean.reactspringboot.user.model.User;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

//@Data will generate all getters and setters
@Data
@Entity
//@NoArgsConstructor
@RequestMapping("user")
@Table(name = "profile") // Define table name
@SequenceGenerator(name = "profileCounter", sequenceName = "profile_id_seq", allocationSize = 1)
public class Profile implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "profileCounter")
    private Long id;

    @Column(name = "phone_number")
    @Size(max = 15)
    private String phoneNumber;

    //@Enumerated(EnumType.STRING)
    //@Column(length = 10)
    //private Gender gender;

    @Temporal(TemporalType.DATE)
    @Column(name = "dob")
    private Date dateOfBirth;

    @Size(max = 100)
    private String address1;

    @Size(max = 100)
    private String address2;

    @Size(max = 100)
    private String street;

    @Size(max = 100)
    private String city;

    @Size(max = 100)
    private String state;

    @Size(max = 100)
    private String country;

    @Column(name ="zip_code")
    @Size(max = 32)
    private String zipCode;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id",nullable = false)
    private User user;
    // No args constructor
    public Profile(){

    }




    /*Gender gender,*/
    // Args constructor
    public Profile(String phoneNumber, Date dateOfBirth,
                   String address1, String address2, String street,
                   String city, String state, String country, String zipCode) {
        this.phoneNumber = phoneNumber;
        //this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address1 = address1;
        this.address2 = address2;
        this.street = street;
        this.state = state;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
}
