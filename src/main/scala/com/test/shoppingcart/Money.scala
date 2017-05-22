package com.test.shoppingcart


import scala.beans.BeanProperty

/**
  * Created by khurram on 22/05/2017.
  */
class Money (@BeanProperty var currency : String ="£", @BeanProperty var amount : BigDecimal =0.0) {

}
