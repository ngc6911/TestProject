package com.test.testproject.presentation.model;

public class RecordModel {

    private long itemId;
    private long pointId;
    private long shopId;
    private String productName;
    private String shopName;
    private String shopLogo;
    private String productImage;
    private float shopRank;
    private float price;

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public long getPointId() {
        return pointId;
    }

    public void setPointId(long pointId) {
        this.pointId = pointId;
    }

    public long getShopId() {
        return shopId;
    }

    public void setShopId(long shopId) {
        this.shopId = shopId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopLogo() {
        return shopLogo;
    }

    public void setShopLogo(String shopLogo) {
        this.shopLogo = shopLogo;
    }

    public float getShopRank() {
        return shopRank;
    }

    public void setShopRank(float shopRank) {
        this.shopRank = shopRank;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
