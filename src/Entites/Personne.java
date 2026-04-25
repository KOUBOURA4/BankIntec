package Entites;

import java.util.Date;

public class Personne {
    private int Id;
    private String nom;
    private  String prenom;
    private int age;
    private String adress;
    private  String phone;
    private Date dateNaissance;
    private Date createdDate;
    private Date updatedDate;

    public Personne(int id, String nom, String prenom, int age, String adress, String phone, Date dateNaissance, Date createdDate, Date updatedDate) {
        Id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.adress = adress;
        this.phone = phone;
        this.dateNaissance = dateNaissance;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
}
