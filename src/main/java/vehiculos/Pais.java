package vehiculos;

import java.util.HashMap;

public class Pais {
	private String nombre;

	private static HashMap<String, Integer> cuentaPaises = new HashMap<String, Integer>();

	public Pais(String nombre){
		this.nombre = nombre;
	}

	public static void registrarPais(String nomPais){
		if (cuentaPaises.containsKey(nomPais)) {

			int nuevoValor = cuentaPaises.get(nomPais) + 1;
			cuentaPaises.put(nomPais, nuevoValor);

		} else {
			
			cuentaPaises.put(nomPais, 1);

		}
	}

	public static Pais paisMasVendedor(){
		String maxPais = "";
		int max = -1;
		
		for (String pais : cuentaPaises.keySet()) {
			if (cuentaPaises.get(pais) > max) {
				max = cuentaPaises.get(pais);
				maxPais = pais;
			}
		}

		return new Pais(maxPais);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
