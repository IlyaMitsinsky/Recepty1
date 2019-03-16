package com.example.recepty;

public class IngredienRecepta {
    String nazvanie;
    Double kolichestvo;
    String edinicaIzmerenia;
    String izobrajenie;

    public IngredienRecepta() {
    }

    public IngredienRecepta(String nazvanie) {
        this.nazvanie = nazvanie;
    }

    public IngredienRecepta(String nazvanie, Double kolichestvo, String edinicaIzmerenia) {
        this.nazvanie = nazvanie;
        this.kolichestvo = kolichestvo;
        this.edinicaIzmerenia = edinicaIzmerenia;
    }

    public String getNazvanie() {
        return nazvanie;
    }

    public void setNazvanie(String nazvanie) {
        this.nazvanie = nazvanie;
    }

    public Double getKolichestvo() {
        return kolichestvo;
    }

    public void setKolichestvo(Double kolichestvo) {
        this.kolichestvo = kolichestvo;
    }

    public String getEdinicaIzmerenia() {
        return edinicaIzmerenia;
    }

    public void setEdinicaIzmerenia(String edinicaIzmerenia) {
        this.edinicaIzmerenia = edinicaIzmerenia;
    }

    public String getIzobrajenie() {
        return izobrajenie;
    }

    public void setIzobrajenie(String izobrajenie) {
        this.izobrajenie = izobrajenie;
    }
}
