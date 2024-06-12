package UTN.TP4_GRUPO_15.negocio;

import UTN.TP4_GRUPO_15.controllers.usuarioController;
import UTN.TP4_GRUPO_15.entidad.Usuario;

public class usuarioNegocio {
    private usuarioController usuarioController;

    public usuarioNegocio() {
        this.usuarioController = new usuarioController();
    }

    public String create(Usuario usuario) {
        return usuarioController.create(usuario);
    }
    
    public usuarioController getUsuarioController() {
		return usuarioController;
	}
	public void setUsuarioController(usuarioController usuarioController) {
		this.usuarioController = usuarioController;
	}
}

