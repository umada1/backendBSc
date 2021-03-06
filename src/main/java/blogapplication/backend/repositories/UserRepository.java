package blogapplication.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import blogapplication.backend.classes.Users;


public interface UserRepository extends JpaRepository<Users, Long> {

	Users findByUsername(String username);
	boolean existsByUsername(String username);
}