package UTN.TP4_GRUPO_15.negocio;

import java.util.List;

import UTN.TP4_GRUPO_15.controllers.turnoController;
import UTN.TP4_GRUPO_15.entidad.Turno;

public class turnoNegocio {
    private turnoController turnoController;

    public turnoNegocio() {
        this.turnoController = new turnoController();
    }

    public String create(Turno turno) {
        return turnoController.create(turno);
    }

    public void listTurnosInnerJoin() {
        turnoController.listTurnosInnerJoin();
    }

    public void listTurnStatusPercentages() {
        turnoController.listTurnStatusPercentages();
    }

	public turnoController getTurnoController() {
		return turnoController;
	}

	public void setTurnoController(turnoController turnoController) {
		this.turnoController = turnoController;
	}
    
    
}