package UTN.TP4_GRUPO_15.dao;

import java.util.List;

import org.hibernate.Session;

import UTN.TP4_GRUPO_15.entidad.Especialidad;
import UTN.TP4_GRUPO_15.entidad.Medico;
import UTN.TP4_GRUPO_15.entidad.Usuario;

public interface IdaoMedico {
	
	public String create(Medico medico);
	
	public Medico readOne(int id);
	
	public List<Medico> listMedicos();
	
	public String update(Medico medico);
	
	public String delete(int id);
	
}
