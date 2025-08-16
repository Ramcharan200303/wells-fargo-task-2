package com.wellsfargo.counselor;

import java.util.List;

public class Portfolio {
    private int id;
    private Client client;
    private List<Security> securities;

    // Constructor
    public Portfolio(int id, Client client, List<Security> securities) {
        this.id = id;
        this.client = client;
        this.securities = securities;
    }

    // Getters
    public int getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    // Setters
    public void setClient(Client client) {
        this.client = client;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }
}
