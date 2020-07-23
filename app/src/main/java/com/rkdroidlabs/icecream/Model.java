package com.rkdroidlabs.icecream;

public class Model {

    String name, image ;

    public Model(){}

    public String getTitle() {
        return name;
    }

    public void setTitle(String title) {
        this.name = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
