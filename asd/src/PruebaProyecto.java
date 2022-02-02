public class PruebaProyecto {

	public static void main(String[] args) {
		
		String [] grupos= {"Daw1", "Daw2"};
		
		Modulo [] modulos = new Modulo[2];
		
		modulos [0] = new Modulo("Programacion"); 
		modulos [1] = new Modulo("Base de datos");
		
		Grupo g1 = new Grupo(grupos);
		
		Ciclo c1 = new Ciclo(g1, "Informatica");
		
		Alumno [] alumnos = new Alumno[4] ;
		
		alumnos [0] = new Alumno ("123T", "Jorge", "Martinez", c1, g1, modulos [0]) ;
		alumnos [1] = new Alumno ("321C", "Pedro", "Galarga", c1, g1, modulos [0]) ;
		alumnos [2] = new Alumno ("222C", "Marcos", "Marti", c1, g1, modulos [1]) ;
		alumnos [3] = new Alumno ("333A", "Felipe", "Mar", c1, g1, modulos [1]) ;

		Nota [] notas = new Nota [99];

		int contNotas=0;
		
		
int caso=0;		
		
		do {
			
			switch(caso) {
			
			case 0:
				System.out.println("");
				System.out.println("Bienvenido al menu, que desea hacer:");
				System.out.println("1 / Mostrar alumnos");
				System.out.println("2 / Mostrar modulos");
				System.out.println("3 / Ver notas de un alumno (NO PUEDES MOSTRARLAS SIN ANTES PONERLAS)");
				System.out.println("4 / Cambiar las notas del alumno");
				System.out.println("5 / Mostrar notas de un modulo");
				System.out.println("6 / PARA SALIR DE LA APP");
				System.out.println("");
				caso=Console.readInt();
				
				break;
				
			case 1:
				for (int i = 0; i < alumnos.length; i++) {
					System.out.print(alumnos[i].getNombre() + ", ");
				}
				
				System.out.println(" ");
				caso=0;

				break;
				
			case 2:
				for (int i = 0; i < modulos.length; i++) {
					System.out.print(modulos[i].getnombre() + ", ");
				}
				
				System.out.println(" ");
				caso=0;

				break;
				
			case 3:
				System.out.println("De que alumno quieres visualizar las notas: ");
				int nAlumno=Console.readInt();
				System.out.println(alumnos[nAlumno-1].mostrarNota());
				
				caso=0;
				break;
				
			case 4:
				
				System.out.println("De que alumno quieres modificar las notas: ");
				int nAlumno2=Console.readInt();
				System.out.println("Nota:");
				double nota=Console.readDouble();
				System.out.println("Evaluacion:");
				int eva=Console.readInt();
				
				notas [contNotas] = new Nota(eva, nota);
				
				alumnos[nAlumno2-1].setNota(notas[contNotas]);
				
				contNotas++;
				
				caso=0;
				break;
				
			case 5:
				
				System.out.println("De que modulo quieres mostrar las notas:");
				int nMo=Console.readInt();
				

				String s2=modulos[nMo-1].getnombre();
				
				for (int i = 0; i < alumnos.length; i++) {
					
					String s1=alumnos[i].getmodulo();
					
					if(s1.equals(s2)) {
						System.out.println("Funciona");
					}else {
						System.out.println("No funciona");
					}
				}
				
				caso=0;
				break;
				
			default:
				System.out.println("Opcion no valida... Vuelve a probar...");
				caso=0;
				break;
			}
		
		} while(caso!=6);
		System.out.println("Saliendo de la app...");
		
	}	
}
	


