package ar.edu.unahur.obj2;

public class FileSystem {
    private final Archivable raiz;

    public FileSystem(Archivable raiz) {
        this.raiz = raiz;
    }

    public void mostrar() {
        raiz.mostrar(0);
    }

    public Archivable archivoMasPesado() {
        return raiz.archivoMasPesado();
    }
}
