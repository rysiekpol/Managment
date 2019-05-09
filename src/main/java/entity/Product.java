package entity;

public class Product {
    private Long productId;
    private String productName;
    private float price;
    private float weight;
    private String color;
    private int productCount;

    public Product(Long productId, String productName, float price, float weight, String color, int productCount){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.weight = weight;
        this. color = color;
        this.productCount = productCount;
    }

    public final static String PRODUCT_SEPARATOR = "#";
    public final static char PRODUCT_TYPE = 'P';

    public Long getId(){
        return productId;
    }

    public String getProductName(){
        return productName;
    }

    public float getPrice(){
        return price;
    }

    public float getWeight(){
        return weight;
    }

    public String getColor(){
        return color;
    }

    public int getProductCount(){
        return productCount;
    }

    public void setPrice(int price){
        this.price =price;
    }

    public void setProductCount(int productCount){
        this.productCount = productCount;
    }

    protected String getBasicProductString() {
        return productId + PRODUCT_SEPARATOR + productName + PRODUCT_SEPARATOR + price + PRODUCT_SEPARATOR + weight + PRODUCT_SEPARATOR + color + PRODUCT_SEPARATOR + productCount;
    }

    @Override
    public String toString() {
        return PRODUCT_TYPE + PRODUCT_SEPARATOR + getBasicProductString();
    }
}
