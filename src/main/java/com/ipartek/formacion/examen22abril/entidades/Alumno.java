package com.ipartek.formacion.examen22abril.entidades;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

public class Alumno {
	private Long id;

	private String email;
	
	private String password;
	
	@NotNull
	@NotBlank
	private String nombre;

	@NotNull
	@NotBlank
	private String apellidos;

	@Past
	private LocalDate fechaNacimiento;

	@Min(0)
	@Max(10)
	private BigDecimal nota;

	private Set<Curso> cursos;

	public Alumno() {
		super();
	}

	public Alumno(Long id, String email, String password, @NotNull @NotBlank String nombre,
			@NotNull @NotBlank String apellidos, @Past LocalDate fechaNacimiento, @Min(0) @Max(10) BigDecimal nota,
			Set<Curso> cursos) {
		this.id = id;
		this.email = email;
		this.password = password;	
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.nota = nota;
		this.cursos = cursos;
	}

	public Alumno(String email, String password, @NotNull @NotBlank String nombre, @NotNull @NotBlank String apellidos,
			@Past LocalDate fechaNacimiento, @Min(0) @Max(10) BigDecimal nota, Set<Curso> cursos) {
		this(null, email, password, nombre, apellidos, fechaNacimiento, nota, cursos);

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public BigDecimal getNota() {
		return nota;
	}

	public void setNota(BigDecimal nota) {
		this.nota = nota;
	}

	public Set<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(Set<Curso> cursos) {
		this.cursos = cursos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, cursos, email, fechaNacimiento, id, nombre, nota, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(cursos, other.cursos)
				&& Objects.equals(email, other.email) && Objects.equals(fechaNacimiento, other.fechaNacimiento)
				&& Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(nota, other.nota) && Objects.equals(password, other.password);
	}

	@Override
	public String toString() {
		return "Alumno [id=" + id + ", email=" + email + ", password=" + password + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento + ", nota=" + nota + ", cursos="
				+ cursos + "]";
	}

}