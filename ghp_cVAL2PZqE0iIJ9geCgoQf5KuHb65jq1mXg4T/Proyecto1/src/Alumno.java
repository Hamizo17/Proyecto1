
public class Alumno {
	

		private Grupo grupo;
		private String dni;
		private String nombre;
		private String apellido;
		private Ciclo ciclo;
		private Nota [] notas;
	
		public Alumno(String dni, String nombre, String apellido, Ciclo ciclo, Grupo group) {
	
			this.dni=dni;
			this.nombre=nombre;
			this.apellido=apellido;
			this.ciclo=ciclo;
			this.grupo=group;
	
			
				
			}
		public String toString() {
			 
			return "El nombre del alumno es " + this.nombre + this.apellido + " con dni " + this.dni;
			
		}
		public String  getnotas()  {
			
			
			return "La nota de la evaluacion " + notas.getevalu() + " ,de la asignatura " 
			+ notas.getmodulo() + " ,es " + notas.getnotas();
			
		}


}


