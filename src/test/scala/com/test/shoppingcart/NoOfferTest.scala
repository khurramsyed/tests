package com.test.shoppingcart

import junit.framework.Assert._
import org.junit

/**
  * Created by khurram on 17/05/2017.
  */
class NoOfferTest {


  @junit.Test
  def testPrice(): Unit ={

    assertEquals(NoOffer.price(5,0.5),2.5)
  }

}
