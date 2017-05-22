package com.test.shoppingcart

/**
  * Created by khurram on 17/05/2017.
  */
class Item {
   var name: String = ""
   var price: Money =_
   var offer:  (Int , Money) => Money = noOffer


  def noOffer(totalItems: Int, price: Money): Money = { new Money (price.getCurrency,totalItems * price.getAmount) }

  def this(name: String, price: Money =new Money("£",0.0), theOffer: (Int , Money) => Money) {
    this()
    this.name = name
    this.price = price
    this.offer = theOffer
  }


}
