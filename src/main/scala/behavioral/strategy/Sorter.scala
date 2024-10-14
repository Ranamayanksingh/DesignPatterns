package behavioral.strategy

class Sorter[T](sortStrategy: SortStrategy.Type[T]) {
  def sort(dataset:List[T])(implicit ord:Ordering[T]):List[T] = {
    sortStrategy(dataset)
  }
}
