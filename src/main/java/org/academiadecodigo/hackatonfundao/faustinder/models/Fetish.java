package org.academiadecodigo.hackatonfundao.faustinder.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name="fetish")
public class Fetish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @ManyToMany(mappedBy = "fetishes",
        fetch = FetchType.LAZY
    )
    private Set<User> users = new HashSet<>();


    public Fetish(){

    }

    public Fetish(String name){
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }







}
