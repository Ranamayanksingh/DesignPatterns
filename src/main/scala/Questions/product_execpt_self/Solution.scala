package Questions.product_execpt_self
import scala.collection.mutable.ArraySeq
object Solution {
  def productExceptSelf(nums: Array[Int]): Array[Int] = {
    val ans_product = Array.fill(nums.length)(0)
    var cummulativeProduct = 1

    for(i <- Range(0,nums.length,1)){
      ans_product(i) = cummulativeProduct
      cummulativeProduct = cummulativeProduct * nums(i)
    }

    cummulativeProduct = 1
    for(j <- Range(nums.length-1,-1,-1)){
      ans_product(j) = ans_product(j) * cummulativeProduct
      cummulativeProduct = cummulativeProduct * nums(j)
    }
    ans_product
  }

  def main(array: Array[String]):Unit = {
    val out = productExceptSelf(Array(-1,-1,0,3,-3))

  }
}
