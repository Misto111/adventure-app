package bg.technologies.adventure.models;
import bg.technologies.adventure.models.enums.UserRolesEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserRolesEnum name;

    public Role() {
    }

    public Long getId() {
        return id;
    }

    public Role setId(Long id) {
        this.id = id;
        return this;
    }

    public UserRolesEnum getName() {
        return name;
    }

    public Role setName(UserRolesEnum name) {
        this.name = name;
        return this;
    }
}
