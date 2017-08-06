package p.p.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import p.p.entity.HomeworkExcercise;

@Repository
public interface HomeworkExcerciseRepository extends JpaRepository<HomeworkExcercise, Long>{

	List<HomeworkExcercise> findByConspectusId(long id);
}
