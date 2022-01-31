
public class Alumno extends Persona {

	private Ciclo ciclo;
	private Notas notas;
	
	public Alumno(String dni, String nombre, String apellido, Ciclo ciclo, Notas notas) {
		super(dni, nombre, apellido);
		this.notas=notas;
		this.ciclo=ciclo;
	}

	
	
}
