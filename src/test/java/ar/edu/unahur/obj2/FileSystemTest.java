package ar.edu.unahur.obj2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class FileSystemTest {
    @Test
    void dadaUnaCarpetaHacemosUnTestDePrueba() {
        assertTrue(Boolean.TRUE);
    }

    // Completar con tests
    @Test
    void testMostrarEstructura() {
        Archivo archivo1 = new Archivo("archivo1", "txt", 100);
        Archivo archivo2 = new Archivo("archivo2", "jpg", 200);
        Carpeta carpeta = new Carpeta("carpeta");
        carpeta.agregarElemento(archivo1);
        carpeta.agregarElemento(archivo2);
        FileSystem fs = new FileSystem(carpeta);
        fs.mostrar();
    }

    @Test
    void testArchivoMasPesado() {
        Archivo archivo1 = new Archivo("archivo1", "txt", 100);
        Archivo archivo2 = new Archivo("archivo2", "jpg", 200);
        Carpeta carpeta = new Carpeta("carpeta");
        carpeta.agregarElemento(archivo1);
        carpeta.agregarElemento(archivo2);
        FileSystem fs = new FileSystem(carpeta);
        Archivable archivoPesado = fs.archivoMasPesado();
        assertTrue(archivoPesado.nombre().equals("archivo2"));
    }

    @Test
    void nombreCarpeta(){
        Carpeta carpeta = new Carpeta("obj2");
        String nombreEsperado = "obj2";
        assertEquals(nombreEsperado, carpeta.nombre());
    }
}
