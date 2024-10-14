package exploration.mixin

object mixinMain {

  def main(array: Array[String]) = {
    val richStr = new StringIterator("Mayank")
    richStr.forEach(println)
  }

}
