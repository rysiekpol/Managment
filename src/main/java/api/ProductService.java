package api;

import entity.Product;

import java.io.IOException;
import java.util.List;

public interface ProductService {

    List<Product> getAllProducts() throws IOException;
    Integer getCountProducts() throws IOException;
    Product getProductByProductName(String productName) throws IOException;
    boolean isMoreProductThan0(String productName);
    boolean isProductByNameExisting(String productName);
    boolean isProductWithIdExisting(Long productId);
}
