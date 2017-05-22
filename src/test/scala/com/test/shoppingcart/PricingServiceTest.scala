package com.test.shoppingcart

import org.junit.Assert._
import org.junit




/**
  * Created by khurram on 16/05/2017.
  */

class PricingServiceTest{


  @junit.Test
  def testPriceOfApple() ={
    assertTrue(PricingService.getTotalPrice("Apple",1).amount ==0.6)
    assertTrue(PricingService.getTotalPrice("Apple",2).amount==0.6)
  }

  @junit.Test
  def testPriceOfOrange()= {
    assertTrue(PricingService.getTotalPrice("orange",2).amount==0.5)
    assertTrue(PricingService.getTotalPrice("orange",3).amount==0.5)
  }

  @junit.Test
  def testPriceOfSomethingElseIsZero() = {
    assert(PricingService.getTotalPrice("Banana",10).amount==0.0)
  }

}
