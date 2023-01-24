package repository;

import entity.User;

import java.util.List;

public interface UserRepository {
    User findById(Long id);

    void delete(Long id);

    void update(User user);

    void save(User user);

    List<User> findAll();

    User findByName(String name);


}

