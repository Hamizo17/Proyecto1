
public class PruebaAlumno1 {

	public static void main(String[] args) {
		
		String [] grupos= {"Daw1", "Daw2"};
		double [] notas= {4,7.5,4.8,2,3};
		Modulo m1 = new Modulo(123, "Programacion");
		Nota n1 = new Nota( 1, m1);
		n1.crearnotas(null);
		Grupo g1 = new Grupo(grupos);
		
 		Ciclo c1 = new Ciclo(g1, "Informatica");
		Alumno a1 = new Alumno("1234T", "Pablo", "Torres", c1, g1);
		a1.setnotas(n1);
		
		System.out.println(a1.toString());
		System.out.println(n1.mostrarnotas());
		
	}
	


}
