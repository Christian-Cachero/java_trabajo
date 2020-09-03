
public class Fruta extends Productos implements Comparable<Productos>{

	//Nombre: Frutillas /// Precio: $64 /// Unidad de venta: kilo
	
	public Fruta(String nombre, int precio,String UnidadDeVenta) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.UnidadDeVenta = UnidadDeVenta;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		
	}

	public String getUnidadDeVenta() {
		return UnidadDeVenta;
	}

	public void setUnidadDeVenta(String unidadDeVenta) {
		
	}

	public double getLitros() {
		return 0;
	}

	public void setLitros(double litros) {
		
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
	
	//metodo para comparar
	
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
		return "Nombre: "+nombre+" /// Precio: "+$+""+precio+" /// Unidad de venta: "+UnidadDeVenta+"";
	}	
	
}
