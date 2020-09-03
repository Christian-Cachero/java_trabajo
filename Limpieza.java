
public class Limpieza extends Productos implements Comparable<Productos>{
	
	
	//Nombre: Shampoo Sedal /// Contenido: 500ml /// Precio: $19
	
	public Limpieza(String nombre, int contenido, int precio) {
		super();
		this.nombre = nombre;
		this.contenido = contenido;
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
		return 0;
	}


	public void setLitros(double litros) {
		
	}

	public int getContenido() {
		return contenido;
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
		return "Nombre: "+nombre+" /// Contenido: "+contenido+""+ml+" /// Precio: "+$+""+precio+"";
	}	
	
}
