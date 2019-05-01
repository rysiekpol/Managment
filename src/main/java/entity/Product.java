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

    @Override
    public String toString(){
        return "Product{" +
                "id=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", productCount=" + productCount +
                '}';
    }
}
