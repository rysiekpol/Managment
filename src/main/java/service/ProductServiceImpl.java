package service;

import api.ProductDao;
import api.ProductService;
import dao.ProductDaoImpl;
import entity.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {

    private static ProductServiceImpl instance = null;
    private ProductDao productDao = new ProductDaoImpl("products.data", "PRODUCT");

    private ProductServiceImpl(){

    }

    public static ProductServiceImpl getInstance() {
        if (instance == null) {
            instance = new ProductServiceImpl();
        }
        return instance;
    }

    List<Product> products;

    public ProductServiceImpl(List<Product> products) {
        this.products = products;
    }
    public List<Product> getAllProducts() throws IOException {
        return products;
    }
    public Integer getCountProducts() throws IOException{
        return products.size();
    }
    public Product getProductByProductName(String productName) throws IOException{
        for(Product product:products){
            if(product.getProductName() == productName){
                return product;
            }
        }
        return null;
    }

    public boolean isMoreProductThan0(String productName) {
        for (Product product : products){
            if (isProductByNameExisting(productName) && product.getProductCount() > 0) {
                return true;
            }
        }
        return false;
    }

    public boolean isProductByNameExisting(String productName){
        for(Product product: products){
            if(product.getProductName().equals(productName)){
                return true;
            }
        }
        return false;
    }

    public boolean isProductWithIdExisting(Long productId){
        for(Product product: products){
            if(product.getId().equals(productId)){
                return true;
            }
        }
        return false;
    }
}
