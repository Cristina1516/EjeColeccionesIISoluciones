package HashMapEje04;

import java.util.HashMap;
import java.util.Scanner;

public class Elisa {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap();
	
		// 1º 
		 map.put("hola","Hola, ¿qué tal?");
	     map.put("encantado","Encantado de conocerte yo también");
	     map.put("adios","Adiós, espero volverte a ver pronto");
	     map.put("hora", "Los siento no llevo reloj");
	     map.put("nombre","Mi nombre es Eliza");
	     
	     String otra ="Lo siento, no te comprendo.";
	        
         System.out.println(" Conectado al sistema Eliza 0.0");
		 String frase;
		 Scanner sc = new Scanner(System.in);
		 boolean continuar = true; 
		 
		 do {
			// Leer un frase
			frase = sc.nextLine(); 
			// recorrer todas las claves y ver si alguna esta en la frase
			boolean hayrespuesta = false;
			for (String clave: map.keySet()) {
				if ( frase.toLowerCase().contains(clave)) {
					hayrespuesta = true;
					System.out.println(">"+map.get(clave));
					if (clave.equals("adios")) {
						continuar = false;
					}
				}
			}
			if ( !hayrespuesta) {
				System.out.println(otra);
			}
			 
			 
		 } while ( continuar);
		 
		 System.out.println(" Fin de conexión");
		 

	}

}
