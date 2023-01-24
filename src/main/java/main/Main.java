package main;

import entity.User;
import entity.UserSex;
import entity.UserStatus;
import repository.UserRepository;
import repository.impl.UserRepositoryImpl;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(3123132L, "Bob", "Anderson", UserStatus.BLOCKED, "+79832131312", UserSex.MALE);
        UserRepository userRepository = new UserRepositoryImpl(new ArrayList<User>());
        userRepository.save(user1);
        User user2 = new User(3123141L, "jhon", "Anderson", UserStatus.BLOCKED, "+79832131312", UserSex.MALE);
        userRepository.save(user2);
        userRepository.delete(3123132L);
    }
}

