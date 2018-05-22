package com.test.testproject.data.remote.responses;

public class SearchResponse {

    private long itemId;

    private long pointId;

    private long shopId;

    private String itemImage;

    private String shopLogo;
    private float shopRank;

    private String shopName;

    private String itemName;
    private float itemPrice;

    public long getPointId() {
        return pointId;
    }

    public void setPointId(long pointId) {
        this.pointId = pointId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public long getShopId() {
        return shopId;
    }

    public void setShopId(long shopId) {
        this.shopId = shopId;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getItemImage() {
        return itemImage;
    }

    public void setItemImage(String itemImage) {
        this.itemImage = itemImage;
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

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }
}
