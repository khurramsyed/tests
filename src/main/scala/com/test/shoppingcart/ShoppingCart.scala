package com.test.shoppingcart

/**
  * Created by khurram on 17/05/2017.
  */
class ShoppingCart {


  def checkout(items : Array[String]): Double = {

    lazy val countApple = items.filter(apple => apple.equalsIgnoreCase("Apple")).length
    lazy  val countOrange = items.filter(orange => orange.equalsIgnoreCase("Orange")).length
    countApple*0.6 + countOrange*0.25
  }
}
