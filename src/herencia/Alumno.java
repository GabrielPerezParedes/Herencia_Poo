package herencia;

public class Alumno extends Persona {
	
	private int codigodelestudiante;
	private int notafinal;
	
	public Alumno (String nombre, String apellido, int edad, int codigodelestudiante, int notafinal) {
		
		super(nombre, apellido, edad);
		
		this.codigodelestudiante = codigodelestudiante;
		this.notafinal = notafinal;
	}

	public void mostrar() {
		
		System.out.println("Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + getEdad() + "\nCodigo:" + codigodelestudiante + "\nNota Final:" + notafinal); 
	}
} 
