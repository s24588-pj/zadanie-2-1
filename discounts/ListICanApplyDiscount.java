package discounts;

import pl.pjait.Cart;

import java.util.ArrayList;
import java.util.List;

public class ListICanApplyDiscount implements ICanApplyDiscount
{
    private List<ICanApplyDiscount> allDiscounts;
    private List<ICanApplyDiscount> getAllDiscountsToApply;

    public ListICanApplyDiscount()
    {
        allDiscounts = new ArrayList<>();
        allDiscounts.add(new ThreeInPriceOfTwo());
        allDiscounts.add(new FreeCupDiscount());
        allDiscounts.add(new PercentDiscount(0.05));

        getAllDiscountsToApply = new ArrayList<>();
    }

    public boolean canApplyDiscount(Cart cart)
    {
        for (ICanApplyDiscount i : allDiscounts)
        {
            if (i.canApplyDiscount(cart)) getAllDiscountsToApply.add(i);
        }
        return !allDiscounts.isEmpty();
    }

    public void applyDiscount(Cart cart)
    {
        for (ICanApplyDiscount i : getAllDiscountsToApply) i.applyDiscount(cart);
    }
}