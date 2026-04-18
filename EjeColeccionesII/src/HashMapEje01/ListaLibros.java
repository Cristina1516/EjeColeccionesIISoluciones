package HashMapEje01;

/**
 * Lista de libro de una biblioteca
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaLibros
{
   
    Libro primero;

    /**
     * Constructor for objects of class ListaNodos
     */
    public ListaLibros()
    {
        primero = null;
    }

   
    // Completar los metodos
    
    // Incluye un nuevo libro en la lista
    public void pon( Libro valor){
    	 	valor.siguiente = primero;
        primero = valor;
    }
    
    public boolean estaVacia(){
       return ( primero == null );    
        
    }
    
    // Devuelve un libro que es eliminado de la lista o null si no exite
    public Libro quitar ( int id ) {
    	Libro actual = primero;
        Libro anterior = null;

        while (actual != null) {
            if (actual.id == id) {
                if (anterior == null) {
                    // es el primero
                    primero = actual.siguiente;
                } else {
                    anterior.siguiente = actual.siguiente;
                }
                actual.siguiente = null;
                return actual;
            }
            anterior = actual;
            actual = actual.siguiente;
        }
        return null; // no se encuentra el libro
    }
   
    // Devuelve el id del libro o -1 si no esta
    public int buscarId ( String titulo ){
    	 Libro actual = primero;

         while (actual != null) {
             if (actual.titulo.trim().equalsIgnoreCase(titulo.trim())) {
                 return actual.id;
             }
             actual = actual.siguiente;
         }
         return -1;
   }
    // Muestra los libros almacenados
    public void verCatalogo (){
    	Libro actual = primero;

        if (actual == null) {
            System.out.println(" (Vacío)");
            return;
        }

        while (actual != null) {
            System.out.println(actual.toString());
            actual = actual.siguiente;
        }
    }
         
    

}
