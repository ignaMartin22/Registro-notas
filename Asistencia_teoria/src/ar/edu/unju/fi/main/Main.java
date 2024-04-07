package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.model.*;
public class Main {

	public static void main(String[] args) {

		Alumno alumno = generarAlumno();
		registrarNotas(alumno,2);
		
		}
		
	public static Alumno generarAlumno() {
		Alumno alumno = new Alumno();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ingrese el legajo: ");
		Integer legajo = scanner.nextInt();
		System.out.println("ingrese el apellido: ");
		String apellido = scanner.next();
		System.out.println("ingrese el nombre: ");
		String nombre = scanner.next();
	
		alumno.setLegajo(legajo);
		alumno.setApellido(apellido);
		alumno.setNombre(nombre);
		return alumno;
	}
	public static void registrarNotas(Alumno alumno, int numMaterias) {

		Scanner scanner = new Scanner(System.in);
		while(numMaterias > 0) {

			System.out.println("Ingrese  el nombre de la materia: ");
			String nombreMateria = scanner.next();
			System.out.println("Ingrese  el código de la materia:  ");
			String codigoMateria = scanner.next();
			
			Materia materia = new Materia(codigoMateria,nombreMateria);
			

			System.out.println("Ingrese  el codigo de registro de nota: ");
			String codigoNota = scanner.next();
			System.out.println("Ingrese la nota final: ");
			Float notaFinal = scanner.nextFloat();
			
			RegistroNota registroNota = new RegistroNota(codigoNota,alumno,materia,notaFinal);
			
			System.out.println(registroNota.toString());
			numMaterias--;
	}
		scanner.close();

}
	}
