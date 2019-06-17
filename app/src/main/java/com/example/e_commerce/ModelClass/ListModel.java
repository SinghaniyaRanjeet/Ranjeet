package com.example.e_commerce.ModelClass;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class ListModel implements Serializable {

    private int image;
    private String name;
    private String price;

    public ListModel(int image, String name, String price) {
        this.image = image;
        this.name = name;
        this.price = price;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @NonNull
    @Override
    public String toString() {
        return"ListModels{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", image=" + image +
                '}';
    }
}
