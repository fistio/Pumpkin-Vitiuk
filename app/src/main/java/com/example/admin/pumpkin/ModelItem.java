package com.example.admin.pumpkin;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 01.02.2017.
 */
public class ModelItem {

    private String author;
    private int imgid;

    public ModelItem(String author, int imgid) {
        this.author = author;
        this.imgid = imgid;
    }

    public int getImgid(){
        return imgid;
    }
    public String getAuthor(){
        return author;
    }

    public static List<ModelItem> getFakeItems(){
        ArrayList<ModelItem> itemsList = new ArrayList<>();
        itemsList.add(new ModelItem("Pumpkin1", R.drawable.pumpkin2));
        itemsList.add(new ModelItem("Pumpkin2", R.drawable.pumpkin2));
        itemsList.add(new ModelItem("Pumpkin3", R.drawable.pumpkin2));
        itemsList.add(new ModelItem("Pumpkin4", R.drawable.pumpkin2));
        itemsList.add(new ModelItem("Pumpkin5", R.drawable.pumpkin2));
        itemsList.add(new ModelItem("Pumpkin6", R.drawable.pumpkin2));
        itemsList.add(new ModelItem("Pumpkin7", R.drawable.pumpkin2));
        itemsList.add(new ModelItem("Pumpkin8", R.drawable.pumpkin2));
        itemsList.add(new ModelItem("Pumpkin9", R.drawable.pumpkin2));
        itemsList.add(new ModelItem("Pumpkin10", R.drawable.pumpkin2));
        return  itemsList;
    }


}
