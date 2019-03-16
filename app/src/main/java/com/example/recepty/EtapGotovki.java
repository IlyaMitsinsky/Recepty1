package com.example.recepty;

import java.util.ArrayList;
import java.util.Date;

public class EtapGotovki {
    String opisanie;
    Date vremyaVypolnenya;
    ArrayList<String> fotografia;

    public EtapGotovki() {
    }

    public EtapGotovki(String opisanie) {
        this.opisanie = opisanie;
    }

    public String getOpisanie() {
        return opisanie;
    }

    public void setOpisanie(String opisanie) {
        this.opisanie = opisanie;
    }

    public Date getVremyaVypolnenya() {
        return vremyaVypolnenya;
    }

    public void setVremyaVypolnenya(Date vremyaVypolnenya) {
        this.vremyaVypolnenya = vremyaVypolnenya;
    }

    public ArrayList<String> getFotografia() {
        return fotografia;
    }

    public void setFotografia(ArrayList<String> fotografia) {
        this.fotografia = fotografia;
    }
}


