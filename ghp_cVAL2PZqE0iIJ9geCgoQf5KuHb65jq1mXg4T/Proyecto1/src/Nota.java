
public class Nota {
	
	private double [] nota ;
	private int evaluacion;
	private Modulo modulo;
	
	public Nota( int evalu, Modulo modulo, double [] arraynotas) {
		
		this.nota[]=new [5];
		this.evaluacion=evalu;
		this.modulo=modulo;
		
	}
	//geters
	
	public double getnotas(int a){
		
		return  this.nota[a-1] ;
		
	}
	public double [] getnotas(){
			
			return  this.nota ;
			
		}
	
	public int getevalu(){
		
		return  this.evaluacion ;
		
	}
	
	public String getmodulo(){
	
	return  modulo.getnombre();
	
	} 
	public void crearnotas( double [] arraynotas) {
		

			
			this.nota=arraynotas;
			
		}
	
	
	public String mostrarnotas() {
		
			String devolver = "";
			
		 for(int i=0;i<this.nota.length;i++) {
			 devolver += "Nota " + i + " es " + nota[i];
		}
		 
		 return devolver;
	}

}
