package com.wellsfargo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String portfolioName;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "portfolio")
    private List<Security> securities;

    // Constructor
    public Portfolio(String portfolioName, Client client) {
        this.portfolioName = portfolioName;
        this.client = client;
    }

    // Default constructor (needed for JPA)
    public Portfolio() {
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public Client getClient() {
        return client;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    // Setters
    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }

    @Override
    public String toString() {
        return "Portfolio{" +
                "id=" + id +
                ", portfolioName='" + portfolioName + '\'' +
                ", client=" + client +
                '}';
    }
}
