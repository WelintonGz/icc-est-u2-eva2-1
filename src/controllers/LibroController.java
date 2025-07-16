package controllers;

import java.util.*;
import models.Book;

public class LibroController {

    public Set<Book> procesarLibros(List<Book> libros) {
        Comparator<Book> comparator = Comparator.comparing(Book::getTitulo, Comparator.reverseOrder()).thenComparingInt(Book::getAnio);

        Set<Book> ordenados = new TreeSet<>(comparator);
        ordenados.addAll(libros);

        return ordenados;
    }
}
