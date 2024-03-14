package tema5crud.ejercicio02;

/**
 * Clase que almacena array de objetos de la clase articulo
 */
public class ListaArticulos {
	static Articulo[] articulos = new Articulo[20];
	
	
	
	
	
	
	
	static void listado() {
		int i = 0;
		while (i < articulos.length && articulos[i] != null) {
			System.out.println(articulos[i]);
			i++;
		}
	}
	
	
	
	/**
	 * Metodo para dar de alta un nuevo artículo
	 * @param nuevoArticulo
	 * @return
	 */
	static boolean alta(Articulo nuevoArticulo) {
		int i = 0;
		boolean anyadido = false;
		int pos = buscaArt(nuevoArticulo);
		
		// si no hay el articulo en la lista lo añadimos en el primer hueco disponible
		if (pos == -1) {
			while(i < articulos.length && !anyadido) {
				if (articulos[i] == null) {
					articulos[i] = nuevoArticulo;
					anyadido = true;
				}
				
				i++;
			}
		}
		return anyadido;
	}// fin alta
	
	//
	static boolean baja(Articulo selecArticulo) {
		boolean borrado = false;
		int pos = buscaArt(selecArticulo);
		
		// si ha encontrado el objeto entonces
		if (pos != -1) {
			articulos[pos] = null;
			borrado = true;
		}	
		return borrado;		
	}// fin baja
	
	//
	static int buscaArt(Articulo art) {
		int pos = -1;
		int i = 0;
		
		while(i < articulos.length && pos == -1) {
			if (articulos[i] != null && articulos[i].equals(art)) {
				pos = i;
			}
			
			i++;
		}
		
		return pos;
	}
	
	
	
	//MOdi
	static boolean modificacion(Articulo oldArt, Articulo art) {
		boolean modif = false;
		int i = 0;
		
		while(i < articulos.length && !modif) {
			
			if (articulos[i] != null && articulos[i].equals(oldArt)) {
				articulos[i] = art;
				modif = true;
			}			
			i++;
		}
		
		return modif;
	}
	
	//
	static boolean rellenaM(int cantidad, Articulo art) {
		boolean rellenado = false;
		int pos = buscaArt(art);
		
		if (pos != -1) {
			articulos[pos].setStock(articulos[pos].getStock()+cantidad);
			rellenado = true;
		}
		
		return rellenado;
	}
	
	//
	//
	static boolean vaciaM(int cantidad, Articulo art) {
		boolean vaciado = false;
		int pos = buscaArt(art);
		
		if (pos != -1) {
			articulos[pos].setStock(articulos[pos].getStock()-cantidad);
			vaciado = true;
		}
		
		return vaciado;
	}
	 
	
	
}// calse
