
public class Alumno {
	

		private Grupo id_grupo;
		private String dni;
		private String nombre;
		private String apellido;
		private Ciclo ciclo;
		private Nota[] notas;
	
		public Alumno(String dni, String nombre, String apellido, Ciclo ciclo, Nota [] notas, Grupo id_group) {
	
			this.dni=dni;
			this.nombre=nombre;
			this.apellido=apellido;
			this.notas=notas;
			this.ciclo=ciclo;
			this.id_grupo=id_group;
	
				
				
			}
		public String toString() {
			 
			return "El nombre del alumno es " + this.nombre + this.apellido + " con dni " + this.dni;
			
		}


}
