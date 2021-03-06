package kh.com.camarket.service;

import kh.com.camarket.model.Cart;
import kh.com.camarket.model.CartItem;

/**
 * Created by Yuth on 3/29/2017.
 */
public interface CartItemService {

    void addCartItem(CartItem cartItem);
    void removeCartItem(CartItem cartItem);
    void removeAllCartItems(Cart cart);
    CartItem getCartItemByProductId(int productId);
}
