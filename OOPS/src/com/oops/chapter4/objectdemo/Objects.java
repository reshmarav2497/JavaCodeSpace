package com.oops.chapter4.objectdemo;

public class Objects {
    int id;
    String name;

    Objects(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return "object{ id = " + id + ", name = " + name + " }";
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        //obj is currently of type Object so create one of type Objects to access fields
        Objects ob = (Objects)obj;
        return id == ob.id && name.equals(ob.name);
    }

    @Override
    public int hashCode(){
        return id*3 + name.hashCode();
    }

}
