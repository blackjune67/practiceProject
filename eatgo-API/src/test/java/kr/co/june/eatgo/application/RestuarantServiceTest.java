package kr.co.june.eatgo.application;

import kr.co.june.eatgo.domain.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RestuarantServiceTest {


    private RestaurantService restuarantService;

    private RestaurantRepository restaurantRepository;
    private MenuItemRepository menuItemRepository;

    @Before
    public void setUp() {
        restaurantRepository = new RestaurantRepositoryImpl();
        menuItemRepository = new MenuItemRepositoryImpl();

        restuarantService = new RestaurantService(restaurantRepository, menuItemRepository);
    }


    @Test
    public void getRestaurant() {
        Restaurant restaurant =  restuarantService.getRestaurant(1004L);
        assertThat(restaurant.getId(), is(1004L));
        MenuItem menuItem = restaurant.getAddMenuItmes().get(0);
        assertThat(menuItem.getName(), is("Kimchi"));
    }

    @Test
    public void getRestaurants() {
        List<Restaurant> restaurants =  restuarantService.getRestaurants();

        Restaurant restaurant = restaurants.get(0);
        assertThat(restaurant.getId(), is(1004L));
    }
}