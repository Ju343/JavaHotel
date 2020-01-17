package net.lecnam.nfe103;

public class Reservation {

    private int num_reservation;
    private float date_arrive;
    private float date_depart;
    private int nb_voyageurs;


    public Reservation(int num_reservation, float date_arrive, float date_depart, int nb_voyageurs) {
        this.num_reservation = num_reservation;
        this.date_arrive = date_arrive;
        this.date_depart = date_depart;
        this.nb_voyageurs = nb_voyageurs;
    }

    public int getNum_reservation() {
        return num_reservation;
    }

    public void setNum_reservation(int num_reservation) {
        this.num_reservation = num_reservation;
    }

    public float getDate_arrive() {
        return date_arrive;
    }

    public void setDate_arrive(float date_arrive) {
        this.date_arrive = date_arrive;
    }

    public float getDate_depart() {
        return date_depart;
    }

    public void setDate_depart(float date_depart) {
        this.date_depart = date_depart;
    }

    public int getNb_voyageurs() {
        return nb_voyageurs;
    }

    public void setNb_voyageurs(int nb_voyageurs) {
        this.nb_voyageurs = nb_voyageurs;
    }
}
