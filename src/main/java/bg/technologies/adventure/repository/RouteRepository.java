package bg.technologies.adventure.repository;

import bg.technologies.adventure.models.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {

    Route findByName(String name);
}
