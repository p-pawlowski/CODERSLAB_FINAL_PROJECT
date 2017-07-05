package p.p.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import p.p.entity.Conspectus;


@Repository
public interface ConspectusRepository extends JpaRepository<Conspectus, Long> {

}
