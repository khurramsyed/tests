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


  @junit.Test
  def testPriceOf2ApplesAndOneOrange() ={
    def cart : ShoppingCart  = new ShoppingCart();
    assert(cart.checkout(Array("Orange","Apple","Apple")) ==0.85)
  }

  @junit.Test
  def testPriceOf4ApplesAndOneOrange() ={
    def cart : ShoppingCart  = new ShoppingCart();
    assert(cart.checkout(Array("Orange","Apple","Apple","Apple","Apple")) ==1.45)
  }
}
