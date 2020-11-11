package kr.co.june.eatgo.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RestaurantRepositoryImpl implements RestaurantRepository {

    private List<Restaurant> restaurants = new ArrayList<>();

    public RestaurantRepositoryImpl() {
        restaurants.add(new Restaurant(1004L, "Bob zip", "Seoul"));
        restaurants.add(new Restaurant(2020L, "june zip", "Seoul"));
    }

    @Override
    public List<Restaurant> findAll() {
        return restaurants;
    }

    @Override
    public Restaurant findById(Long id) {

        return restaurants.stream().filter(s -> s.getId().equals(id))
                                            .findFirst()
                                            .orElse(null);
    }

    @Override
    public Restaurant save(Restaurant restaurant) {
        restaurant.setId(1234);
        restaurants.add(restaurant);
        return restaurant;
    }
}
