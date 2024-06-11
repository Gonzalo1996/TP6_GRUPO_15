package UTN.TP4_GRUPO_15.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuario implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@Id
	private String usuario;
	@Column
	private String contrasenia;
	@Column
	private boolean activo;
	
	public Usuario(String usuario, String contrasenia, boolean activo) {
		super();
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		this.activo = activo;
	}

	public Usuario() {
		super();
	}
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	
	
	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Usuario [usuario=" + usuario + ", contraseña=" + contrasenia + "]";
	}
	
	
}
