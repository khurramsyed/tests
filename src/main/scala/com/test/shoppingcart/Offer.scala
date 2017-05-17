package com.test.shoppingcart

/**
  * Created by khurram on 17/05/2017.
  */
trait Offer {

  def price(totalItems : Int , price: Double):Double
}
