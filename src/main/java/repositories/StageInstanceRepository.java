
package repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import domain.StageInstance;

@Repository
public interface StageInstanceRepository extends JpaRepository<StageInstance, Integer> {

	@Query("select si from StageInstance si where si.stage_id > ?1")
	Collection<StageInstance> findAllActive(int stage_Id);
}
