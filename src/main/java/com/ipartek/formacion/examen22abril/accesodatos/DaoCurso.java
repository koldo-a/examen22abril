package com.ipartek.formacion.examen22abril.accesodatos;

import com.ipartek.formacion.examen22abril.entidades.Alumno;
import com.ipartek.formacion.examen22abril.entidades.Curso;

public interface DaoCurso extends Dao<Curso> {

	Iterable<Alumno> alumnos(Long id);

}
