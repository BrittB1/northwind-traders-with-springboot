package com.pluralsight.NorthwindTradersSpringBoot;

import com.pluralsight.Product;
import com.pluralsight.ProductDAO;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcProductDAO implements ProductDAO {
    @Override
    public void add(Product p) {

    }

    @Override
    public List<Product> getAll() {
        List<Product> p = new ArrayList<>();

        String sql = "SELECT * FROM products";

        try (Connection c = ds.getConnection();
             PreparedStatement ps = c.prepareStatement(sql);
             ResultSet r = ps.executeQuery()) {

            while (r.next()) {

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return p;
    }
}
