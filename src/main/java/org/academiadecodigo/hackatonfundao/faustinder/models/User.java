package org.academiadecodigo.hackatonfundao.faustinder.models;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String phoneNumber;
    private String username;
    private String city;
    private String password;

    private char gender;


    public User(){

    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @ManyToMany(cascade = CascadeType.ALL,
        fetch = FetchType.EAGER
    )
    private Set<Fetish> fetishes = new HashSet<>();

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getId() {
        return id;
    }

    public void addFetish(Fetish fetish){
        fetishes.add(fetish);
    }
}
