package UTN.TP4_GRUPO_15.negocio;

import UTN.TP4_GRUPO_15.controllers.especialidadController;
import UTN.TP4_GRUPO_15.entidad.Especialidad;

public class especialidadNegocio {
    private especialidadController especialidadController;

    public especialidadNegocio() {
        this.especialidadController = new especialidadController();
    }

    public String create(Especialidad especialidad) {
        return especialidadController.create(especialidad);
    }

    public Especialidad readOne(int id) {
        return especialidadController.readOne(id);
    }

    public String delete(int id) {
        return especialidadController.delete(id);
    }

	public especialidadController getEspecialidadController() {
		return especialidadController;
	}

	public void setEspecialidadController(especialidadController especialidadController) {
		this.especialidadController = especialidadController;
	}
    
    
}