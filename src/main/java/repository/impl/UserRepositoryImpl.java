package repository.impl;

import entity.User;
import exception.NotAvailableException;
import exception.NotDataFoundException;
import repository.UserRepository;

import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    private final List<User> userList;

    public UserRepositoryImpl(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public User findById(Long id) {
        for (User user : userList) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        throw new NotDataFoundException("User not found");
    }

    @Override
    public void delete(Long id) {
        userList.remove(findById(id));
    }

    @Override
    public void update(User user) {
        User userFromDataBase = findById(user.getId());
        userFromDataBase.setName(user.getName());
        userFromDataBase.setLastName(user.getLastName());
        userFromDataBase.setStatus(user.getStatus());
        userFromDataBase.setUserPhoneNumber(user.getUserPhoneNumber());
        userFromDataBase.setSex(user.getSex());
        delete(user.getId());
        save(userFromDataBase);
    }

    @Override
    public void save(User user) {
        for (User user1 : userList) {
            if (user1.equals(user)) {
                throw new NotAvailableException("User already exist");
            }
        }
        userList.add(user);
    }

    @Override
    public List<User> findAll() {
        return userList;
    }

    @Override
    public User findByName(String name) {
        for (User user1 : userList) {
            if (user1.getName().equals(name)) {
                return user1;
            }
        }
        throw new NotDataFoundException("User not found");
    }
}


