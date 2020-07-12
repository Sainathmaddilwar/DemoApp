package com.example.demoapp.models;



public class Child_Object {

    String name,tag;
    Integer image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getImage() {
        return image;
    }

    public void setImageUrl(Integer image) {
        this.image = image;
    }

    public Child_Object(String name, String tag, Integer image) {
        this.name = name;
        this.tag = tag;
        this.image = image;
    }
}
