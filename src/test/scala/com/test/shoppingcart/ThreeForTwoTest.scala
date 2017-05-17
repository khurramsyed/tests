package com.test.shoppingcart

import _root_.junit.framework.Assert.assertEquals
import org.junit

/**
  * Created by khurram on 17/05/2017.
  */
class ThreeForTwoTest {


  @junit.Test
  def testPrice(): Unit ={

    assertEquals(ThreeForTwo.price(5,0.5),2.0)
  }

}
