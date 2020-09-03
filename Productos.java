
public abstract class Productos implements Comparable<Productos>{

	protected String nombre, UnidadDeVenta;
	protected double litros;
	protected int contenido, precio;
	protected String $ = "$", ml = "ml";
	
	public abstract String getNombre();
	
	public abstract void setNombre(String nombre);
	
	public abstract String getUnidadDeVenta();
	
	public abstract void setUnidadDeVenta(String unidadDeVenta);
	
	public abstract double getLitros();
	
	public abstract void setLitros(double litros);
	
	public abstract int getContenido();
	
	public abstract void setContenido(int contenido);
	
	public abstract int getPrecio();
	
	public abstract void setPrecio(int precio);
	
	@Override
	public int compareTo(Productos p) {
		//return p.precio - this.precio;
		
		int estado = -1;
		
		if(this.precio > p.getPrecio()) {
			
			estado = 1;
			
		}else if(this.precio == p.getPrecio()) {
			
			estado = 0;
		}
		
		return estado;
	}

	
}
