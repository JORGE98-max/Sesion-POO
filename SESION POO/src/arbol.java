
public class arbol {

	// ATRIBUTOS
	
	private int cantidadHojas;

	

	public int getCantidadHojas() {
		return cantidadHojas;
	}

	public void setCantidadHojas(int cantidadHojas) {
		this.cantidadHojas = cantidadHojas;
	}

	private String Tipo;

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	private int Antiguedad;

	public int getAntiguedad() {
		return Antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		Antiguedad = antiguedad;
	}

	private double altura;

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	//METODOS
	
	void crecer() {

		System.out.println("Crece diariamente");
	}

	void crearHojas() {

		System.out.println("Crea hojas para oxigenarnos");
	}

	void fotosintesis() {

		System.out.println("Captan dióxido de carbono y expulsar oxígeno a lo largo del día");
	}
}
