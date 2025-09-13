package ar.edu.unahur.obj2;

public interface Archivable {
    String nombre();
    Integer tamano();
    void mostrar(Integer identacion);

    Archivable archivoMasPesado();

}
