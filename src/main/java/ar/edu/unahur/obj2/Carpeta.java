package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

public class Carpeta implements Archivable {
    private String nombre;
    private List<Archivable> elementos = new ArrayList<>();

    public Carpeta(String nombre) {
        this.nombre = nombre;
    }

    public void agregarElemento(Archivable elemento) {
        elementos.add(elemento);
    }

    @Override
    public String nombre() {
        return nombre;
    }

    @Override
    public Integer tamano() {
        return elementos.stream().mapToInt(a -> a.tamano()).sum();
    }

    @Override
    public void mostrar(Integer identacion) {
        String espacios = " ".repeat(identacion);
        System.out.println(espacios + "+ " + nombre + " (" + tamano() + " KB)");
        for (Archivable elemento : elementos) {
            elemento.mostrar(identacion + 2);
        }
    }

    @Override
    public Archivable archivoMasPesado() {
        return elementos.stream()
                .map(a -> a.archivoMasPesado())
                .max((a, b) -> a.tamano().compareTo(b.tamano()))
                .orElse(null);
    }

}
