
package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import domain.Actor;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Integer> {

	//	@Query("select * from `acme-pilgrim`.useraccount u right join `acme-pilgrim`.pilgrim p on u.id = p.userAccount_id;")
	//	Collection<Actor> findAllActive();

}
