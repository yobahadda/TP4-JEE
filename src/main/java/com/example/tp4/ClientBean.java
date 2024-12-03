package com.example.tp4;

import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.RequestScoped;

@ManagedBean(name = "clientBean") // Ensure correct naming
@RequestScoped
public class ClientBean { // Class name should start with an uppercase letter
    private Client client;

    public ClientBean() {
        client = new Client(); // Initialize the client object
    }

    public String submit() {
        Client.addClient(client); // Add client to the list
        return "success"; // Navigation outcome (adjust as necessary)
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}