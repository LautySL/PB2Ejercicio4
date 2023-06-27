package ar.edu.unlam.pbii.grupo03;

import java.util.ArrayList;
import java.util.HashSet;

public class Empresa {
	private String nombre;
	private Integer cantidadDePersonasVinculadas;
	private HashSet <Persona> personas;
	private ArrayList <Producto> productos;

	public Empresa(String nombre) {

		this.nombre = nombre;
		this.cantidadDePersonasVinculadas = 0;
		this.personas = new HashSet<>();
		this.productos = new ArrayList<Producto>();
	}

	public Integer getCantidadDePersonasVinculadas() {
		return cantidadDePersonasVinculadas;
	}

	public void vincularPersona(Persona persona) {
		if (this.personas.add(persona))
			cantidadDePersonasVinculadas++;

	}

	public Boolean agregarProducto(Producto aVender) {

		return productos.add(aVender);

	}

	public Boolean registrarCompra(Persona comprador, Producto producto) throws ConflictoDeInteresesException, ProductoNoEncontradoException {
		if (comprador instanceof Empleado)
			producto.setPrecio(producto.getPrecio()*0.80);
		else if (comprador instanceof Director)
			throw new ConflictoDeInteresesException();
		else if(!this.productos.contains(producto))
			throw new ProductoNoEncontradoException();
		
		return comprador.agregarCompra(producto);
	}

}
