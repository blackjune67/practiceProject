package kr.co.june.eatgo.domain;

public class Restaurant {
    //private final String name;
    private String email;
    //private String email = "111111";
    private String storeName;
    private String region;

    public Restaurant(String storeName, String region) {
        //this.name = name;
        //this.email = email;
        this.storeName = storeName;
        this.region = region;
    }


/*    public String getName() {
        return name;
    }*/

    public String getEmail() {
        return email;
    }

    public String getInformation() {
        return storeName + " in " + region;
    }
}
