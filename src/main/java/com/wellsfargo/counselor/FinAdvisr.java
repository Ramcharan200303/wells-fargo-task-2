package com.example.demo.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @OneToMany(mappedBy = "advisor")
    private List<Client> clients;

    // Constructor
    public FinancialAdvisor(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public FinancialAdvisor() {
    }

    // Getters
    public Long getId() {
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
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
