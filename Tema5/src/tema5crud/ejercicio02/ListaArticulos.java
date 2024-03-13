package tema5crud.ejercicio02;

/**
 * Clase que almacena array de objetos de la clase articulo
 */
public class ListaArticulos {
	static Articulo[] articulos = new Articulo[20];
	
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
		int i = 0;
		boolean borrado = false;
		int pos = buscaArt(selecArticulo);
		
		// si ha encontrado el objeto entonces
		if (pos != -1) {
			while(i < articulos.length && !borrado) {
				if (articulos[i].equals(selecArticulo)) {
					articulos[i] = null;
					borrado = true;
				}		
				i++;	
			}// while loop
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
	static boolean modificacion(int cod, Articulo art) {
		boolean modif = false;
		int i = 0;
		
		while(i < articulos.length && !modif) {
			
			if (articulos[i] != null && articulos[i].getCodigo() == cod) {
				articulos[i] = art;
				modif = true;
			}			
			i++;
		}
		
		return modif;
	}
	
	
}// calse
