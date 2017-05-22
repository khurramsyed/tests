package com.test.shoppingcart

/**
  * Created by khurram on 17/05/2017.
  */
object PricingService {

  val APPLE = "apple"

  val ORANGE = "orange"

  def getTotalPrice(itemName: String, count: Int): Money = {
    def items: Map[String, Item] = Map((APPLE, new Item(APPLE, new Money("£",0.6), buyOneGetOneFree)), (ORANGE, new Item(ORANGE, new Money("£",0.25), threeForTwo)))
    def repositoryItem: Option[Item] = items.get(itemName.toLowerCase())
    if (repositoryItem .isDefined) calculatePrice(count, repositoryItem.get.price, repositoryItem.get.offer) else new Money("£",0.0)


  }

  private def calculatePrice(count: Int, price: Money, offer: (Int, Money) => Money) = {
    offer(count, price)
  }

  private def buyOneGetOneFree(totalItems: Int, price: Money): Money = {
    new Money (price.getCurrency,((totalItems / 2) + (totalItems % 2)) * price.getAmount)
  }

  private def threeForTwo(totalItems: Int, price: Money): Money = {
    new Money(price.getCurrency, (2 * (totalItems / 3) + (totalItems % 3)) * price.getAmount)
  }

}