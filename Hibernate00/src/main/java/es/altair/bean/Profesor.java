package es.altair.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="profesor")
public class Profesor implements Serializable{
	
	@Id
	private int id;
	private String nombre;
	private String ape1;
	private String ape2;
	
	public Profesor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Profesor(int id, String nombre, String ape1, String ape2) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ape1 = ape1;
		this.ape2 = ape2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApe1() {
		return ape1;
	}

	public void setApe1(String ape1) {
		this.ape1 = ape1;
	}

	public String getApe2() {
		return ape2;
	}

	public void setApe2(String ape2) {
		this.ape2 = ape2;
	}

	@Override
	public String toString() {
		return "Profesor [id=" + id + ", nombre=" + nombre + ", ape1=" + ape1 + ", ape2=" + ape2 + "]";
	}
	
	
}
