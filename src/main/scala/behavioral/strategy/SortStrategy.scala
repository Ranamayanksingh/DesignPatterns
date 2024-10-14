package behavioral.strategy

object SortStrategy {
  type Type[U] = List[U] => List[U]

  def bubbleSortStrategy[U](dataset:List[U])(implicit ord:Ordering[U]):List[U] = {
    println("sorting using bubble sort")
    dataset.sorted
  }

  def quickSortStrategy[U](dataset:List[U])(implicit ord:Ordering[U]):List[U] = {
    println("sorting using quick sort")
    dataset.sorted
  }

}
