package p.p.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import p.p.entity.Role;

@Repository(value = "roleRepository")
public interface RoleRepository extends JpaRepository<Role,Long>{
	Role findByRole(String role);

}
