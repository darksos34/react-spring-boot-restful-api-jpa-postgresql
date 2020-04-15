package nl.codebean.reactspringboot.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "topic_table") // Define table name
@SequenceGenerator(name = "topicCounter", sequenceName = "topic_id_seq", allocationSize = 1)
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "topicCounter")
    private Long id;

    @Column(name = "topic_name", unique = true, nullable = false)
    private String name;

    @Column(name = "topic_description", nullable = false)
    private String description;

    // No args constructor
    public Topic() {

    }

    // Args constructor
    public Topic(Long id, String name, String description, Long topicId) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;

    }

    public Topic(Long topicId, String name, String id) {
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

}
