package com.example.recyclerviewonclicklistener;

public class DataList {

    String name;
    String descripton;

    public DataList() {
    }

    public DataList(String name, String descripton) {
        this.name = name;
        this.descripton = descripton;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripton() {
        return descripton;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }
}
