import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Supermercado {
	
	
	public static void main(String[] args) {

		List<Productos> productos = new ArrayList<>();
		
		productos.add(new Bebida("Coca-Cola Zero", 1.5, 20));
		productos.add(new Bebida("Coca-Cola", 1.5, 18));
		productos.add(new Limpieza("Shampoo Sedal", 500, 19));
		productos.add(new Fruta("Frutillas", 64, "Kilo"));
		
		Collections.sort(productos);
			for(Productos p : productos) {
				System.out.println(p);
		
		System.out.println("=============================");
		
		int mayor = 0;
		
		for(int i = 0; i < productos.size(); i++) {
			for(int j = i + 1; j < productos.size(); j++) {
				if(productos.get(i).getPrecio() > productos.get(j).getPrecio()) {
					mayor = p.precio;
				}
			 }
				System.out.println(mayor);
			}
		}
		
		/*Productos CocaColaZero = new Bebida("Coca-Cola Zero", 1.5, 20);
		Productos CocaCola = new Bebida("Coca-Cola", 1.5, 18);
		Productos ShampooSedal = new Limpieza("Shampoo Sedal", 500, 19);
		Productos Frutillas = new Fruta("Frutillas", 64, "Kilo");*/
	
	}
	
		
		
}
	



