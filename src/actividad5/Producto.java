package actividad5;

public class Producto {

	private String nombre;
	private String descripcion;
	private String categoria;
	private Float precio;
	
	public Producto () {
		
	}
	
	public Producto (String nombre, String descripcion, String categoria, Float precio) {
		
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.precio = precio;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	//ya me perdí así que mejor lo dejo en borrador
	
	//@Override
    //public String toString() {
    //    return "Producto{" + "nombre=" + nombre +  ", descripcion=" + descripcion + ", categoria=" + categoria + ", precio=" + precio + '}';
    //}
    
   // public float calcular(int cantidad_producto){
        
      //  float fin = precio * cantidad_producto;
      //  setPrecio(fin);
      //  return fin;
   // }
}
