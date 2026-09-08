package com.mit.dao;

import com.mit.pojo.Product;
import java.util.Optional;
import com.mit.pojo.Product;

public interface ProductDao {
    boolean save(Product p);

    Optional<Product> findByCode(int code);

    List<Product> listAll();

    List<Product> findByPriceRange(double min.double max);

    boolean delete(int code);

}
