package com.wellsfargo.entity;

import java.util.List;

public class Advisor {

    private int id;
    private String name;
    private String email;
    private List<Client> clients;

    // Constructor
    public Advisor(int id, String name, String email, List<Client> clients) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.clients = clients;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Client> getClients() {
        return clients;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    // toString
    @Override
    public String toString() {
        return "Advisor [id=" + id + ", name=" + name + ", email=" + email + "]";
    }
}
