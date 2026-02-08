package com.example.demo.models;

public class Client {
    private Long id;
    private String username;
    private String email;
    private String password;
    private int role;
    private boolean enable;

    public Client(String username, String email, String password, int role) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
        this.enable = true;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getRole() {
        return role;
    }

    public boolean isEnable() {
        return enable;
    }
}
