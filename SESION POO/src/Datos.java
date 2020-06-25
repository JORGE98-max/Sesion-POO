
public class Datos {

	public static void main(String[] args) {
		
		persona myperson = new persona();
		myperson.saluda();
		
		vehiculo v1 = new vehiculo();
		v1.setColor("Rojo");
		System.out.println(v1.getColor());

		perro arius = new perro();
		
		arius.caminar();
		
		System.out.println(arius.nombre);
		
		
			
			arius.setCantidadPatas(4);
			System.out.println(arius.getCantidadPatas());
			
			arius.setColorPelo("Cafe");
			System.out.println(arius.getColorPelo());
		
	}

}
