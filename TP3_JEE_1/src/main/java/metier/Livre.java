package metier;

import java.io.Serializable;
public class Livre implements Serializable{
private Long idLivre;
private String nomLivres;
private double prix;
public Livre() {
super();
}
public Livre(String nomLivres, double prix) {
super();
this.nomLivres = nomLivres;
this.prix = prix;
}
public Long getIdLivre() {
return idLivre;
}
public void setIdLivre(Long idLivre) {
this.idLivre = idLivre;
}
public String getNomLivres() {
return nomLivres;
}
public void setNomLivres(String nomLivres) {
this.nomLivres = nomLivres;
}
public double getPrix() {
return prix;
}
public void setPrix(double prix) {
this.prix = prix;
}
}

