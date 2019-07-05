package com.frankmoley.security.app.auth;


import javax.persistence.*;

@Entity
@Table(name = "AUTH_USER_GROUP")
public class AuthGroup {

    @Id
    @Column(name ="AUTH_USER_GROUP_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "AUTH_GROUP")
    private String authGroup;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAuthGroup() {
        return authGroup;
    }

    public void setAuthGroup(String authGroup) {
        this.authGroup = authGroup;
    }
}