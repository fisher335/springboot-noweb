package com.example.demo.Dao;

public class User   {
    String name;
    String login_name;
    int age;
    int id;
    public User(){
    }
    public User(String name, String login_name, int age) {
        this.name = name;
        this.login_name = login_name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }





    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", login_name='" + login_name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
