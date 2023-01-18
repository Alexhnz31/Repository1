package main;

import entity.User;
import entity.UserSex;
import entity.UserStatus;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(3123132L, "Bob", "Anderson", UserStatus.BLOCKED, "+79832131312", UserSex.MALE);
    }
}
