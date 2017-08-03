package p.p.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import p.p.entity.HomeworkExcercise;

@Repository
public interface HomeworkExcerciseRepository extends JpaRepository<HomeworkExcercise, Long>{

}
