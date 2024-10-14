package Questions

object hIndex {
  def main(args:Array[String]) = {
    val citations =  Array(3,0,6,1,5)
    val sortedCitation = citations.toSeq.sorted.reverse
    println(sortedCitation)
    var maxCitation = -1
    var count = 0
    sortedCitation.foreach(x => {
      count +=  1
      if(x >= count){
        maxCitation = x
      }
    })
    println(maxCitation)

  }
}
