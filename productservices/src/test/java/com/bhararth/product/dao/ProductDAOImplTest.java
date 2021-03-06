package com.bhararth.product.dao;

import com.bharath.product.dto.Product;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductDAOImplTest {

    @Test
    public void createShouldCreateAProduct() {
        ProductDAO dao = new ProductDAOImpl();
        Product product = new Product();
        product.setId(1);
        product.setName("IPhone");
        product.setDescription("It's awesome");
        product.setPrice(800);
        dao.create(product);
        Product result = dao.read(1);

        assertNotNull(result);
        assertEquals("IPhone",result.getName());

    }

    @Test
    public void read() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }
}