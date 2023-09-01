package co.edu.udsitrital.model;

public class Persona {
	public String nombre;
	public int edad;

	public Persona(String nombre, int edad) {
		this.edad = edad;
		this.nombre = nombre;
	}

	public String toString() {

		return "Nombre: " + nombre + "\nEdad: " + edad;

	}

	public boolean nombresIguales(Persona x) {

		if (nombre.equals(x.nombre)) {

			return true;
		} else {

			return false;
		}

	}

	public String esMayor(Persona x) {

		if (edad > x.edad) {
			return "Es mayor";
		} else if (edad == x.edad) {
			return "Es igual";

		} else {
			return "Es menor";
		}

	}

	public void Saludar() {
		System.out.println("Hola a todos");

	}

	public void Saludar(Persona x) {

		System.out.println("Hola " + x.nombre);

	}
	public void Cualletraesmayor(Persona x) {
		
		char ultimaletra1 = nombre.charAt(nombre.length() - 1);
        char ultimaletra2 = x.nombre.charAt(x.nombre.length() - 1);
        
        if (ultimaletra1 < ultimaletra2) {
            System.out.println("'" + ultimaletra1 + "' está antes en el abecedario que '" + ultimaletra2 + "'");
        } else if (ultimaletra2 < ultimaletra1) {
            System.out.println("'" + ultimaletra2 + "' está antes en el abecedario que '" + ultimaletra1 + "'");
        } else {
            System.out.println("Ambas letras son iguales en el abecedario: '" + ultimaletra1 + "'");
        }
    }
		
		
		
		
	}
	
	

