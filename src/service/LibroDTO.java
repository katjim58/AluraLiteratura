package com.hmskathia.challenger.alura.literatura.dto;



import com.hmskathia.challenger.alura.literatura.dto.models.Autor;


public record LibroDTO(int idLibro,
                       String titulo,
                       Autor autor,
                       String idioma,
                       int numeroDeDescargas
) {