package net.lecnam.nfe103;

import java.util.ArrayList;
import java.util.List;


public class Hotel {
    private String Hotel;
    private List<Client> MesClients;
    private List<Chambre> MesChambres;
    private List<Reservation> MesReservations;

    public Hotel()
    {
        MesClients = new ArrayList<Client>();
        MesChambres = new ArrayList<Chambre>();
        MesReservations = new ArrayList<Reservation>();
    }

    // FUNCTIONS

    public void AjouterClient(String Nom, String Prenom, String Mail)
    {
        Client C1 = new Client(Nom, Prenom, Mail);
        MesClients.add(C1);
    }

    public void AjouterChambre(String numChambre, String , String Mail)
    {
        Chambre C1 = new Chambre("");
        MesClients.add(C1);
    }

    // GETTER & SETTER

    public List<Client> getMesClients() {
        return MesClients;
    }

    public void setMesClients(List<Client> mesClients) {
        MesClients = mesClients;
    }

    public List<Chambre> getMesChambres() {
        return MesChambres;
    }

    public void setMesChambres(List<Chambre> mesChambres) {
        MesChambres = mesChambres;
    }

    public List<Reservation> getMesReservations() {
        return MesReservations;
    }

    public void setMesReservations(List<Reservation> mesReservations) {
        MesReservations = mesReservations;
    }
}
