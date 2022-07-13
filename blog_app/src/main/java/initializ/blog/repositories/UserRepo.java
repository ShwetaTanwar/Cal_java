package initializ.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import initializ.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
