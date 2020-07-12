package com.example.demoapp.models;

import java.util.ArrayList;
import java.util.List;

public class parent_Object {
    String Title;
    ArrayList<Child_Object> child_objects;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public List<Child_Object> getChild_objects() {
        return child_objects;
    }

    public void setChild_objects(ArrayList<Child_Object> child_objects) {
        this.child_objects = child_objects;
    }

    public parent_Object(String title, ArrayList<Child_Object> child_objects) {
        Title = title;
        this.child_objects = child_objects;
    }
}
