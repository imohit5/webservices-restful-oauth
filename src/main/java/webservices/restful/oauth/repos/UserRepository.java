package webservices.restful.oauth.repos;

import org.springframework.data.repository.CrudRepository;

import webservices.restful.oauth.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	User findByName(String name);

}
