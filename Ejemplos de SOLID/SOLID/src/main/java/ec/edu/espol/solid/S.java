package ec.edu.espol.solid;

public class S {
    
    /* CODIGO QUE VIOLA EL PRINCIPIO
    
    class ArtículoRevista {

    private String nombreArtículo;
    private String nombreRevista;
    private String seccionRevista;
    private String[] autores;
    private String[] fuentes;
    
    void agregarImagen(){ }
    void eliminarImagen(){ }
    void editarTexto(){ }
    void editarFondo(){ }
    
    // constructores, getters y setters

    }
    
    */
    
    
    
    class ArtículoRevista { //La clase solo almacena la información del artículo

        private String nombreArtículo;
        private String nombreRevista;
        private String seccionRevista;
        private String[] autores;
        private String[] fuentes;
    
        // constructores, getters y setters

    }
   
    class SoftwareDeEdicion { //Se crea una clase que SOLO se encargue de 
        //la edición del articulo
        
        void agregarImagen(){ }
        void eliminarImagen(){ }
        void editarTexto(){ }
        void editarFondo(){ }
    }
    
    
    
}
