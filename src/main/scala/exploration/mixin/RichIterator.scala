package exploration.mixin

trait RichIterator extends AbsIterator {
  def forEach(f:T => Unit):Unit = while(hasNext) {
    f(next)
  }
}


