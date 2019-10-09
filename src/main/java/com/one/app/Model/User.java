package com.one.app.Model;



public class User {
    private int userId;
    private String userName;
    private String gender;
    private int age;

    public int getUserId() {

        return userId;
    }

    public void setUserId(int userId) {

        this.userId = userId;
    }

    public String getUserName(){
        return this.userName;
    }

    public void setUserName(String name){
        this.userName = name;
    }

    public String getGender() {

        return gender;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    public int getAge(){
        return this.age;
    }

    public void  setAge(int age){
        this.age = age;
    }

}
