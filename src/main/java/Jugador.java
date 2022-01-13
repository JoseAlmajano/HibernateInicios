import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Jugador {
	
	@Id
	private int codigo;
	@Column
	private String nombre;
	@Column
	private String posicion;
	
	public Jugador(int codigo, String nombre, String posicion) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.posicion = posicion;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	

}
