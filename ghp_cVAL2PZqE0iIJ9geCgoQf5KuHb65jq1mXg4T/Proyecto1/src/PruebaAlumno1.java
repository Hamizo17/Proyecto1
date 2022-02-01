
public class PruebaAlumno1 {

	public static void main(String[] args) {
		
		
		
		Modulo m1 = new Modulo(123, "Programacion");
		Nota n1 = new Nota(5.9, 1, m1);
		Grupo g1 = new Grupo("Daw1");
		Grupo g2 = new Grupo("Daw2");
 		Ciclo c1 = new Ciclo(g1, "Informatica");
		Alumno a1 = new Alumno("1234T", "Pablo", "Torres", c1, n1, g1);
			
		
		System.out.println(a1.getnotas());
	}
	


}
