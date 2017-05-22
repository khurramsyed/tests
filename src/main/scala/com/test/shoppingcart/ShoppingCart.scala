package com.test.shoppingcart

/**
  * Created by khurram on 17/05/2017.
  */
class ShoppingCart {


  def checkout(items : Array[String]): BigDecimal = {
    lazy val countApple = items.count(apple => apple.equalsIgnoreCase(PricingService.APPLE))
    lazy  val countOrange = items.count(orange => orange.equalsIgnoreCase(PricingService.ORANGE))

    println(f"Apple Count is $countApple and Orange count is $countOrange")
    def totalApplePrice: Money =  PricingService.getTotalPrice(PricingService.APPLE,countApple)
    def totalOrangePrice: Money = PricingService.getTotalPrice(PricingService.ORANGE, countOrange)
    totalApplePrice.amount+totalOrangePrice.amount
  }
}
