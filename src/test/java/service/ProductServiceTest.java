package service;

import entity.Boots;
import entity.Cloth;
import entity.Product;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceTest {

    @Test
    public void testGetAllProductsPositive(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Cloth(1l, "T-SHIRT", 25.99f, 0.7f, "green", 20, "M", "cotton" ));
        products.add(new Boots(1l, "T-SHIRT", 25.99f, 0.7f, "green", 20, 43, true ));
        ProductServiceImpl productService = new ProductServiceImpl(products);
        List<Product> productsFromTestClass = productService.getAllProducts();
        Assert.assertEquals(products, productsFromTestClass);


    }

    @Test
    public void testGetAllProductsNegative(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Cloth(1l, "T-SHIRT", 25.99f, 0.7f, "green", 20, "M", "cotton" ));
        products.add(new Boots(2l, "Boots", 59.99f, 1.3f, "black", 15, 43, true ));
        ProductServiceImpl productService = new ProductServiceImpl(new ArrayList<Product>(products));

        products.add(new Cloth(3l, "Bluza", 44.f, 0.f, "White", 3, "S", "COTTON"));
        List<Product> productsFromTestClass = productService.getAllProducts();

        Assert.assertNotEquals(products, productsFromTestClass);
    }

    @Test
    public void testGetCountProductPositive(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Cloth(1l, "T-SHIRT", 25.99f, 0.7f, "green", 20, "M", "cotton" ));
        products.add(new Boots(1l, "T-SHIRT", 25.99f, 0.7f, "green", 20, 43, true ));
        ProductServiceImpl productService = new ProductServiceImpl(products);
        final int result = productService.getCountProducts();

        Assert.assertEquals(2, result);
    }

    @Test
    public void testGetCountProductWithoutProducts() {
        ProductServiceImpl productService = new ProductServiceImpl();
        final int result = productService.getCountProducts();

        Assert.assertEquals(0, result);
    }

    @Test
    public void testGetProductByProductNameExist(){
        List<Product> products = new ArrayList<Product>();
        Product cloth = new Cloth(1l, "T-SHIRT", 25.99f, 0.7f, "green", 20, "M", "cotton" );
        products.add(cloth);
        products.add(new Boots(2l, "Boots", 59.99f, 1.3f, "black", 15, 43, true ));
        ProductServiceImpl productService = new ProductServiceImpl(products);
        final Product product = productService.getProductByProductName("T-SHIRT");
        Assert.assertEquals(cloth, product);

    }


    @Test
    public void testGetProductByProductNameNotExist() {
        List<Product> products = new ArrayList<Product>();
        Product cloth = new Cloth(1l, "T-SHIRT", 25.99f, 0.7f, "green", 20, "M", "cotton");
        products.add(cloth);
        products.add(new Boots(2l, "Boots", 59.99f, 1.3f, "black", 15, 43, true));
        ProductServiceImpl productService = new ProductServiceImpl(products);
        final Product product = productService.getProductByProductName("JAKIS-PRODUKT");
        Assert.assertEquals(null, product);
    }

    @Test
    public void testIsMoreProductsThan0(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Boots(2l, "Boots", 35.0f, 0.3f, "Black", 4, 38, true));

        ProductServiceImpl productService = new ProductServiceImpl(products);
        final boolean isProductOnWareHouse = productService.isMoreProductThan0("Boots");

        Assert.assertTrue(isProductOnWareHouse);
    }

    @Test
    public void testEqualProducts0() {
        List<Product> products = new ArrayList<Product>();
        products.add(new Boots(2l, "Boots", 35.0f, 0.3f, "Black", 0, 38, true));

        ProductServiceImpl productService = new ProductServiceImpl(products);
        final boolean isProductOnWareHouse = productService.isMoreProductThan0("Boots");

        Assert.assertFalse(isProductOnWareHouse);
    }

    @Test
    public void testIsProductByNameExisting(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Boots(2l, "Boots", 35.0f, 0.3f, "Black", 0, 38, true));

        ProductServiceImpl productService = new ProductServiceImpl(products);
        final boolean isProductByNameExisting = productService.isProductByNameExisting("Boots");

        Assert.assertTrue(isProductByNameExisting);
    }

    @Test
    public void testIsProductByNameNotExisting() {
        List<Product> products = new ArrayList<Product>();
        products.add(new Boots(2l, "Boots", 35.0f, 0.3f, "Black", 0, 38, true));

        ProductServiceImpl productService = new ProductServiceImpl(products);
        final boolean isProductByNameExisting = productService.isProductByNameExisting("InnyProdukt");

        Assert.assertFalse(isProductByNameExisting);
    }

    @Test
    public void isProductWithIdExisting(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Boots(2l, "Boots", 35.0f, 0.3f, "Black", 0, 38, true));

        ProductServiceImpl productService = new ProductServiceImpl(products);
        final boolean isProductWithIdExisting = productService.isProductWithIdExisting(2l);

        Assert.assertTrue(isProductWithIdExisting);
    }
    @Test
    public void isProductWithIdNotExisting() {
        List<Product> products = new ArrayList<Product>();
        products.add(new Boots(2l, "Boots", 35.0f, 0.3f, "Black", 0, 38, true));

        ProductServiceImpl productService = new ProductServiceImpl(products);
        final boolean isProductWithIdExisting = productService.isProductWithIdExisting(7l);

        Assert.assertFalse(isProductWithIdExisting);
    }
}
