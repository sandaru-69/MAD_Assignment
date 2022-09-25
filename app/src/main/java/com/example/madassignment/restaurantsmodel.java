package com.example.madassignment;

public class restaurantsmodel {

    int image;
    String name;
    String time;
    String rate;
    String price;
    String type;

    public restaurantsmodel(int image, String name, String time, String rate, String price) {
        this.image = image;
        this.name = name;
        this.time = time;
        this.rate = rate;
        this.price = price;
    }

    public restaurantsmodel(int image, String name, String time, String rate, String price, String type) {
        this.image = image;
        this.name = name;
        this.time = time;
        this.rate = rate;
        this.price = price;
        this.type = type;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
