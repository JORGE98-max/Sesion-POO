
public class Principal {

	public static void main(String[] args) {
		
		
		// ARBOL
		System.out.println("EJERCICIO 1 - ÁRBOL");
		arbol tree = new arbol();
		
		tree.setCantidadHojas(800);
		System.out.println(tree.getCantidadHojas());
		
		tree.setAltura(2.56);
		System.out.println(tree.getAltura()+ " m ");
		
		tree.setAntiguedad(36);
		System.out.println(tree.getAntiguedad() + " a\u00f1os");
		
		tree.setTipo("Roble Australiano");
		System.out.println(tree.getTipo());
		
		tree.crearHojas();
		tree.crecer();
		tree.fotosintesis();
		
		// HUMANO
		
		System.out.println("EJERCICIO 2 - HUMANO");
		
		humano Myhuman = new humano();
		System.out.println("Soy humano");
		
		Myhuman.setAltura(1.86);
		System.out.println(Myhuman.getAltura()+ " m ");
		Myhuman.setEdad(48);
		System.out.println(Myhuman.getEdad()+ " a\u00f1os");
		
		System.out.println(Myhuman.genero);
		System.out.println(Myhuman.caracter);
		
		Myhuman.hablar();
		Myhuman.correr();
		Myhuman.comer();

	}

}
