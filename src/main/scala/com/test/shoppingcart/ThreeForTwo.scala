package com.test.shoppingcart

/**
  * Created by khurram on 17/05/2017.
  */
object ThreeForTwo extends Offer {
  override def price(totalItems: Int, price: Double): Double = {
    (2 * (totalItems/3) + (totalItems %3)) * price
  }
}
