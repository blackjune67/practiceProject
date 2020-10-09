package kr.co.june.eatgo.domain;

public class Restaurant {
    private final String name;
    private String email;
    //private String email = "111111";
    //private final String storeName;
    //private final String region;
    private final String address;


    public Restaurant(String name, String address) {
        this.name = name;
        //this.email = email;
        //this.storeName = storeName;
        //this.region = region;\
        this.address = address;
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
