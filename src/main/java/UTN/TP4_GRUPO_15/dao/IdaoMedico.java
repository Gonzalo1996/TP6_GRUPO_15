package UTN.TP4_GRUPO_15.dao;

import java.util.List;

import UTN.TP4_GRUPO_15.entidad.Medico;


public interface IdaoMedico {

	
	public boolean Add(Medico medic);
	public Medico ReadOne(String nombreMedico);
	public List<Medico> ReadAll();
	public boolean Exist(String nombreMedico);
	public boolean Update(Medico medic);
	public boolean Delete(Medico medic);
	
	
	
}
