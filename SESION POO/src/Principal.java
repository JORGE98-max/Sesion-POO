
public class Principal {

	public static void main(String[] args) {
		
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

	}

}
