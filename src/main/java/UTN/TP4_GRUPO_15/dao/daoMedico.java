package UTN.TP4_GRUPO_15.dao;

import java.util.List;

import org.hibernate.Session;

import UTN.TP4_GRUPO_15.entidad.Medico;

public class daoMedico implements IdaoMedico{

	
	
	private Conexion conexion;
	
	
	public daoMedico() {
		// TODO Auto-generated constructor stub
	}

	public boolean Add(Medico medic) {
		// TODO Auto-generated method stub
		return false;
	}

	public Medico ReadOne(String nombreMedico) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Medico> ReadAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean Exist(String nombreMedico) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean Update(Medico medic) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean Delete(Medico medic) {
		// TODO Auto-generated method stub
		return false;
	}

}
