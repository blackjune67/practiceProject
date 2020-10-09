package kr.co.june.eatgo.domain;

public class Restaurant {
    private final long id;
    private final String name;
    private final String address;



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
}
