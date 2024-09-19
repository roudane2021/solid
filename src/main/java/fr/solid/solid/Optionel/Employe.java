package fr.solid.solid.Optionel;

public class Employe{
    private Long presonneId;
    private String nom;
    private String prenom;
    private String Telephone;
    private Boolean cadre;
    private Boolean xx;

    public Employe(Long presonneId, String nom, String prenom, String telephone, Boolean cadre) {
        this.presonneId = presonneId;
        this.nom = nom;
        this.prenom = prenom;
        Telephone = telephone;
        this.cadre = cadre;
    }

    public Long getPresonneId() {
        return presonneId;
    }

    public void setPresonneId(Long presonneId) {
        this.presonneId = presonneId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    public Boolean getCadre() {
        return cadre;
    }

    public void setCadre(Boolean cadre) {
        this.cadre = cadre;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "presonneId=" + presonneId +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", Telephone='" + Telephone + '\'' +
                ", cadre=" + cadre +
                '}';
    }
}

