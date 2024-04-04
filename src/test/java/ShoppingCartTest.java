import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.math.BigDecimal;

public class ShoppingCartTest {
    @Test
    void calculatePriceForWalkingPets(){
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(4, null, false, "brown", null, "Pepe", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(16.8));
    }

    @Test
    void calculatePriceForWine() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, false, null, null, "el tio juanillo", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(100.0));
    }

    @Test
    void calculatePriceForCheese() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, true, null, null, "French Camembert", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(50.0));
    }

    @Test
    void calculatePriceForFish_Blue(){
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "blue", BigDecimal.valueOf(0), null, null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(0.10));
    }

    @Test
    void calculatePriceForFish_Gold(){
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "gold", BigDecimal.valueOf(1), null, null);
        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(100.0));
    }

    @Test
    void calculatePriceForFish_Green(){
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "green", BigDecimal.valueOf(1), null, null);
        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(1.0));
    }
    
    @Test
    void calculatePriceForMagicCards_red() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "red", null, "Magic: The Gathering - Lightning Bolt", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(3.5));
    }

    @Test
    void calculatePriceForMagicCards_blue() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "blue", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(5.0));
    }

    @Test
    void calculatePriceForMagicCards_green() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "green", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(4.4));
    }

    @Test
    void calculatePriceForMagicCards_black() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "black", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(6.8));
    }

    @Test
    void calculatePriceForMagicCardsOtherColors() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "orange", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(2.0));
    }

}
