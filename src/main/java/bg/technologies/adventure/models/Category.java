package bg.technologies.adventure.models;

import bg.technologies.adventure.models.enums.CategoryNamesEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "name", nullable = false)
    private CategoryNamesEnum name;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;



    public Category() {

    }

    public Long getId() {
        return id;
    }

    public Category setId(Long id) {
        this.id = id;
        return this;
    }

    public CategoryNamesEnum getName() {
        return name;
    }

    public Category setName(CategoryNamesEnum name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Category setDescription(String description) {
        this.description = description;
        return this;
    }
}