
public class humano {
	
	// 	ATRIBUTOS
	
	private double altura;
	String genero;
	private int edad;
	String caracter;
	
	// GETTERS AND SETTERS
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	humano(){
	this.genero = "Masculino";
	this.caracter = "Apasionado";
	}
	// METODOS
	
	void hablar() {
		
		System.out.println("Hola, como estas ? ");
	}
	void correr() {
		
		System.out.println("Corre 1 kilometro diario");
	}
	void comer() {
		System.out.println("Come vegetales saludables");
	}

	
}
