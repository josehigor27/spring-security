package br.com.springboot.security.model.Product;

public record ProductResponseDTO(String id, String name, Integer price) {
    public ProductResponseDTO(Product product){
        this(
                product.getId(), product.getName(), product.getPrice()

        );
    }
}
