package com.ipartek.formacion.examen22abril.accesodatos;

import java.util.TreeMap;

import com.ipartek.formacion.examen22abril.entidades.Alumno;
import com.ipartek.formacion.examen22abril.entidades.Curso;

public class DaoAlumnoMemoria implements DaoAlumno {

	private TreeMap<Long, Alumno> alumnos = new TreeMap<>();

	// PATRÓN SINGLETON
	private DaoAlumnoMemoria() {
	}

	private static final DaoAlumnoMemoria INSTANCIA = new DaoAlumnoMemoria();

	public static DaoAlumnoMemoria getInstancia() {
		return INSTANCIA;
	}
	// FIN SINGLETON

	@Override
	public Iterable<Alumno> obtenerTodos() {
		return alumnos.values();
	}

	@Override
	public Alumno obtenerPorId(Long id) {
		return alumnos.get(id);
	}

	@Override
	public Alumno insertar(Alumno alumno) {
		Long id = alumnos.size() > 0L ? alumnos.lastKey() + 1L: 1L;
		alumno.setId(id);
		alumnos.put(id, alumno);
		
		return alumno;
	}

	@Override
	public Alumno modificar(Alumno producto) {
		alumnos.put(producto.getId(), producto);
		return producto;
	}

	@Override
	public void borrar(Long id) {
		alumnos.remove(id);
	}

	@Override
	public Iterable<Curso> cursos(Long id) {
		return cursos.values();
	}

}
