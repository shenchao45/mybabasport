package com.shenchao.entity;

/**
 * Created by shenchao on 2017/2/7.
 */
public class City {
    private int id;
    private String state;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City() {

    }

    public City(int id, String state, String name) {

        this.id = id;
        this.state = state;
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", state='" + state + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
