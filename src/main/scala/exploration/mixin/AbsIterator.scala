package exploration.mixin

abstract class AbsIterator {
  type T
  def hasNext:Boolean
  def next : T
}
