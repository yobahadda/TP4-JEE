package com.example.tp4;
import jakarta.persistence.Entity;

import java.util.Date;

public class Client {
    int code ;
    Date datecom;
    float montant;
    String modelP;
    String statusP;
    String modeL;
    String statusL;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Date getDatecom() {
        return datecom;
    }

    public void setDatecom(Date datecom) {
        this.datecom = datecom;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public String getModelP() {
        return modelP;
    }

    public void setModelP(String modelP) {
        this.modelP = modelP;
    }

    public String getStatusP() {
        return statusP;
    }

    public void setStatusP(String statusP) {
        this.statusP = statusP;
    }

    public String getModeL() {
        return modeL;
    }

    public void setModeL(String modeL) {
        this.modeL = modeL;
    }

    public String getStatusL() {
        return statusL;
    }

    public void setStatusL(String statusL) {
        this.statusL = statusL;
    }
    public Client()
    {
    }
    public Client(int code, Date datecom, float montant, String modelP, String statusP, String modeL, String statusL) {
        this.code = code;
        this.datecom = datecom;
        this.montant = montant;
        this.modelP = modelP;
        this.statusP = statusP;
        this.modeL = modeL;
        this.statusL = statusL;
    }
}
