package com.ipartek.formacion.examen22abril.accesodatos;

import com.ipartek.formacion.examen22abril.entidades.Alumno;
import com.ipartek.formacion.examen22abril.entidades.Curso;

public interface DaoAlumno extends Dao<Alumno> {
	Iterable<Curso> cursos(Long id);
}
