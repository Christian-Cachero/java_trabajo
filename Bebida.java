
public class Bebida extends Productos implements Comparable<Productos>{
	
	
	/*Nombre: Coca-Cola Zero /// Litros: 1.5 /// Precio: $20
	  Nombre: Coca-Cola /// Litros: 1.5 /// Precio: $18*/
	
	
	/*public Bebida() {
		this.nombre = "Coca-cola Zero";
	}*/
	
	public Bebida(String nombre,double litros, int precio) {
		super();
		this.nombre = nombre;
		this.litros = litros;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		
	}

	public String getUnidadDeVenta() {
		return null;
	}
	
	public void setUnidadDeVenta(String unidadDeVenta) {
			
	}

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		litros = 1.5;
	}

	public int getContenido() {
		return 0;
	}
	
	public void setContenido(int contenido) {
		
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		
	}
	
	//metodo para comparar (compara el atributo de esta clase con la del constructor en la clase principal)
	// -1 para indicar menor
	//  0 para indicar igualdad
	//  1 para indicar mayor
	
	@Override
	public int compareTo(Productos p) {
		//return b.precio - this.precio;
		
		int estado = -1;
		
		if(this.precio > p.getPrecio()) {
			
			estado = 1;
			
		}else if(this.precio == p.getPrecio()) {
			
			estado = 0;
		}
		
		return estado;
	}

	
	public String toString() {
		return "Nombre: "+nombre+" /// Litros: "+litros+" /// Precio: "+$+""+precio+"";
	}

}
