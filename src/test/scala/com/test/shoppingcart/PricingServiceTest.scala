package com.test.shoppingcart

import junit.framework.Assert._
import org.junit




/**
  * Created by khurram on 16/05/2017.
  */

class PricingServiceTest{


  @junit.Test
  def testPriceOfApple() ={
    assertTrue(PricingService.itemDetails("Apple").offer== BuyOneGetOneFree)
    assertTrue(PricingService.itemDetails("Apple").offer== BuyOneGetOneFree)
  }

  @junit.Test
  def testPriceOfOrange()= {
    assertTrue(PricingService.itemDetails("Orange").offer== ThreeForTwo)
  }

  @junit.Test
  def testPriceOfSomethingElseIsZero() = {
    assert(PricingService.itemDetails("Banana").offer == NoOffer)
  }

}
