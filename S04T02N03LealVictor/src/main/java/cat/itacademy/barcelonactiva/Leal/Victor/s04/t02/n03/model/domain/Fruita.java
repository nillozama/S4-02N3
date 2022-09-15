package cat.itacademy.barcelonactiva.Leal.Victor.s04.t02.n03.model.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Document (collection="fruites")
public class Fruita {
	
	@Id
	private int id;
	private String nom;
	private int quantitatQuilos;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getQuantitatQuilos() {
		return quantitatQuilos;
	}
	public void setQuantitatQuilos(int quantitatQuilos) {
		this.quantitatQuilos = quantitatQuilos;
	}
	
	@Override
	public String toString() {
		return "Fruita [id=" + id + ", nom=" + nom + ", quantitat_Quilos=" + quantitatQuilos + "]";
	}
	
	
}
