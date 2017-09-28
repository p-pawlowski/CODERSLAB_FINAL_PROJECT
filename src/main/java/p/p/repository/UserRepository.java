package p.p.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import p.p.entity.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User,Long> {

	User findByEmail(String email);
	User findById(int id);
	
}
