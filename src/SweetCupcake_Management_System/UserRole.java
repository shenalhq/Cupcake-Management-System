package SweetCupcake_Management_System;


public abstract class UserRole {
    private User user;

    public UserRole(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public abstract void loginAction();
}
