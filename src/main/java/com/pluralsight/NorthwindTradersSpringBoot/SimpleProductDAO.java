package com.pluralsight.NorthwindTradersSpringBoot;

import com.pluralsight.Product;
import com.pluralsight.ProductDAO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleProductDAO implements ProductDAO {
    private List <Product> products;

    public SimpleProductDAO() {
        this.products = new ArrayList<>();

        products.add(new Product(1,"Espresso Machine","Appliances",500.00));
        products.add(new Product(2,"Oven mitts","Kitchen",15.00));
        products.add(new Product(3,"Fancy Coffee Mug","Kitchen",20.00));
    }

    @Override
    public void add(Product p) {
        products.add(p);
    }

    @Override
    public List<Product> getAll() {
        return products;
    }
}
