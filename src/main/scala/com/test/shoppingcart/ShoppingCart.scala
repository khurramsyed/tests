package com.test.shoppingcart

/**
  * Created by khurram on 17/05/2017.
  */
class ShoppingCart {


  def checkout(items : Array[String]): Double = {
    lazy val countApple = items.filter(apple => apple.equalsIgnoreCase(PricingService.APPLE)).length
    lazy  val countOrange = items.filter(orange => orange.equalsIgnoreCase(PricingService.ORANGE)).length

    println(f"Apple Count is $countApple and Orange count is $countOrange");
    def apple: Item =  PricingService.itemDetails(PricingService.APPLE);
    def orange: Item = PricingService.itemDetails(PricingService.ORANGE);
    def sum = apple.offer.price(countApple, apple.price) + orange.offer.price(countOrange,orange.price);
    println(f"Sum is $sum");
    sum
  }
}
