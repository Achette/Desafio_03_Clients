package com.devsuperior.desafio3.desafio3_clientes.dto;

import com.devsuperior.desafio3.desafio3_clientes.entity.Client;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class ClientDTO {

    private Long id;
    @NotBlank(message = "Name field is required.")
    private String name;
    @NotBlank(message = "CPF field is required.")
    private String cpf;
    @Min(value = 1, message = "Income must be at least 1.00 or greater.")
    private Double income;
    @PastOrPresent(message = "Birth date can not be in the future.")
    private LocalDate birthDate;
    @Min(value = 0, message = "Children must be 0 or greater.")
    private Integer children;

    public ClientDTO() {
    }

    public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    public ClientDTO(Client entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.cpf = entity.getCpf();
        this.income = entity.getIncome();
        this.birthDate = entity.getBirthDate();
        this.children = entity.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}
