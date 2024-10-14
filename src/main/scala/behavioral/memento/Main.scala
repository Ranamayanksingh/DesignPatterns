package behavioral.memento

import scala.collection.mutable

object Main extends App {
  val momentoStack = mutable.Stack[NotebookMomento]()
  val notebook = new Notebook

  notebook.write("I have a dream.. ")
  momentoStack.push(notebook.getMomento)
  notebook.show()

  notebook.write("I have  a dream that one day!!")
  momentoStack.push(notebook.getMomento)
  notebook.show()

  notebook.write("black boys and black girls willbe able to join hands")
  momentoStack.push(notebook.getMomento)
  notebook.show()

  notebook.setMomento(momentoStack.pop())
  notebook.show()

  notebook.setMomento(momentoStack.pop())
  notebook.show()



}
