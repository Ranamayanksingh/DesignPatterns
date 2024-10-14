package structural.magnet

class Doubling {
  def double(magent:DoubleMagnet):magent.Result = magent()
}


trait DoubleMagnet {
  type Result
  def apply():Result
}

object DoubleMagnet {
  implicit class fromInt(x:Int) extends DoubleMagnet {
    override type Result = Int
    override def apply(): Result = x*2
  }

  implicit class fromListInt(ls:List[Int]) extends DoubleMagnet {
    override type Result = List[Int]
    override def apply(): Result = ls.map(_ * 2)
  }

  implicit class fromListString(ls:List[String]) extends DoubleMagnet {
    override type Result = List[String]
    override def apply(): Result = ls ++ ls
  }

  implicit class fromStringIntTuple(para:Tuple2[String,Int]) extends DoubleMagnet {
    override type Result = String
    override def apply(): Result = para._1 * para._2
  }
}