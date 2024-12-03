package com.example.tp4;

import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.ViewScoped;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

@ManagedBean(name="clientBean")
@ViewScoped
public class ClientBean {
    private Client client = new Client();
    private List<Client> clientList = new ArrayList<>();

    // Méthode pour enregistrer un client
    public void saveClient() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(client);
            tx.commit();
            client = new Client();
            loadClients();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    // Méthode pour charger la liste des clients
    public void loadClients() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            Query<Client> query = session.createQuery("Select l FROM clientstable l", Client.class);
            clientList = query.getResultList();
        } finally {
            session.close();
        }
    }

    // Getters et Setters
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Client> getClientList() {
        return clientList;
    }
}