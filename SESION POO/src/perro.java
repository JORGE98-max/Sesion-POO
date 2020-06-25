
public class perro {

	String nombre;
	String colorPelo;
	
	
	public String getColorPelo() {
		return colorPelo;
	}

	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}

	int cantidadOjos;
	private int cantidadPatas;
	
	public int getCantidadPatas() {
		return cantidadPatas;
	}

	public void setCantidadPatas(int cantidadPatas) {
		this.cantidadPatas = cantidadPatas;
	}

	void caminar() {
		
		System.out.println("Camina hacia el parque");
	}
	
	void ladrar() {
		
		System.out.println("Ladra a los vecinos");
	}
	
	void comer() {
		
		System.out.println("Come carne");
	}
	
	perro(){
		
		this.nombre = "Arius";
		
		this.cantidadOjos = 2;
	}
}
