
public class PruebaAlumno1 {

	public static void main(String[] args) {
		
		String [] grupos= {"Daw1", "Daw2"};
		double [] notas= {4,7.5,4.8,2,3};
		Modulo m1 = new Modulo(123, "Programacion");
		Modulo m2=new Modulo (214, "Base de datos");
		Grupo g1 = new Grupo(grupos);
		Ciclo c1 = new Ciclo(g1, "Informatica");
		Alumno [] alumnos = null;
		alumnos [0] = new Alumno ("6312123r", "Jorge", "Martinez", c1, g1, m1) ;
		alumnos [1] = new Alumno ("635423r", "Pedro", "Galarga", c1, g1, m1) ;
		alumnos [2] = new Alumno ("6351233r", "Marcos", "Marti", c1, g1, m2) ;
		alumnos [3] = new Alumno ("635123t", "Felipe", "Mar", c1, g1, m2) ;

		
		
		
int caso=0;
		
		
		
		do {
			switch(caso) {
			
			case 0:
				System.out.println("Bienvenido al menu, que desea hacer:");
				System.out.println("1 / Para crear un alumno");
				System.out.println("2 / Para crear un ciclo");
				System.out.println("3 / Para crear un grupo");
				System.out.println("4 / Para crear un modulo");
				System.out.println("5 / Para añadir notas");
				System.out.println("6 / PARA SALIR DE LA APP");
				System.out.println("");
				caso=Console.readInt();
				
				break;
				
			case 1:
				
			System.out.println("Identifica a un alumno del 1 al 4");
				Nota Nota;
				alumnos[Console.readInt()-1].setnotas(Nota =new Nota (Console.readInt(), m1, 6.7));
			
				
				
			default:
				System.out.println("Opcion no valida... Vuelve a probar...");
				caso=0;
				System.out.println("");
				break;
			}
		
		} while(caso!=6);
		System.out.println("Saliendo de la app...");
		
	}
	

//		int cont_notas;
//		Nota [] notas;
//		notas[]=new Nota(Console.readInt(), a1.getmodulo)
		
	}
	


