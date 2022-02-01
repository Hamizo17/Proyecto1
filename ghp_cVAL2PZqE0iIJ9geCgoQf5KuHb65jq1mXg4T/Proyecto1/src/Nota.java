
public class Nota {
	
	private double [] nota;
	private int evaluacion;
	private Modulo modulo;
	
	public Nota(double [] nota, int evalu, Modulo modulo) {
		
		this.nota=nota;
		this.evaluacion=evalu;
		this.modulo=modulo;
		
	}
	//geters
	
	public double getnotas(int a){
		
		return  this.nota[a-1] ;
		
	}
	
	public int getevalu(){
		
		return  this.evaluacion ;
		
	}
	
	public String getmodulo(){
	
	return  modulo.getnombre();
	
}
	

}
