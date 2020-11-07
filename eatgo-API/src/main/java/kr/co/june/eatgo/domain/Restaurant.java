package kr.co.june.eatgo.domain;

import ch.qos.logback.core.BasicStatusManager;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private final long id;
    private final String name;
    private final String address;
    private List<MenuItem> menuItems = new ArrayList<>();


    public Restaurant(long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }


    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }

    /*public String getEmail() {
        return email;
    } */

    public String getInformation() {
        return name + " in " + address;
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public List<MenuItem> getAddMenuItmes() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        for(MenuItem menuItem : menuItems) {
            addMenuItem(menuItem);
        }
    }
}
