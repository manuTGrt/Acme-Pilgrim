
package repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import domain.Register;

@Repository
public interface RegisterRepository extends JpaRepository<Register, Integer> {

	@Query("select r from Register r where r.pilgrim_id > ?1")
	Collection<Register> findAllActive(int pilgrim_Id);

	/*
	 * @Query("select r, si from Register r inner join StageInstance si on (r.id = si.register_id) where r.pilgrim_id > ?1")
	 * Collection<Register> findAllActive(int pilgrim_Id);
	 */

}
