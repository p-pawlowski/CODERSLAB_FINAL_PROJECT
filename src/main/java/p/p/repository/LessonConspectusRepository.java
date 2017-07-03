package p.p.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import p.p.entity.LessonConspectus;

@Repository
public interface LessonConspectusRepository extends JpaRepository<LessonConspectus, Long> {

}
