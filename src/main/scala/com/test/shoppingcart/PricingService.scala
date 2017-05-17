package com.test.shoppingcart

/**
  * Created by khurram on 17/05/2017.
  */
object PricingService {

  val APPLE = "apple"

  val ORANGE = "orange"

  def itemDetails(itemName : String ):Item= {
        def items: Map[String, Item] = Map((APPLE, new Item(APPLE,0.6,  BuyOneGetOneFree)), (ORANGE, new Item(ORANGE,0.25, ThreeForTwo )))
        def itemOffers: Option[Item] = items.get(itemName.toLowerCase())
        if (itemOffers == None ) new Item ("", 0.0,NoOffer) else itemOffers.get
    }


}
