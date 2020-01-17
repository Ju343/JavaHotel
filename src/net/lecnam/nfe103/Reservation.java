package net.lecnam.nfe103;
import java.util.*;

public class Reservation {

    private double num_reservation;
    private int nb_voyageurs;
    private Date date_arrive;
    private Date date_depart;

    public Reservation(Hotel MonHotel,Date date_arrive, Date date_depart, int nb_voyageurs) {

        double compteurTemporaire = 0;
        for(Reservation r :MonHotel.getMesReservations())
        {
            compteurTemporaire = r.num_reservation;
        }
        compteurTemporaire++;

        this.num_reservation = compteurTemporaire;
        this.date_arrive = date_arrive;
        this.date_depart = date_depart;
        this.nb_voyageurs = nb_voyageurs;
    }

    public double getNum_reservation() {
        return num_reservation;
    }

    public void setNum_reservation(double num_reservation) {
        this.num_reservation = num_reservation;
    }

    public int getNb_voyageurs() {
        return nb_voyageurs;
    }

    public void setNb_voyageurs(int nb_voyageurs) {
        this.nb_voyageurs = nb_voyageurs;
    }

    public Date getDate_arrive() {
        return date_arrive;
    }

    public void setDate_arrive(Date date_arrive) {
        this.date_arrive = date_arrive;
    }

    public Date getDate_depart() {
        return date_depart;
    }

    public void setDate_depart(Date date_depart) {
        this.date_depart = date_depart;
    }
}
