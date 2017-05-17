package com.test.shoppingcart

/**
  * Created by khurram on 17/05/2017.
  */
object NoOffer  extends Offer{
  override def price(totalItems: Int, price: Double): Double = return totalItems*price;
}
