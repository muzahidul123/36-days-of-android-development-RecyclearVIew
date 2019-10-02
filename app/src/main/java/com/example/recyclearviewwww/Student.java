package com.example.recyclearviewwww;

public class Student {

    private String name;
    private int id;
    private String email;
    private String phoneNo;
    private int profilepic;

    public Student() {
    }

    public Student(String name, int id, String email, String phoneNo, int profilepic) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.phoneNo = phoneNo;
        this.profilepic = profilepic;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public int getProfilepic() {
        return profilepic;
    }
}
