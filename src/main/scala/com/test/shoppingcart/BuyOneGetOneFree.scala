package com.test.shoppingcart

/**
  * Created by khurram on 17/05/2017.
  */
object BuyOneGetOneFree extends Offer{

  override def price(totalItems: Int, price: Double):Double = {
     ((totalItems / 2) + (totalItems % 2)) * price
  }

}
