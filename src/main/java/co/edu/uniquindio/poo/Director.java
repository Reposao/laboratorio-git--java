package co.edu.uniquindio.poo;

public class Director {
    private String nombre;
	private String id;
	private int edad;

    public Director(){
    }
	
	
	public Director(String nombre , String id , int edad) {
		this.nombre = nombre;
		this.id = id;
		this.edad = edad;
		
		
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void mensajePrueba(){
		System.out.println("Hola");
    }
}


