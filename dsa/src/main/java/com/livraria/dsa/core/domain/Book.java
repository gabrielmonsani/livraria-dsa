package com.livraria.dsa.core.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@DiscriminatorValue("LIVRO")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book extends Material {

    private int isbn;


    public Book(String titulo, int ano, int totalExemplares, int exemplaresDisponiveis, Author autor, Publisher editora, int isbn) {
        super(titulo, ano, totalExemplares, exemplaresDisponiveis, autor, editora);
        this.isbn = isbn;
    }
}
