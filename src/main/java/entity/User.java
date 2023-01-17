package entity;

import java.util.Objects;

public class User {
    private Long id;

    private String name;

    private String lastName;

    private UserStatus status;

    private String userPhoneNumber;

    private UserSex sex;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Long getId() {
        return id;

    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public UserSex getSex() {
        return sex;
    }

    public void setSex(UserSex sex) {
        this.sex = sex;


//        Конструкторы
        User AlexUser = new User();
        AlexUser.id = 712712300l;
        AlexUser.sex = UserSex.MALE;
        AlexUser.userPhoneNumber = "+132341141";
        AlexUser.status = UserStatus.BLOCKED;
        AlexUser.name="Adolf ";
        AlexUser.lastName="Hitler";


        User IgorUser = new User();


    }
}
