package kr.co.june.eatgo.domain;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
//import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RestaurantTests {

    @Test
    public void craetion() throws Exception {
        Restaurant restaurant = new Restaurant("Bob1", "Seoul");
        assertThat(restaurant.getName(), is("Bob1"));
        //assertThat(restaurant.getEmail(), is(""));
        assertThat(restaurant.getAddress(), is("Seoul"));
    }

    @Test
    public void information() {
        Restaurant RestaurantInformation = new Restaurant("Bob zip", "Seoul");
        assertThat(RestaurantInformation.getInformation(), is("Bob zip in Seoul"));
    }

    /*
    *  테스트 코드 작성시 assertThat으로 테스트를 사용할 수 있으며,
    * is를 사용하영 객체의 파라미터와 자신의 파라미터가 동일한지 테스트를 진행할 수 있다.
    * */
}
