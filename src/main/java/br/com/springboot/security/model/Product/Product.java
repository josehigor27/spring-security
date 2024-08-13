package br.com.springboot.security.model.Product;


import jakarta.persistence.*;

@Entity (name = "product")
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private Integer price;

    public Product(ProductRequestDTO requestDTO) {
        this.name = requestDTO.name();
        this.price = requestDTO.price();
    }

    public Product(){

    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }
}
