package com.test.shoppingcart

import junit.framework.Assert._
import org.junit

/**
  * Created by khurram on 17/05/2017.
  */
class BuyOneGetOneFreeTest {

  @junit.Test
  def testPriceFor5ISPriceOfTwoPlusPriceOfOne(): Unit ={

    assertEquals(BuyOneGetOneFree.price(5,0.5),2*0.5+0.5)
  }


  @junit.Test
  def testPriceFor2IsPriceOfOne(): Unit ={

    assertEquals(BuyOneGetOneFree.price(2,0.5),BuyOneGetOneFree.price(1,0.5))
  }

}
