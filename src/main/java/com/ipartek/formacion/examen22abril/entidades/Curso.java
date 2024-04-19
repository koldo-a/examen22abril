package com.ipartek.formacion.examen22abril.entidades;

import java.util.Objects;
import java.util.Set;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Curso {
	@Min(0)
	private Long id;
	
	@NotNull
	@Size(min = 2, max = 150)
	private String nombre;
	
	private Set<Alumno> alumnos;

	public Curso() {
		super();
	}
	
	public Curso(String nombre, Set<Alumno> alumnos) {
		this(null, nombre, alumnos);
	}
	
	public Curso(Long id, String nombre, Set<Alumno> alumnos) {
		this.id = id;
		this.nombre = nombre;
		this.alumnos = alumnos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Set<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(alumnos, id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return Objects.equals(alumnos, other.alumnos) && Objects.equals(id, other.id)
				&& Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", nombre=" + nombre + ", alumnos=" + alumnos + "]";
	}
	
	
}

	