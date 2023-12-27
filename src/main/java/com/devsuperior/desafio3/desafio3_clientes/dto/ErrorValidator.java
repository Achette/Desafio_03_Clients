package com.devsuperior.desafio3.desafio3_clientes.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ErrorValidator extends DefaultError {
    private List<FieldMessage> errors = new ArrayList<>();


    public ErrorValidator(Instant timestamp, Integer status, String error, String path) {
        super(timestamp, status, error, path);
    }

    public List<FieldMessage> getErrors() {
        return errors;
    }

    public void addError(String fieldName, String message) {
        errors.add(new FieldMessage(fieldName, message));
    }
}
