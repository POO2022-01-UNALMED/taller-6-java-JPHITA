package vehiculos;

import java.util.HashMap;

public class Fabricante {
	private String nombre;
	private Pais pais;

	private static HashMap<String, Integer> cuentaFabricas = new HashMap<String, Integer>();

	public Fabricante(String nombre, Pais pais){
		this.nombre = nombre;
		this.pais = pais;
	}

	private Fabricante(String nombre){
		this.nombre = nombre;
		this.pais = null;
	}

	public static void registrarFabrica(String nomFabrica){
		if (cuentaFabricas.containsKey(nomFabrica)) {
			
			int nuevoValor = cuentaFabricas.get(nomFabrica) + 1;
			cuentaFabricas.put(nomFabrica, nuevoValor);

		} else {

			cuentaFabricas.put(nomFabrica, 1);
			
		}
	}

	public static Fabricante fabricaMayorVentas(){
		int max = -1;
		String maxFabrica = "";
		
		for (String fabrica : cuentaFabricas.keySet()) {
			if (cuentaFabricas.get(fabrica) > max) {
				max = cuentaFabricas.get(fabrica);
				maxFabrica = fabrica;
			}
		}

		return new Fabricante(maxFabrica);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
}
