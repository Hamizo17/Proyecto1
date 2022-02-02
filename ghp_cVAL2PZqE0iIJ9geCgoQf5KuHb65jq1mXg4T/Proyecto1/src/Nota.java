public class Nota {
	
	private double nota;
	private int evaluacion;
	private Modulo modulo;
	
	public Nota( int evalu, Modulo modulo, double nota) {
		this.nota=nota;
		this.evaluacion=evalu;
		this.modulo=modulo;
	}
		//geters
		
		public double getnota(){
			return this.nota ;
		}
		public int getevalu(){
			return this.evaluacion ;
		}
		public String getmodulo(){
			return modulo.getnombre();
		}
		
}