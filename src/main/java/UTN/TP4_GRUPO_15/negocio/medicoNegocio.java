package UTN.TP4_GRUPO_15.negocio;

import java.util.List;

import UTN.TP4_GRUPO_15.controllers.medicoController;
import UTN.TP4_GRUPO_15.entidad.Medico;

public class medicoNegocio {
    private medicoController medicoController;

    public medicoNegocio() {
        this.medicoController = new medicoController();
    }

    public String create(Medico medico) {
        return medicoController.create(medico);
    }

    public Medico readOne(int id) {
        return medicoController.readOne(id);
    }

    public List<Medico> listMedicos() {
        return medicoController.listMedicos();
    }

    public String update(Medico medico) {
        return medicoController.update(medico);
    }

    public String delete(int id) {
        return medicoController.delete(id);
    }

    public void listMedicsAscending() {
        medicoController.listMedicsAscending();
    }

    public void listMedicsDescending() {
        medicoController.listMedicsDescending();
    }

    public void listMedicsIds() {
        medicoController.listMedicsIds();
    }

    public void listMedicWithHighestId() {
        medicoController.listMedicWithHighestId();
    }

	public medicoController getMedicoController() {
		return medicoController;
	}

	public void setMedicoController(medicoController medicoController) {
		this.medicoController = medicoController;
	}
    
    
}