package ar.edu.unlam.pbii.grupo03;

public class Director extends Persona {
	private String patenteCorporativa;
	
	public Director(Integer dni, String nombre, String patenteCorporativa) {
		setDni(dni);
		setNombre(nombre);
		this.patenteCorporativa=patenteCorporativa;
		
	}

	public String getPatenteCorporativa() {
		return patenteCorporativa;
	}

}
