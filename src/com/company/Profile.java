package com.company;

public class Profile {
    private String login;
    private User user;

    public Profile() {
    }

    public Profile(String login, User user) {
        this.login = login;
        this.user = user;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String  getInfoAboutProfile(){
        boolean notData = login == "" && user == null;
        if (notData)
            return "";
        return  "Логин: " + login + ", имя пользователя: " + user.getUserName() + ", пароль: " + user.getPassword();
    }


}
