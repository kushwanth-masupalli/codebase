package com.example.basicauth_demo.user;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jspecify.annotations.Nullable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class AppUser {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    private  String username ;

    private  String password;

    private  String role ;

    public AppUser(Object o, String admin, @Nullable String admin123, String roleAdmin) {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
