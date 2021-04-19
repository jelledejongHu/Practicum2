package com.company;

public class Zwembad {
    private double Lengte;
    private double Breete;
    private double Diepte;
    private double Inhoud;

    public Zwembad(double br, double ln, double di){
        Lengte = ln;
        Breete = br;
        Diepte = di;
    }

    public Zwembad(){

    }

    public double getLengte(){
        return Lengte;
    }
    public double getBreedte(){
        return Breete;
    }
    public double getDiepte() {
        return Diepte;
    }
    public void setBreedte(double breete) {
        Breete = breete;
    }
    public void setLengte(double lengte) {
        Lengte = lengte;
    }
    public void setDiepte(double diepte) {
        Diepte = diepte;
    }

    public double inhoud(){
        Inhoud = Lengte * Breete * Diepte;
        return Inhoud;
    }

    @Override
    public String toString() {
        return "Zwembad" +
                "Lengte=" + Lengte +
                ", Breete=" + Breete +
                ", Diepte=" + Diepte +
                ", Inhoud=" + Inhoud ;
    }
}
