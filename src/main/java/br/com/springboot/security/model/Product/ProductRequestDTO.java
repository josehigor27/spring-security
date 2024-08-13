package br.com.springboot.security.model.Product;

import jakarta.validation.constraints.NotBlank;

public record ProductRequestDTO(
        @NotBlank
        String name,
        @NotBlank
        Integer price
) {
}
