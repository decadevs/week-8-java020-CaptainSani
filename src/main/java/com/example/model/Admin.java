package com.example.model;

public class Admin {
    private int id;
    private String name;
    private String email;
    private String password;
    private String adminToken;

    public Admin() {
    }

    public Admin(String name, String email, String password, String adminToken) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.adminToken = adminToken;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdminToken() {
        return adminToken;
    }

    public void setAdminToken(String adminToken) {
        this.adminToken = adminToken;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", adminToken='" + adminToken + '\'' +
                '}';
    }
}
