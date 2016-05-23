package com.kevco.time.repo;

import java.util.List;
import org.springframework.data.repository.query.Param;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.kevco.time.model.User;

public interface UserRepository extends MongoRepository<User, String> {
	List<User> findByLastName(@Param("name") String firstName);
	
	@Query("{email : ?0}")
	User findByEmail(@Param("email")String email);
}
