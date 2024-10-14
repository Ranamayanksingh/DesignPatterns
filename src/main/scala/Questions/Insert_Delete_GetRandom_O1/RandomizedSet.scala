package Questions.Insert_Delete_GetRandom_O1

import scala.collection.mutable.HashMap
import scala.util.Random

class RandomizedSet() {
  val hashMap = HashMap[Int,Int]()
  def insert(`val`: Int): Boolean = {
      if(hashMap.get(`val`)==None){
        hashMap.put(`val`,`val`)
        true
      } else {
        false
      }
  }

  def remove(`val`: Int): Boolean = {
      if(hashMap.get(`val`) == None){
        false
      } else {
        hashMap.remove(`val`)
        true
      }
  }

  def getRandom(): Int = {
    val rand = Random
    val keys = hashMap.keys.toSeq
    val randomKey  = rand.nextInt(keys.length)
    hashMap.get(randomKey).get
  }

}





