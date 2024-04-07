package ar.edu.unju.fi.model;

public class Materia {
 private String codigo;
 private String nombre;
 public Materia() {

}
public Materia(String materia, String nombre) {
	super();
	this.codigo = materia;
	this.nombre = nombre;
}
public String getMateria() {
	return codigo;
}
public void setMateria(String materia) {
	this.codigo = materia;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
@Override
public String toString() {
	return "Codigo=" + codigo + ", nombre=" + nombre;
}

 
}
