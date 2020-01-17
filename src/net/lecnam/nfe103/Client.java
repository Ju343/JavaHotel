package net.lecnam.nfe103;
import java.util.*;

public class Client {
    private String Email;
    private String NomClient;
    private String PrenomClient;
    private List<Reservation> MesReservations;

    public Client(String Email, String NomClient, String PrenomClient)
    {
        this.Email = Email;
        this.NomClient = NomClient;
        this.PrenomClient = PrenomClient;
        this.MesReservations = new ArrayList<Reservation>();
    }

    // FUNCTIONS

    public void Rerserver(Date DateDeb,Date DateFin,Chambre.categorie cat,int nbVoyageur)
    {
        Reservation R1 = new Reservation(DateDeb,DateFin,cat,nbVoyageur);
    }

    // GETTER & SETTER.

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getNomClient() {
        return NomClient;
    }

    public void setNomClient(String nomClient) {
        NomClient = nomClient;
    }

    public String getPrenomClient() {
        return PrenomClient;
    }

    public void setPrenomClient(String prenomClient) {
        PrenomClient = prenomClient;
    }
}
