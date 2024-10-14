package behavioral.loan

object using {
  def apply[R <: {def close():Unit},T](resource: => R)(f:R => T) = {
    val source = Option(resource)
    try{
      f(source.get)
    } finally {
      for(s <- source){
        s.close()
      }
    }
  }
}

object locks {
  def apply[R <: {def close():Unit},T](resource: => R)(f:R => T):T = {
    val source = Option(resource)
    try{
      f(source.get)
    } finally {
      source.get.close()
    }
  }
}
