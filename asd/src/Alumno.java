
public class Alumno {
	

		private Grupo grupo;
		private String dni;
		private String nombre;
		private String apellido;
		private Ciclo ciclo;
		private Nota  nota;
		private Modulo modulo;
	
		public Alumno(String dni, String nombre, String apellido,  Ciclo ciclo, Grupo group, Modulo modulo) {
	
			this.dni=dni;
			this.nombre=nombre;
			this.apellido=apellido;
			this.ciclo=ciclo;
			this.grupo=group;
			this.modulo=modulo;
		}
		
		public String toString() {
			 
			return "El nombre del alumno es " + this.nombre + this.apellido + " con dni " + this.dni;
			
		}
		
		public String getNombre() {
			return this.nombre;
		}
		public double  mostrarNota()  {
			
			return this.nota.getNota();
		}
		
		public void setNota(Nota notas){
			
			this.nota=notas;
		}
		
		public String getmodulo() {
			
			return this.modulo.getnombre();
			
		}
		

}


