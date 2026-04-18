package HashMapEje01;
/**
 * Lista de libros usando arrays
 */
public class ListaLibrosConArray
{
    private Libro[] libros;
    private int numLibros;

    // tamaño máximo de la biblioteca
    private static final int MAX = 100;

    public ListaLibrosConArray()
    {
        libros = new Libro[MAX];
        numLibros = 0;
    }

    // Añadir libro al final
    public void pon(Libro valor){
        if (numLibros < MAX) {
            libros[numLibros] = valor;
            numLibros++;
        }
    }

    public boolean estaVacia(){
        return numLibros == 0;
    }

    // Buscar ID por título
    public int buscarId(String titulo){
        for (int i = 0; i < numLibros; i++) {
            if (libros[i].titulo.trim().equalsIgnoreCase(titulo.trim())) {
                return libros[i].id;
            }
        }
        return -1;
    }

    // Quitar libro por ID y devolverlo
    public Libro quitar(int id){
        for (int i = 0; i < numLibros; i++) {
            if (libros[i].id == id) {
                Libro eliminado = libros[i];

                // desplazamos a la izquierda
                for (int j = i; j < numLibros - 1; j++) {
                    libros[j] = libros[j + 1];
                }

                libros[numLibros - 1] = null;
                numLibros--;

                return eliminado;
            }
        }
        return null;
    }

    // Mostrar catálogo
    public void verCatalogo(){
        if (numLibros == 0) {
            System.out.println(" (Vacío)");
            return;
        }

        for (int i = 0; i < numLibros; i++) {
            System.out.println(libros[i]);
        }
    }
}
