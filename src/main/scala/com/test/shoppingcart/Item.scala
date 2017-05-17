package com.test.shoppingcart

/**
  * Created by khurram on 17/05/2017.
  */
class Item {
   var name: String = ""
   var price: Double = 0.0
   var offer: Offer = null

  def this(name: String, price: Double, theOffer: Offer) {
    this()
    this.name = name
    this.price = price
    this.offer = theOffer
  }


}
