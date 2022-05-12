package discounts;

import pl.pjait.Cart;
import pl.pjait.CartItem;

import java.util.ArrayList;

public class ThreeInPriceOfTwo implements ICanApplyDiscount
{

    public boolean canApplyDiscount(Cart cart)
    {
        return cart.sumOfProducts() > 2;
    }

    public void applyDiscount(Cart cart)
    {
        ArrayList<CartItem> cartItemsList = new ArrayList<>();
        CartItem min = cartItemsList.get(0);
        min.setCurrentPrice(0);
    }
}