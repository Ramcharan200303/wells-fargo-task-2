package com.wellsfargo.counselor;

import java.util.List;

public class Advisor {
    private int id;
    private String name;
    private String email;
    private List<Client> clients;

    
    public Advisor(int id, String name, String email, List<Client> clients) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.clients = clients;
    }

    
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
