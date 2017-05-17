package com.test.shoppingcart

/**
  * Created by khurram on 17/05/2017.
  */
object Main {

  def main(args: Array[String]) {
    def cart : ShoppingCart = new ShoppingCart()
    println(f"[ " + args.mkString(", ") + " ] => £" + cart.checkout(args))
  }
}
