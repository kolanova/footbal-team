package football.team.repository;
import football.team.model.Shoe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShoeRepository extends JpaRepository<Shoe, Long> {
    Optional<Shoe> findShoeByName(String Name);
}
