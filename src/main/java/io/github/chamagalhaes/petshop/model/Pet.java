package io.github.chamagalhaes.petshop.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "pets")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é um campo obrigatório")
    @Size(min = 2, max = 50, message = "O nome deve conter entre 2 e 50 caracteres")
    @Column(name = "name", nullable = false)
    private String name;

    @NotBlank(message = "Espécie é um campo obrigatório")
    @Size(min = 2, max = 30, message = "A espécie deve conter entre 2 e 30 caracteres")
    @Column(name = "especie", nullable = false)
    private String especie;

    @NotNull(message = "Informe uma idade válida")
    @Min(value = 0, message = "A idade não pode ser negativa")
    @Column(name = "idade", nullable = false)
    private Integer idade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}