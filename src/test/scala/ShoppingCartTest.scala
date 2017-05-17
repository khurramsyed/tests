package com.test.shoppingcart


import org.junit

/**
  * Created by khurram on 17/05/2017.
  */
class ShoppingCartTest {


  @junit.Test
  def testPriceOfAppleAndOrange() ={
    def cart : ShoppingCart  = new ShoppingCart();
    assert(cart.checkout(Array("Orange","Apple")) ==0.85)
  }

}
