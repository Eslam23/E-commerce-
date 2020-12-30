package com.example.ecommerceapp.model;

import android.graphics.drawable.Drawable;

public class prevOrder {
    int image;
    String name;
    String quntity;
    String price;
    String add;
    int color;
    String decs;
    String manfactoringDet;

    public prevOrder(int image, String name, String quntity, String price) {
        this.image = image;
        this.name = name;
        this.quntity = quntity;
        this.price = price;
    }

    public prevOrder(int image, String name, String quntity, String price, int color) {
        this.image = image;
        this.name = name;
        this.quntity = quntity;
        this.price = price;
        this.color = color;
    }

    public prevOrder(int image, String name, String quntity, String price, int color, String decs, String manfactoringDet) {
        this.image = image;
        this.name = name;
        this.quntity = quntity;
        this.price = price;
        this.color = color;
        this.decs = decs;
        this.manfactoringDet = manfactoringDet;
    }

    public String getDecs() {
        return decs;
    }

    public void setDecs(String decs) {
        this.decs = decs;
    }

    public String getManfactoringDet() {
        return manfactoringDet;
    }

    public void setManfactoringDet(String manfactoringDet) {
        this.manfactoringDet = manfactoringDet;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuntity() {
        return quntity;
    }

    public void setQuntity(String quntity) {
        this.quntity = quntity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
