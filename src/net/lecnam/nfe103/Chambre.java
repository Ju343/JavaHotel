package net.lecnam.nfe103;

public class Chambre {

    public enum categorie {
        eco,
        confort,
        confortPlus;
    }

    private int num_chambre;

    public Chambre(int num_chambre) {
        this.num_chambre = num_chambre;
    }

    public int getNum_chambre() {
        return num_chambre;
    }

    public void setNum_chambre(int num_chambre) {
        this.num_chambre = num_chambre;
    }
}
