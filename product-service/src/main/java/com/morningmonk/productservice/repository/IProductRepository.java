package com.morningmonk.productservice.repository;

import com.morningmonk.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IProductRepository extends MongoRepository<Product,String>
{

}
