package com.example.demo.models;

public class Client {
    private Long id;
    private String username;
    private String email;
    private String password;
    private int role;
    private boolean enable;

    public Long getId() {
        return id;
    }

    public boolean isEnable() {
        return enable;
    }

    public int getRole() {
        return role;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public Client(String username, String email, String password, int role) {
        this.role = role;
        this.password = password;
        this.email = email;
        this.username = username;
    }

    public void setId(long id) {
        this.id = id;
    }
}
