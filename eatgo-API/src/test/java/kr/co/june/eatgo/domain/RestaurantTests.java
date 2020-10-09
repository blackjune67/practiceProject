package kr.co.june.eatgo.domain;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RestaurantTests {

    /*
     *  테스트 코드 작성시 assertThat으로 테스트를 사용할 수 있으며,
     * is를 사용하영 객체의 파라미터와 자신의 파라미터가 동일한지 테스트를 진행할 수 있다.
     *
     */

    @Test
    public void craetion() throws Exception {
        Restaurant restaurant = new Restaurant(1004L, "Bob zip", "Seoul");
        assertThat(restaurant.getId(), is(1004L));
        assertThat(restaurant.getName(), is("Bob zip"));
        assertThat(restaurant.getAddress(), is("Seoul"));

    }

    @Test
    public void information() {
        Restaurant RestaurantInformation = new Restaurant(1004L, "Bob zip", "Seoul");
        assertThat(RestaurantInformation.getInformation(), is("Bob zip in Seoul"));
    }
}
