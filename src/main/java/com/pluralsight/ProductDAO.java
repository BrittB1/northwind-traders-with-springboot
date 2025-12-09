package com.pluralsight;

import java.util.List;

public interface ProductDAO {

    void add (Product p);
    List<Product> getAll();
}
