package ar.edu.unahur.obj2;

public class Archivo implements Archivable {
    private String nombre;
    private String extension;
    private Integer tamano;

    public Archivo(String nombre, String extension, Integer tamano) {
        this.nombre = nombre;
        this.extension = extension;
        this.tamano = tamano;
    }

    @Override
    public String nombre() {
        return nombre;
    }

    @Override
    public Integer tamano() {
        return tamano;
    }
    
    @Override
    public void mostrar(Integer identacion) {
        String espacios = " ".repeat(identacion);
        System.out.println(espacios + "- " + nombre + " (" + tamano + " KB)");
    }

    @Override
    public Archivable archivoMasPesado() {
        return this;
    }

}
