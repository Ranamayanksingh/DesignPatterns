package behavioral.strategy

object Main extends App {
  val sorter = new Sorter(SortStrategy.bubbleSortStrategy[Int])
  val sortedList = sorter.sort(List(5,4,1,44,14,66))

}
