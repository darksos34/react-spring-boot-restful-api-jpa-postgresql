package nl.codebean.reactspringboot.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@Table(name = "topic_table") // Define table name
@SequenceGenerator(name = "topicCounter", sequenceName = "topic_id_seq", allocationSize = 1)
public class Topic {
    @Id
    private String id;
    private String name;
    private String description;

    /*
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "topicCounter")
    private Long id;

    @Column(name = "topic_name", unique = true, nullable = false)
    private String name;

    @Column(name = "topic_description", nullable = false)
    private String description;

    */
    /* No args constructor
    public Topic(){

    }*/

    // Args constructor
    public Topic(String id, String name, String description){
        super();
        this.id = id;
        this.name = name;
        this.description = description;


    }
        /*
    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

*/

}
