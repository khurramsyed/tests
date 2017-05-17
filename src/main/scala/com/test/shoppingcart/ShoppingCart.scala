package com.test.shoppingcart

/**
  * Created by khurram on 17/05/2017.
  */
class ShoppingCart {


  def checkout(items : Array[String]): Double = {
    val priceList: Map[String, Double] = Map(("apple", 0.60), ("orange", 0.25))
    lazy val countApple :Int = items.filter(apple => apple.equalsIgnoreCase("Apple")).length
    lazy val countOrange :Int = items.filter(orange => orange.equalsIgnoreCase("Orange")).length
    countApple*priceList.getOrElse("apple",0.0) + countOrange*priceList.getOrElse("orange",0.0);
  }
}
