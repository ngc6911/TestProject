package com.test.testproject.data.local.db.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.graphics.Bitmap;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(primaryKeys = {"item_id", "point_id", "shop_id"}, tableName = "records")
public class RecordEntity {

    @ColumnInfo(name = "item_id")
    private long itemId;

    @ColumnInfo(name = "point_id")
    private long pointId;

    @ColumnInfo(name = "shop_id")
    private long shopId;

    @ColumnInfo(name = "product_name")
    private String productName;

    @ColumnInfo(name = "product_image")
    private String productImage;

    @ColumnInfo(name = "price")
    private float price;

    @ColumnInfo(name = "shop_name")
    private String shopName;

    @ColumnInfo(name = "shop_logo")
    private String shopLogo;

    @ColumnInfo(name = "shop_rank")
    private float shopRank;

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

    public long getPointId() {
        return pointId;
    }

    public void setPointId(long pointId) {
        this.pointId = pointId;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}