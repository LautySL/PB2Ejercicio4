package ar.edu.unlam.pbii.grupo03;

public class ProductoNoEncontradoException extends Exception {
	public ProductoNoEncontradoException() {
		super("Producto incorrecto");
	}
}
