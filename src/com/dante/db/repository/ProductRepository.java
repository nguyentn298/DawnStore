package com.dante.db.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.dante.db.entity.Product;

public interface ProductRepository extends ProductCustomRepository, CrudRepository<Product, Integer> {

	@Query("FROM Product product WHERE productId = ?")
	public Product findByProductId(int productId);
}
