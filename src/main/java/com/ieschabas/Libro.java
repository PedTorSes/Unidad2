package com.ieschabas;

public class Libro {
    /**
     *Establecemos las variables privadas de esta clase
     */
    private String titulo;
    private String autor;
    private int paginas;

    // Constructores

    /**
     * Establecemos los parámetros de al clase libro:
     *
     * @param titulo
     * @param autor
     * @param paginas
     */
    public Libro(String titulo, String autor, int paginas) {

        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    //Mostrar información:
    /**
     * Con este código trataremos de mostrar por la pantalla de Main los parámetros anteriores
     */
public void mostrarInformacion () {
    System.out.println("El libro mencionado es " + titulo + " cuyo autor es " + autor + " y contiene " + paginas + " páginas");


}
}
