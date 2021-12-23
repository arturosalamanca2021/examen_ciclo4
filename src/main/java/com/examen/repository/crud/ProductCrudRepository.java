package com.examen.repository.crud;

import com.examen.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ProductCrudRepository extends MongoRepository<Product, Integer> {
    public List<Product> findByDescriptionContainingIgnoreCase(String description);
    public List<Product> findByPriceLessThanEqual(Double price);
    public Optional<Product> findByReference(String ref);
}
