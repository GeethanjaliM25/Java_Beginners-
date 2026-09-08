package com.mit.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.mit.pojo.Product;

public class ProductDaoImpl implements ProductDao {

    private List<Product> products;

    public ProductDaoImpl() {
        products = new ArrayList<Product>();
    }

    @Override
    public boolean save(Product p) {
        products.add(p);
        return true;
    }

    @Override
    public Optional<Product> findByCode(int code) {
        for (Product p : products) {
            if (p.getCode() == code) {
                return Optional.ofNullable(p);
            }
        }

        return Optional.empty();
    }

    @Override
    public List<Product> listAll() {
        return products;
    }

    @Override
    public List<Product> findByPriceRange(double min, double max) {
        List<Product> list = new ArrayList<Product>();

        for (Product p : products) {
            if (p.getPrice() >= min && p.getPrice() <= max) {
                list.add(p);
            }
        }

        return list;
    }

    @Override
    public boolean delete(int code) {
        for (Product p : products) {
            if (p.getCode() == code) {
                products.remove(p);
                return true;
            }
        }

        return false;
    }
}
