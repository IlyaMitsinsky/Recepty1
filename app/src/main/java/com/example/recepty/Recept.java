package com.example.recepty;

import java.util.ArrayList;
import java.util.Date;

public class Recept {
    String nazvanie;
    String polnoeOpisanie;
    String kratkoeOpisanie;
    //TODO:Время
    String foto;
    ArrayList<IngredienRecepta> ingredienty;
    ArrayList<EtapGotovki> etapy;

    public Recept() {
    }

    public Recept(String nazvanie, String polnoeOpisanie, String kratkoeOpisanie) {
        this.nazvanie = nazvanie;
        this.polnoeOpisanie = polnoeOpisanie;
        this.kratkoeOpisanie = kratkoeOpisanie;
    }

    public String getNazvanie() {
        return nazvanie;
    }

    public void setNazvanie(String nazvanie) {
        this.nazvanie = nazvanie;
    }

    public String getPolnoeOpisanie() {
        return polnoeOpisanie;
    }

    public void setPolnoeOpisanie(String polnoeOpisanie) {
        this.polnoeOpisanie = polnoeOpisanie;
    }

    public String getKratkoeOpisanie() {
        return kratkoeOpisanie;
    }

    public void setKratkoeOpisanie(String kratkoeOpisanie) {
        this.kratkoeOpisanie = kratkoeOpisanie;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public ArrayList<IngredienRecepta> getIngredienty() {
        return ingredienty;
    }

    public void setIngredienty(ArrayList<IngredienRecepta> ingredienty) {
        this.ingredienty = ingredienty;
    }

    public ArrayList<EtapGotovki> getEtapy() {
        return etapy;
    }

    public void setEtapy(ArrayList<EtapGotovki> etapy) {
        this.etapy = etapy;
    }
    @Override
    public String toString(){
        return this.nazvanie;
    }
}