package UTN.TP4_GRUPO_15.dao;

import org.hibernate.Session;

import UTN.TP4_GRUPO_15.entidad.Especialidad;

public interface IdaoEspecialidad {
	
	public String create(Especialidad especialidad);
	
	public Especialidad readOne(int id);
	
	public String delete(int id);
}
