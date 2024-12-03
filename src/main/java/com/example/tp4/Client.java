package com.example.tp4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Client {
    int code;
    String civilite;
    String nom;
    String  prenom;
    int cp;
    String ville;
    Date dateN;
    String mail;
    long number;
    private static List<Client> clientList = new ArrayList<>();
    public static List<Client> getClientList() {
        return clientList;
    }
    public static void addClient(Client newClient) {
        clientList.add(newClient);
    }
    public Client(int code, String civilite, String nom, String prenom, int cp, String ville, Date dateN, String mail, long number) {
        this.code = code;
        this.civilite = civilite;
        this.nom = nom;
        this.prenom = prenom;
        this.cp = cp;
        this.ville = ville;
        this.dateN = dateN;
        this.mail = mail;
        this.number = number;
    }
    public Client()
    {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Date getDateN() {
        return dateN;
    }

    public void setDateN(Date dateN) {
        this.dateN = dateN;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }
}
