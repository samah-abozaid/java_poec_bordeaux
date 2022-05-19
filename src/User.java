import java.util.UUID;
import java.util.UUID;
public class User {
    private String id;
    private  String nom;
    private String prenom;
    private String email;
    private String motdepass;
    public User(  String nom, String prenom, String email, String motdepass)
    {

      this.id= UUID.randomUUID().toString();
        this.nom = nom;
        this.prenom=prenom;
        this.email=email;
        this.motdepass=motdepass;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email=email;
    }

    public String getMotdepass() {
        return motdepass;
    }

    public void setMotdepass(String motdepass) {

    }
}
