package br.com.walljobs.nunessports.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.walljobs.nunessports.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
