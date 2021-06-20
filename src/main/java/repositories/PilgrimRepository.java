
package repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import domain.Pilgrim;

@Repository
public interface PilgrimRepository extends JpaRepository<Pilgrim, Integer> {

	@Query("select p from Pilgrim p where p.nationality > ?1")
	Collection<Pilgrim> findAllActive(String Natiolanity);

}
